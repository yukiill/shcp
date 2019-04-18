package com.shcp.developer.service;

import com.shcp.pojo.User;

/**
 * @author Yuki
 * @date 2019/4/11 21:24
 */
public interface UserService {

    User searchUser(String keyWord, String type);

//    ShcpResult modifiUserInfo();
}
