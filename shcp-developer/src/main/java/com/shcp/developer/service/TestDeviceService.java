package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Developer;

/**
 * @author Yuki
 * @date 2019/4/18 10:41
 */
public interface TestDeviceService {

    /**
     * 添加一个测试设备
     * @param tbDeveloper 对应的开发者信息
     * @param tdeName   测试设备名称
     * @param ipaddr    IP地址
     * @param port  端口
     * @param tdemac    MAC地址
     * @return 响应信息
     */
    ShcpResult addTestDevice(Developer tbDeveloper, String tdeName, String ipaddr, int port, String tdemac);

    ShcpResult addTestDeviceType(Developer tbDeveloper, String tdesName);

    ShcpResult addTestDeviceStatus(Long tdsID, String tdesName, String tdesType, String tdesDefaultValue, String tdesMinValue, String tdesMaxValue);

    ShcpResult addTestDeviceLimit(Long tdsID, String tdelName, String tdelKey, String tdelValue);

    ShcpResult addTestDeviceControl(Long tdsID, String tdecName, String tdecKey, String tdecValue);

    /**
     * 根据参数是否为0来判断是查询一个还是查询全部
     * @param tdeID 测试设备编号
     * @return 响应内容
     */
    ShcpResult searchTestDevice(Long tdeID);

    ShcpResult searchTestDeviceType(long TDSID);

    ShcpResult searchTestDeviceStatus(long TDESID);

    ShcpResult searchTestDeviceControl(long TDECID);

    ShcpResult searchTestDeviceLimit(long TDELID);

    ShcpResult getAllTestDeviceTypes(Developer developer);

    ShcpResult searchTestDevice(Developer developer, int page, int rows);

    ShcpResult searchTestDeviceStatus(long TDSID, int page, int rows);

    ShcpResult searchTestDeviceControl(long TDSID, int page, int rows);

    ShcpResult searchTestDeviceLimit(long TDSID, int page, int rows);
}
