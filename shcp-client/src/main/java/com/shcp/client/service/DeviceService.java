package com.shcp.client.service;

import com.shcp.client.annotation.ValidatePermission;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.User;

/**
 * @author Yuki
 * @date 2019/4/1 20:46
 */
public interface DeviceService {

    ShcpResult getDeviceListByUserId(Long userId);

    ShcpResult bindDevice(Long dstID, User user);

    ShcpResult getDeviceStatus(Long deviceID);
}
