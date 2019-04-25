package com.shcp.manager.service;

import com.shcp.common.pojo.ShcpResult;

/**
 * @author Yuki
 * @date 2019/4/25 11:45
 */
public interface DeviceExamineService {

    ShcpResult getAllDeviceExamines(int page, int rows);

    ShcpResult getDeivceExamineById(long DEID);

    ShcpResult modifyDeviceExamineStatus(long DEID, byte status, String reason);
}
