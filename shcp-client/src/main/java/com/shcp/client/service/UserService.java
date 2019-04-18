package com.shcp.client.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.User;

/**
 * @author Yuki
 * @date 2019/3/24 15:22
 */
public interface UserService {

    User login(String userName, String password, String TerID);

    User register(String userName, String password, String email, String TerID);

    Boolean usernameIsPresent(String username);

    Boolean emailIsPresent(String email);

    Boolean changeInfo(User user, String email, String birthday, String introduction, String sex);

    Boolean changeImg(User user);

    Boolean cancellation(Long userId);

    ShcpResult submitFeedback(User user, String content, String title, Short type);

    ShcpResult getUserInfo(Long userId);

    ShcpResult changePwd(User user, String nPwd);

    ShcpResult forgetPwd(String newPass, String email);

    ShcpResult getAllReplies(Long UID, String UfbID);
}
