package com.shcp.manager.service.impl;

import com.shcp.dao.mapper.AdminMapper;
import com.shcp.manager.service.AdminService;
import com.shcp.pojo.Admin;
import com.shcp.pojo.AdminExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/4/6 16:19
 */
@Slf4j
@Service
public class AdminServiceImpl implements AdminService{

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin login(String userName, String password, String TerID) {
        Admin admin = new Admin();
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria()
                .andAnameEqualTo(userName)
                .andApasswordEqualTo(password);
        log.info("username:{} password:{} platform:{} login success", userName, password, TerID);
        return adminMapper.selectByExample(adminExample).get(0);
    }
}
