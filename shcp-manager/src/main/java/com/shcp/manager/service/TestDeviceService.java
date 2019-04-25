package com.shcp.manager.service;

import com.shcp.common.pojo.ShcpResult;

/**
 * @author Yuki
 * @date 2019/4/25 20:29
 */
public interface TestDeviceService {

    //设备相关
    ShcpResult searchTestDevice(String wd, String type);

    ShcpResult getTestDeviceById(long TDEID);

    ShcpResult deleteTestDeviceById(long TDEID);

    ShcpResult getAllTestDevices(int page, int rows);

    //设备类型相关
    ShcpResult getAllTestDeviceTypes(int page, int rows);

    ShcpResult getTestDeviceTypeById(long TDSID);

    ShcpResult modifyTestDeviceTypeName(long TDSID, String desName);


    //设备状态相关
    ShcpResult getAllTestDeviceStatus(int page, int rows);

    ShcpResult getTestDeviceStatusById(long TDESID);

    ShcpResult modifyTestDeviceStatus(long TDESID, String desName, String desType, String desDefaultValue,
                                  String desMinValue, String desMaxValue);

    ShcpResult deleteTestDeviceStatus(long TDESID);

    //设备权限相关
    ShcpResult getAllTestDeviceLimits(int page, int rows);

    ShcpResult getTestDeviceLimitById(long TDELID);

    ShcpResult modifyTestDeviceLimit(long TDELID, String tdelName, String tdelKey, String tdelValue);

    ShcpResult deleteTestDeviceLimit(long TDELID);

    //设备控制字段相关
    ShcpResult getAllTestDeviceControls(int page, int rows);

    ShcpResult getTestDeviceControlsById(long TDECID);

    ShcpResult modifyTestDeviceControl(long TDECID, String tdecName, String tdecKey, String tdecValue);

    ShcpResult deleteTestDeviceControl(long TDECID);
}
