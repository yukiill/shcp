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

    /**
     * 提交审核信息
     * @param dcName 组织名称
     * @param dcAddr 开发者地址
     * @return 相应结果
     */
    ShcpResult submitExamine(String dcName, String dcAddr);

    ShcpResult changePwd(TbDeveloper tbDeveloper);

    boolean emailIsPresent(String email);

}
