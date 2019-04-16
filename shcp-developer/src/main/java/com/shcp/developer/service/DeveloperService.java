package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.TbDeveloper;

/**
 * @author Yuki
 * @date 2019/4/6 17:11
 */
public interface DeveloperService {

    TbDeveloper devLogin(String username, String password, String TerID);

    TbDeveloper devRegister(String username, String password, String email, String TerID);

    Boolean devNameIsPresent(String username);

    Boolean devCancellation(Long DEId);

    ShcpResult changePwd(TbDeveloper tbDeveloper);

    boolean emailIsPresent(String email);

}
