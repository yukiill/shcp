package com.shcp.manager.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Admin;

/**
 * @author Yuki
 * @date 2019/4/6 16:17
 */
public interface AdminService {

    Admin login(String userName, String password, String TerID);
}
