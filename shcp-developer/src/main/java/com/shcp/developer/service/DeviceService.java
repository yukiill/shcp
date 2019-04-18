package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Developer;
import com.shcp.pojo.Device;

/**
 * @author Yuki
 * @date 2019/4/15 17:11
 */
public interface DeviceService {

    Device searchDevice(String Dsid);

    ShcpResult addDevice(Developer tbDeveloper, String Dsid, String DSname, String DStype, String DSmac, boolean isTest);

    ShcpResult deleteDevice(String Dsid);

    ShcpResult addDeviceType(String DSTypeName);

    ShcpResult addDeviceStatus(Long tid, String desname, String destype, String defaultValue, String minValue, String maxValue);

    ShcpResult addDevCtrl(Long DSTypeID, String DsCtrlName, String DsCtrlKey, String DsCtrlValue, String DsCtrlValTy);
}
