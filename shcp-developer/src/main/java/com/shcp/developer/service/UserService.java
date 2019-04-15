package com.shcp.developer.service;

import com.shcp.pojo.TbUser;

/**
 * @author Yuki
 * @date 2019/4/11 21:24
 */
public interface UserService {

    TbUser searchUser(String keyWord, String type);
}
