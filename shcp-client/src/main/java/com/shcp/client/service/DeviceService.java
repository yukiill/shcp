package com.shcp.client.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.TbDevice;

import java.util.List;

/**
 * @author Yuki
 * @date 2019/4/1 20:46
 */
public interface DeviceService {

    ShcpResult getDeviceListByUserId(Long userId);
}
