package com.shcp.client.service.impl;

import com.shcp.client.service.UserService;
import com.shcp.client.utils.FileUtil;
import com.shcp.client.utils.IdGenerator;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.FeedbackMapper;
import com.shcp.dao.mapper.ReplyMapper;
import com.shcp.dao.mapper.UserMapper;
import com.shcp.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/3/24 15:23
 */
@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;
    @Resource
    private FeedbackMapper feedbackMapper;
    @Resource
    private ReplyMapper replyMapper;

    @Override
    public User login(String userName, String password, String TerID) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andUsernameEqualTo(userName)
                .andPasswordEqualTo(password);
        List<User> tbUserList = userMapper.selectByExample(example);
        if(tbUserList.size() > 0 ){
            log.info("username:{} platform:{} login success", userName, TerID);
            return tbUserList.get(0);
        }
        return null;
    }

    @Override
    public User register(String userName, String password, String email, String TerID) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword(password);
        user.setEmail(email);
        user.setDid((long) 0);
        user.setImg(FileUtil.DEFAULT_IMAGE_URL);
        user.setBirth(null);
        user.setUid(IdGenerator.generateUserId());
        log.info("register user:{} platform:{} success ", userName, TerID);
        return user;
    }

    @Override
    public Boolean usernameIsPresent(String username) {
        String result = userMapper.selectByUsername(username);
        return !StringUtils.isEmpty(result);
    }

    @Override
    public Boolean changeInfo(User user, String email, String birthday, String introduction, String sex) {
        boolean isChanged = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(!StringUtils.isEmpty(email) && !Objects.equals(email, user.getEmail())){
            isChanged = true;
            user.setEmail(email);
        }
        if(!StringUtils.isEmpty(introduction) && !Objects.equals(introduction, user.getIntroduce())){
            isChanged = true;
            user.setIntroduce(introduction);
        }
        Date newBirth;
        try {
            newBirth = dateFormat.parse(birthday);
        } catch (ParseException e) {
            newBirth = user.getBirth();
            log.info("format date has occurred error message:{}", e.getMessage());
        }
        if(!StringUtils.isEmpty(birthday) && Objects.equals(user.getBirth().toString(), birthday)){
            isChanged = true;
            user.setBirth(newBirth);
        }
        if(isChanged){
            userMapper.updateByPrimaryKeySelective(user);
            log.info("userId:{} change userinfo success", user.getUid());
        }
        return true;
    }

    @Override
    public Boolean changeImg(User user) {
        log.info("userId:{} upload headImage success, filepath:{}", user.getUid(), user.getImg());
        return userMapper.updateByPrimaryKeySelective(user) == 1;
    }

    @Override
    public Boolean cancellation(Long userId) {
        log.info("userId:{} cancel account success", userId);
        return userMapper.deleteByPrimaryKey(userId) == 1;
    }

    @Override
    public ShcpResult submitFeedback(User user, String content, String title, Short type) {
        //TODO 应该新加一个开发者ID参数
        Feedback feedback = new Feedback();
        feedback.setFcontent(content);
        feedback.setFromUserId(user.getUid());
        feedback.setFromUserType((byte) 1);
        feedback.setFid(IdGenerator.generateFeedbackId());
        feedback.setFtitle(title);
        feedback.setIsCheck((byte) 0);
        feedback.setIsReply((byte) 0);
        feedbackMapper.insertSelective(feedback);
        log.info("userId:{} submit feedback success", user.getUid());
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getUserInfo(Long userId) {
        if(Objects.isNull(userId)){
            return ShcpResult.build(705, "用户状态异常");
        }
        User user = userMapper.selectByPrimaryKey(userId);
        log.info("userId:{} obtain userinfo", userId);
        return ShcpResult.ok(user);
    }

    @Override
    public ShcpResult changePwd(User user, String nPwd) {
        user.setPassword(nPwd);
        userMapper.updateByPrimaryKeySelective(user);
        log.info("userId:{} change pwd success", user.getUid());
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult forgetPwd(String newPass, String email) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andEmailEqualTo(email);
        User user = userMapper.selectByExample(example).get(0);
        if(Objects.isNull(user))
        {
            log.info("email:{} haven't opposite user", email);
            return ShcpResult.build(659, "用户未注册");
        }
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getAllReplies(Long UID, String UfbID) {
        Long FID = null;
        if(!StringUtils.isEmpty(UfbID)){
            FID = Long.parseLong(UfbID);
        }
//        List<Reply> tbReplies = replyMapper.getAllRepliesWithBLOBs(UID, FID);
        //TODO 应该拆分成分页和单独查询。
        ReplyExample replyExample = new ReplyExample();
        replyExample.createCriteria()
                .andToUserIdEqualTo(UID);
        List<Reply> tbReplies = replyMapper.selectByExample(replyExample);
        log.info("UID:{} query replyID:{} success", UID, UfbID);
        return ShcpResult.ok(tbReplies);
    }

    @Override
    public Boolean emailIsPresent(String email) {
        return !StringUtils.isEmpty(userMapper.selectByEmail(email));
    }
}
