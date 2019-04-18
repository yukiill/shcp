package com.shcp.developer.service.impl;

import com.shcp.dao.mapper.UserMapper;
import com.shcp.developer.service.UserService;
import com.shcp.pojo.User;
import com.shcp.pojo.UserExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/15 16:25
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User searchUser(String keyWord, String type) {
        UserExample tbUserExample = new UserExample();
        User tbUser = null;
        //暂定t为使用用户名查询
        if(Objects.equals("t", type)){
            tbUserExample.createCriteria().andUsernameEqualTo(keyWord);
            tbUser = userMapper.selectByExample(tbUserExample).get(0);
        } else if(Objects.equals("q", type)){   //q为用户编号
            tbUserExample.createCriteria().andUidEqualTo(Long.parseLong(keyWord));
            tbUser = userMapper.selectByExample(tbUserExample).get(0);
        }
        log.info("adopt keyword:{} type:{} search user");
        return tbUser;
    }
}
