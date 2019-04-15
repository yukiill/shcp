package com.shcp.client.service;

import com.shcp.common.pojo.ShcpResult;

/**
 * @author Yuki
 * @date 2019/4/1 20:46
 */
public interface DeviceService {

    ShcpResult getDeviceListByUserId(Long userId);

    ShcpResult bindDevice(Long dstID, TbUser tbUser);

    ShcpResult getDeviceStatus(Long deviceID);
}
