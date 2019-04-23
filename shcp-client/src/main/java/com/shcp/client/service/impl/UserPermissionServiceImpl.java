package com.shcp.client.service.impl;

import com.shcp.client.service.UserPermissionService;
import com.shcp.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Yuki
 * @date 2019/4/21 19:49
 */
@Slf4j
@Service
public class UserPermissionServiceImpl implements UserPermissionService{

    @Override
    public String permissionValidate(User user, long functionId) {
        return user.getUid() + "execute functionId" + functionId;
    }
}
