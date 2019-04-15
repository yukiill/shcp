package com.shcp.developer.service.impl;

import com.shcp.dao.mapper.TbUserMapper;
import com.shcp.developer.service.UserService;
import com.shcp.pojo.TbUser;
import com.shcp.pojo.TbUserExample;
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
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser searchUser(String keyWord, String type) {
        TbUserExample tbUserExample = new TbUserExample();
        TbUser tbUser = null;
        //暂定t为使用用户名查询
        if(Objects.equals("t", type)){
            tbUserExample.createCriteria().andUsernameEqualTo(keyWord);
            log.info("adopt keyword:{} type:{} search user");
            tbUser = tbUserMapper.selectByExample(tbUserExample).get(0);
        } else if(Objects.equals("q", type)){   //q为用户编号
            tbUserExample.createCriteria().andUidEqualTo(Long.parseLong(keyWord));
            tbUser = tbUserMapper.selectByExample(tbUserExample).get(0);
        }
        return tbUser;
    }
}
