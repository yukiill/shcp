package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.TbDeveloper;

/**
 * @author Yuki
 * @date 2019/4/18 10:41
 */
public interface TestDeviceSevice {

    ShcpResult addTestDevice(TbDeveloper tbDeveloper, String tdeName, String ipaddr, String port, String tdemac);

    /**
     * 根据参数是否为0来判断是查询一个还是查询全部
     * @param tdeID 测试设备编号
     * @return 响应内容
     */
    ShcpResult searchTestDevice(Long tdeID);

    ShcpResult addTestDeviceType(TbDeveloper tbDeveloper, String tdesName);

    ShcpResult addTestDeviceStatus(Long tdsID, String tdesName, String tdesType, String tdesDefaultValue, String tdesMinValue, String tdesMaxValue);

    ShcpResult addTestDeviceLimit(Long tdsID, String tdelName, String tdelKey, String tdelValue);

    ShcpResult addTestDeviceControl(Long tdsID, String tdeName,)
}
