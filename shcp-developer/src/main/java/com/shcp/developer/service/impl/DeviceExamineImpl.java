package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeviceExamineMapper;
import com.shcp.developer.service.DeviceExamineService;
import com.shcp.pojo.Developer;
import com.shcp.pojo.DeviceExamine;
import com.shcp.pojo.DeviceExamineExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuki
 * @date 2019/4/15 20:27
 */
@Slf4j
@Service
public class DeviceExamineImpl implements DeviceExamineService{

    @Resource
    private DeviceExamineMapper deviceExamineMapper;

    @Override
    public ShcpResult addDeviceExamine(Developer tbDeveloper, String DSEName, String DESType, String DSETestID, MultipartFile DSEFile) {
        DeviceExamine deviceExamine = new DeviceExamine();
//        tbDeviceexamine.setDid(tbDeveloper.getDid());
//        tbDeviceexamine.set
        return null;
    }

    @Override
    public ShcpResult showDeviceExamineStatus(String DSEXID) {
        if(StringUtils.isEmpty(DSEXID)){
            List<DeviceExamine> tbDeviceexamineList = deviceExamineMapper.selectByExample(new DeviceExamineExample());
            log.info("return all deviceExamineStatus");
            return ShcpResult.ok(tbDeviceexamineList);
        }
        Long dsexid;
        try {
            dsexid = Long.parseLong(DSEXID);
        } catch (NumberFormatException e) {
            log.info("input DSEXID:{} is invalid", DSEXID);
            return ShcpResult.build(725, "请输入有效的设备编号");
        }
        DeviceExamine tbDeviceexamine = deviceExamineMapper.selectByPrimaryKey(dsexid);
        log.info("query DSEXID:{} deviceExamineStatus", DSEXID);
        return ShcpResult.ok(tbDeviceexamine);
    }
}
