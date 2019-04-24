package com.shcp.manager.service;

import com.shcp.common.pojo.ShcpResult;

/**
 * @author Yuki
 * @date 2019/4/6 16:16
 */
public interface UserService {

    /**
     * 根据关键字和关键字类型来检索对象
     * @param wd 关键字
     * @param type 关键字类型，q为用户编号，p为用户名称
     * @return 响应信息
     */
    ShcpResult getUsers(String wd, String type);

    ShcpResult getUserByUid(long UID);

    ShcpResult getAllUsers(int page, int rows);

    ShcpResult modifyUserInfo(long UID);

    ShcpResult addUserLimitForUser(long UID, String ULname);

    ShcpResult getUserLimitById(short ULID);

    ShcpResult addUserLimit(String ULname);

    ShcpResult deleteUserLimit(short ULID);

    ShcpResult modifyUserLimit(short ULID, String ULname);

    ShcpResult getAllUserLimit(int page, int rows);

    ShcpResult getUserLimitsByUID(long UID);
}
