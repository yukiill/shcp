package com.shcp.developer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeviceExamineMapper;
import com.shcp.dao.mapper.TestDeviceMapper;
import com.shcp.developer.service.DeviceExamineService;
import com.shcp.developer.utils.FileUtil;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Yuki
 * @date 2019/4/15 20:27
 */
@Slf4j
@Service
public class DeviceExamineImpl implements DeviceExamineService{

    @Resource
    private DeviceExamineMapper deviceExamineMapper;
    @Resource
    private TestDeviceMapper testDeviceMapper;

    @Override
    public ShcpResult addDeviceExamine(Developer developer, String examineName, long testDeviceId, MultipartFile examineInfo) {
        TestDevice testDevice = testDeviceMapper.selectByPrimaryKey(testDeviceId);
        if(Objects.isNull(testDevice)){
            log.info("devId:{} submit deviceExamine failed testDeviceID:{} is not exist", developer.getDid(), testDeviceId);
            return ShcpResult.build(733, "不存在相应的测试设备");
        }
        DeviceExamine deviceExamine = new DeviceExamine();
        deviceExamine.setDeid(IdGenerator.generateDeviceExamineId());
        deviceExamine.setTdeid(testDeviceId);
        deviceExamine.setEname(examineName);
        deviceExamine.setEinfo(FileUtil.uploadFile(developer.getUsername(), examineInfo));
        if(deviceExamineMapper.insertSelective(deviceExamine) == 1){
            log.info("devId:{} insert new DeviceExamine id:{} success", developer.getDid(), deviceExamine.getDeid());
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部出错");
    }

    @Override
    public ShcpResult showDeviceExamine(Developer developer, int page, int rows) {
        TestDeviceExample testDeviceExample = new TestDeviceExample();
        testDeviceExample.createCriteria().andDidEqualTo(developer.getDid());
        List<TestDevice> testDevices = testDeviceMapper.selectByExample(testDeviceExample);
        List<Long> deviceIds = testDevices.stream().map(TestDevice::getTdeid).collect(Collectors.toList());
        PageHelper.startPage(page, rows);
        DeviceExamineExample examineExample = new DeviceExamineExample();
        examineExample.createCriteria().andTdeidIn(deviceIds);
        List<DeviceExamine> examines = deviceExamineMapper.selectByExample(examineExample);
        if(examines != null && examines.size() > 0){
            PageInfo<DeviceExamine> deviceExaminePageInfo = new PageInfo<>(examines);
            log.info("showDeviceExamine dev:{} get page:{} rows:{}", developer.getDid(), page, rows);
            return ShcpResult.ok(deviceExaminePageInfo);
        }
        return ShcpResult.build(500, "服务器内部出错");
    }

    @Override
    public ShcpResult findDeviceExamineById(long DEID) {
        return ShcpResult.ok(deviceExamineMapper.selectByPrimaryKey(DEID));
    }

    @Override
    public ShcpResult modifyDeviceExamine(Developer developer, long DEID, String examineName, long testDeviceId, MultipartFile examineInfo) {
        DeviceExamine examine = deviceExamineMapper.selectByPrimaryKey(DEID);
        if(Objects.isNull(examine)){
            return ShcpResult.build(735, "没有相应的设备审核信息");
        }
        if(!Objects.equals(examine.getEname(), examineName)){
            examine.setEname(examineName);
        }
        TestDevice testDevice = testDeviceMapper.selectByPrimaryKey(testDeviceId);
        if(Objects.isNull(testDevice)){
            log.info("devId:{} modify deviceExamine failed testDeviceID:{} is not exist", developer.getDid(), testDeviceId);
            return ShcpResult.build(733, "不存在相应的测试设备");
        }
        examine.setEinfo(FileUtil.uploadFile(developer.getUsername(), examineInfo));
        if(deviceExamineMapper.updateByPrimaryKeySelective(examine) == 1){
            log.info("devId:{} modify DeviceExamine id:{} success", developer.getDid(), examine.getDeid());
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部出错");
    }
}
