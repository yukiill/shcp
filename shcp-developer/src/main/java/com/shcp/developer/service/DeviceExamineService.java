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
     * 添加一个设备的审核
     * @param developer 提交审核的开发者
     * @param examineName 审核名称
     * @param testDeviceId 测试设备ID
     * @param examineInfo 附带的文件
     * @return 响应信息
     */
    ShcpResult addDeviceExamine(Developer developer, String examineName, long testDeviceId, MultipartFile examineInfo);

    /**
     * 查看设备的审核状态，默认是所有，否则根据测试设备编号来检索
     * @param developer 开发者
     * @param page 页数
     * @param rows 单页容量
     * @return 响应信息
     */
    ShcpResult showDeviceExamine(Developer developer, int page, int rows);

    ShcpResult findDeviceExamineById(long DEID);

    ShcpResult modifyDeviceExamine(Developer developer, long DEID, String examineName, long testDeviceId, MultipartFile examineInfo);
}
