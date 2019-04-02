package com.shcp.client.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.TbUser;

/**
 * @author Yuki
 * @date 2019/3/24 15:22
 */
public interface UserService {

    TbUser login(String userName, String password, String TerID);

    TbUser register(String userName, String password, String email, String TerID);

    Boolean usernameIsPresent(String username);

    Boolean changeInfo(Long userId, String email, String birthday, String introduction, String sex);

    Boolean changeImg(TbUser tbUser);

    Boolean cancellation(Long userId);

    ShcpResult submitFeedback(TbUser tbUser, String contet, String title, Short type);

    ShcpResult getUserInfo(Long userId);

    ShcpResult changePwd(TbUser tbUser);
}