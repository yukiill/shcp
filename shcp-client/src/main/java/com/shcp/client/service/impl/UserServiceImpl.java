package com.shcp.client.service.impl;

import com.shcp.client.service.UserService;
import com.shcp.client.utils.FileUtil;
import com.shcp.client.utils.IdGenerator;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.TbReplyMapper;
import com.shcp.dao.mapper.TbUserMapper;
import com.shcp.dao.mapper.TbUserfeedbackMapper;
import com.shcp.pojo.TbReply;
import com.shcp.pojo.TbUser;
import com.shcp.pojo.TbUserExample;
import com.shcp.pojo.TbUserfeedback;
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
    private TbUserMapper tbUserMapper;
    @Resource
    private TbUserfeedbackMapper tbUserfeedbackMapper;
    @Resource
    private TbReplyMapper tbReplyMapper;

    @Override
    public TbUser login(String userName, String password, String TerID) {
        TbUserExample example = new TbUserExample();
        example.createCriteria()
                .andUsernameEqualTo(userName)
                .andPasswordEqualTo(password);
        List<TbUser> tbUserList = tbUserMapper.selectByExample(example);
        if(tbUserList.size() > 0 ){
            log.info("username:{} platform:{} login success", userName, TerID);
            return tbUserList.get(0);
        }
        return null;
    }

    @Override
    public TbUser register(String userName, String password, String email, String TerID) {
        TbUser tbUser = new TbUser();
        tbUser.setUsername(userName);
        tbUser.setPassword(password);
        tbUser.setUemail(email);
        tbUser.setDid((long) 0);
        tbUser.setUhimg(FileUtil.DEFAULT_IMAGE_URL);
        tbUser.setUbirth(null);
        tbUser.setLid((short) 0);
        tbUser.setUid(IdGenerator.generateUserId());
        log.info("register user:{} platform:{} success ", userName, TerID);
        return tbUser;
    }

    @Override
    public Boolean usernameIsPresent(String username) {
        String result = tbUserMapper.selectByUsername(username);
        return !StringUtils.isEmpty(result);
    }

    @Override
    public Boolean changeInfo(TbUser tbUser, String email, String birthday, String introduction, String sex) {
        boolean isChanged = false;
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if(!StringUtils.isEmpty(email) && !Objects.equals(email, tbUser.getUemail())){
            isChanged = true;
            tbUser.setUemail(email);
        }
        if(!StringUtils.isEmpty(introduction) && !Objects.equals(introduction, tbUser.getUintroduce())){
            isChanged = true;
            tbUser.setUintroduce(introduction);
        }
        Date newBirth;
        try {
            newBirth = dateFormat.parse(birthday);
        } catch (ParseException e) {
            newBirth = tbUser.getUbirth();
            log.info("format date has occurred error message:{}", e.getMessage());
        }
        if(!StringUtils.isEmpty(birthday) && Objects.equals(tbUser.getUbirth().toString(), birthday)){
            isChanged = true;
            tbUser.setUbirth(newBirth);
        }
        if(isChanged){
            tbUserMapper.updateByPrimaryKeySelective(tbUser);
            log.info("userId:{} change userinfo success", tbUser.getUid());
        }
        return true;
    }

    @Override
    public Boolean changeImg(TbUser tbUser) {
        log.info("userId:{} upload headImage success, filepath:{}", tbUser.getUid(), tbUser.getUhimg());
        return tbUserMapper.updateByPrimaryKeySelective(tbUser) == 1;
    }

    @Override
    public Boolean cancellation(Long userId) {
        log.info("userId:{} cancel account success", userId);
        return tbUserMapper.deleteByPrimaryKey(userId) == 1;
    }

    @Override
    public ShcpResult submitFeedback(TbUser tbUser, String content, String title, Short type) {
        TbUserfeedback tbUserfeedback = new TbUserfeedback();
        tbUserfeedback.setFcontent(content);
        tbUserfeedback.setDid(tbUser.getDid());
        tbUserfeedback.setFid(IdGenerator.generateFeedbackId());
        tbUserfeedback.setFutype(type);
        tbUserfeedback.setUid(tbUser.getUid());
        tbUserfeedback.setFreply((byte) 0);
        tbUserfeedback.setFcheck((byte) 0);
        tbUserfeedbackMapper.insertSelective(tbUserfeedback);
        log.info("userId:{} submit feedback success", tbUser.getUid());
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getUserInfo(Long userId) {
        if(Objects.isNull(userId)){
            return ShcpResult.build(705, "用户状态异常");
        }
        TbUser tbUser = tbUserMapper.selectByPrimaryKey(userId);
        log.info("userId:{} obtain userinfo", userId);
        return ShcpResult.ok(tbUser);
    }

    @Override
    public ShcpResult changePwd(TbUser tbUser, String nPwd) {
        tbUser.setPassword(nPwd);
        tbUserMapper.updateByPrimaryKeySelective(tbUser);
        log.info("userId:{} change pwd success", tbUser.getUid());
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult forgetPwd(String newPass, String email) {
        TbUserExample example = new TbUserExample();
        example.createCriteria()
                .andUemailEqualTo(email);
        TbUser tbUser = tbUserMapper.selectByExample(example).get(0);
        if(Objects.isNull(tbUser))
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
        List<TbReply> tbReplies = tbReplyMapper.getAllRepliesWithBLOBs(UID, FID);
        log.info("UID:{} query replyID:{} success", UID, UfbID);
        return ShcpResult.ok(tbReplies);
    }

    @Override
    public Boolean emailIsPresent(String email) {
        return !StringUtils.isEmpty(tbUserMapper.selectByEmail(email));
    }
}
