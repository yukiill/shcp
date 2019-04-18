package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Developer;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Yuki
 * @date 2019/4/15 20:18
 */
public interface DeviceExamineService {

    /**
     * 添加一个新的设备审核
     * @param DSEName 审核设备的名称
     * @param DESType 设备类型
     * @param DSETestID 测试设备的ID
     * @param DSEFile 设备审核的文件
     * @return 响应信息
     */
    ShcpResult addDeviceExamine(Developer tbDeveloper, String DSEName, String DESType, String DSETestID, MultipartFile DSEFile);

    /**
     * 查看设备的审核状态，默认是所有，否则根据测试设备编号来检索
     * @param DSEXID 设备审核编号
     * @return 响应信息
     */
    ShcpResult showDeviceExamineStatus(String DSEXID);


}
