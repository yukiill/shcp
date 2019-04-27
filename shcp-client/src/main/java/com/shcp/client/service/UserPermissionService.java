package com.shcp.client.service;

import com.shcp.pojo.User;

/**
 * @author Yuki
 * @date 2019/4/21 19:48
 */
public interface UserPermissionService {

    String permissionValidate(User user, long functionId);
}
