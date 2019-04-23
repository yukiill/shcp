package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Developer;
import com.shcp.pojo.Device;

/**
 * @author Yuki
 * @date 2019/4/15 17:11
 */
public interface DeviceService {

    Device searchDevice(long deid);

    ShcpResult addDevice(Developer tbDeveloper, String deName, String deMac, long DETID, long DEID);

    ShcpResult deleteDevice(long DEID);

    ShcpResult addDeviceType(String DSTypeName);

    ShcpResult addDeviceStatus(Long DETID, String desname, String destype, String defaultValue, String minValue, String maxValue);

    ShcpResult addDevCtrl(Long DETID, String decName, String decKey, String decValue, String decType);
}
