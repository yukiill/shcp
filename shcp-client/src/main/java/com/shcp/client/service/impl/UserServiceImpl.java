package com.shcp.client.service.impl;

import com.shcp.client.service.UserService;
import com.shcp.client.utils.IdGenerator;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.TbUserMapper;
import com.shcp.dao.mapper.TbUserfeedbackMapper;
import com.shcp.pojo.TbUser;
import com.shcp.pojo.TbUserExample;
import com.shcp.pojo.TbUserfeedback;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/3/24 15:23
 */
@Slf4j
@Service("userService")
public class UserServiceImpl implements UserService{

    private static final String DEFAULT_IMAGE_URL= "C:/Users/Yuki/Desktop/photo/default.jpg";

    private TbUserMapper tbUserMapper;
    private TbUserfeedbackMapper tbUserfeedbackMapper;

    @Autowired
    public UserServiceImpl(TbUserMapper tbUserMapper){
        this.tbUserMapper = tbUserMapper;
    }

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
        tbUser.setUhimg(DEFAULT_IMAGE_URL);
        tbUser.setUbirth(null);
        tbUser.setUlimit((short) 11);
        tbUser.setUtype((byte) 0);
        tbUser.setUid(IdGenerator.generateUserId());
        log.info("register user:{} platform:{} success ", userName, TerID);
        return tbUser;
    }

    @Override
    public Boolean usernameIsPresent(String username) {
        String result = tbUserMapper.selectByUsername(username);
        return !Objects.isNull(result) && ! Objects.equals("", username);
    }

    @Override
    public Boolean changeInfo(Long userId, String email, String birthday, String introduction, String sex) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        TbUser tbUser = new TbUser();
        tbUser.setUid(userId);
        tbUser.setUemail(email);
        tbUser.setUintroduce(introduction);
        try {
            tbUser.setUbirth(dateFormat.parse(birthday));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        log.info("userId:{} change userinfo success", userId);
        return tbUserMapper.updateByPrimaryKeySelective(tbUser) == 1;
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
    public ShcpResult submitFeedback(TbUser tbUser, String contet, String title, Short type) {
        TbUserfeedback tbUserfeedback = new TbUserfeedback();
        tbUserfeedback.setFcontent(contet);
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
    public ShcpResult changePwd(TbUser tbUser) {
        tbUserMapper.updateByPrimaryKeySelective(tbUser);
        log.info("userId:{} change pwd success", tbUser.getUid());
        return ShcpResult.ok();
    }
}
