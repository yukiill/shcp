package com.shcp.developer.service.impl;

import com.shcp.dao.mapper.TbUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/4/15 16:25
 */
@Slf4j
@Service
public class UserServiceImpl {

    @Resource
    private TbUserMapper tbUserMapper;
}
