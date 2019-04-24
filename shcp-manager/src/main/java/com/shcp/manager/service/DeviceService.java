package com.shcp.manager.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Device;
import com.shcp.pojo.DeviceLimit;
import com.shcp.pojo.DeviceStatus;
import com.shcp.pojo.DeviceType;

/**
 * @author CYZ
 * @date 2019/4/16 20:05
 */
public interface DeviceService {

    //设备相关
    ShcpResult searchDevice(String wd, String type);

    ShcpResult getDeviceById(long DEID);

    ShcpResult deleteDeviceById(long DEID);

    ShcpResult getAllDevices(int page, int rows);

    //设备类型相关
    ShcpResult getAllDeviceTypes(int page, int rows);

    ShcpResult getDeviceTypeById(long DETID);

    ShcpResult modifyDeviceTypeName(long DETID, String desName);

    ShcpResult modifyDeviceTypeStatus(long DETID, byte is_open);


    //设备状态相关
    ShcpResult getAllDeviceStatus(int page, int rows);

    ShcpResult getDeviceStatusById(long DESID);

    ShcpResult modifyDeviceStatus(long DESID, String desName, String desType, String desDefaultValue,
                                  String desMinValue, String desMaxValue);

    ShcpResult deleteDeviceStatus(long DESID);

    //设备权限相关
    ShcpResult getAllDeviceLimits(int page, int rows);

    ShcpResult getDeviceLimitById(long DELID);

    ShcpResult modifyDeviceLimit(long DELID, String delName, String delKey, String delValue);

    ShcpResult addDeviceLimitToDevice(long DEID, long DELID);

    ShcpResult deleteDeviceLimitToDevice(long DEID, long DELID);

    ShcpResult deleteDeviceLimit(long DELID);

    //设备控制字段相关
    ShcpResult getAllDeviceControls(int page, int rows);

    ShcpResult getDeviceControlsById(long DECID);

    ShcpResult modifyDeviceControl(long DECID, String decName, String decKey, String decValue);

    ShcpResult deleteDeviceControl(long DECID);
}
