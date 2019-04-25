package com.shcp.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.*;
import com.shcp.manager.pojo.*;
import com.shcp.manager.service.TestDeviceService;
import com.shcp.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author Yuki
 * @date 2019/4/25 20:32
 */
@Slf4j
@Service
public class TestDeviceServiceImpl implements TestDeviceService{

    @Resource
    private DeveloperMapper developerMapper;
    @Resource
    private TestDeviceMapper testDeviceMapper;
    @Resource
    private TestDeviceStatusMapper testDeviceStatusMapper;
    @Resource
    private TestDeviceTypeMapper testDeviceTypeMapper;
    @Resource
    private TestDeviceLimitMapper testDeviceLimitMapper;
    @Resource
    private TestDeviceControlMapper testDeviceControlMapper;

    @Override
    public ShcpResult searchTestDevice(String wd, String type) {
        if(Objects.equals("q", type)){
            //设备编号
            long tdeid;
            try {
                tdeid = Long.parseLong(wd);
            } catch (NumberFormatException e) {
                return ShcpResult.build(702, "输入的数据不合法");
            }
            TestDevice testDevice = testDeviceMapper.selectByPrimaryKey(tdeid);
            return ShcpResult.ok(testDevice);
        } else  if(Objects.equals("p", type)){
            //设备名称
            TestDeviceExample example = new TestDeviceExample();
            example.createCriteria().andTdenameEqualTo(wd);
            List<TestDevice> testDevices = testDeviceMapper.selectByExample(example);
            return ShcpResult.ok(testDevices);
        }
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getTestDeviceById(long TDEID) {
        TestDevice testDevice = testDeviceMapper.selectByPrimaryKey(TDEID);
        TestDeviceVo testDeviceVo = new TestDeviceVo();
        if(Objects.isNull(testDevice)){
            ShcpResult.ok(testDeviceVo);
        }
        testDeviceVo = getTestDeviceVO(testDevice);
        log.info("search device TDEID:{} success", TDEID);
        return ShcpResult.ok(testDeviceVo);
    }

    @Override
    public ShcpResult deleteTestDeviceById(long TDEID) {
        if(testDeviceMapper.deleteByPrimaryKey(TDEID) == 1){
            log.info("delete deviceID:{} success", TDEID);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult getAllTestDevices(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<TestDevice> deviceList = testDeviceMapper.selectByExample(new TestDeviceExample());
        if(deviceList == null || deviceList.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<TestDeviceVo> deviceVos = deviceList.stream().map(this::getTestDeviceVO).collect(Collectors.toList());
        PageInfo<TestDeviceVo> pageInfo = new PageInfo<>(deviceVos);
        log.info("get all testDevice data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getAllTestDeviceTypes(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<TestDeviceType> deviceTypeList = testDeviceTypeMapper.selectByExample(new TestDeviceTypeExample());
        if(deviceTypeList == null || deviceTypeList.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<TestDeviceTypeVo> deviceTypeVos = deviceTypeList.stream().map(this::getTestDeviceTypeVo).collect(Collectors.toList());
        PageInfo<TestDeviceTypeVo> pageInfo = new PageInfo<>(deviceTypeVos);
        log.info("get all testDeviceType data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getTestDeviceTypeById(long TDSID) {
        TestDeviceType deviceType = testDeviceTypeMapper.selectByPrimaryKey(TDSID);
        TestDeviceTypeVo deviceTypeVo = new TestDeviceTypeVo();
        if(Objects.isNull(deviceType)){
            ShcpResult.ok(deviceTypeVo);
        }
        deviceTypeVo = getTestDeviceTypeVo(deviceType);
        log.info("search testDeviceType TDSID:{} success", TDSID);
        return ShcpResult.ok(deviceTypeVo);
    }

    @Override
    public ShcpResult modifyTestDeviceTypeName(long TDSID, String desName) {
        TestDeviceType deviceType = testDeviceTypeMapper.selectByPrimaryKey(TDSID);
        if(Objects.isNull(deviceType)){
            return ShcpResult.build(704, "输入的是无效的设备类型编号");
        }
        if(Objects.equals(deviceType.getTdsname(), desName)){
            return ShcpResult.build(705, "无效修改");
        }
        deviceType.setTdsname(desName);
        if(testDeviceTypeMapper.updateByPrimaryKey(deviceType) == 1){
            log.info("modify testDeviceType TDSID:{} desName:{}", TDSID, desName);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult getAllTestDeviceStatus(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<TestDeviceStatus> deviceStatusList = testDeviceStatusMapper.selectByExample(new TestDeviceStatusExample());
        if(deviceStatusList == null || deviceStatusList.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<TestDeviceStatusVo> deviceStatusVos = deviceStatusList.stream().map(this::getTestDeviceStatusVo).collect(Collectors.toList());
        PageInfo<TestDeviceStatusVo> pageInfo = new PageInfo<>(deviceStatusVos);
        log.info("get all testDeviceStatus data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getTestDeviceStatusById(long TDESID) {
        TestDeviceStatus deviceStatus = testDeviceStatusMapper.selectByPrimaryKey(TDESID);
        TestDeviceStatusVo deviceStatusVo = new TestDeviceStatusVo();
        if(Objects.isNull(deviceStatus)){
            ShcpResult.ok(deviceStatusVo);
        }
        deviceStatusVo = getTestDeviceStatusVo(deviceStatus);
        log.info("search testDeviceStatus TDESID:{} success", TDESID);
        return ShcpResult.ok(deviceStatusVo);
    }

    @Override
    public ShcpResult modifyTestDeviceStatus(long TDESID, String desName, String desType, String desDefaultValue, String desMinValue, String desMaxValue) {
        TestDeviceStatus deviceStatus = testDeviceStatusMapper.selectByPrimaryKey(TDESID);
        if(Objects.isNull(deviceStatus)){
            return ShcpResult.build(707, "没有相应的设备状态");
        }
        boolean is_change = false;
        if(!Objects.equals(deviceStatus.getTdesname(), desName)){
            deviceStatus.setTdesname(desName);
            is_change = true;
        }
        if(!Objects.equals(deviceStatus.getTdestype(), desType)){
            deviceStatus.setTdestype(desType);
            is_change = true;
        }
        if(!Objects.equals(deviceStatus.getTdesdefaultvalue(), desDefaultValue)){
            deviceStatus.setTdesdefaultvalue(desDefaultValue);
            is_change = true;
        }
        if(!Objects.equals(deviceStatus.getTdesminvalue(), desMinValue)){
            deviceStatus.setTdesminvalue(desMinValue);
            is_change = true;
        }
        if(!Objects.equals(deviceStatus.getTdesmaxvalue(), desMaxValue)){
            deviceStatus.setTdesmaxvalue(desMaxValue);
            is_change = true;
        }
        if(is_change){
            if(testDeviceStatusMapper.updateByPrimaryKey(deviceStatus) == 1){
                log.info("update testDeviceStatus TDESID:{} desName:{} desType:{} desDefaultValue:{} minValue:{} maxValue:{}", TDESID,
                        desName, desType, desDefaultValue, desMinValue, desMaxValue);
                return ShcpResult.ok();
            }
            return ShcpResult.build(500, "服务器内部错误");
        }
        return ShcpResult.build(705, "无效修改");
    }

    @Override
    public ShcpResult deleteTestDeviceStatus(long TDESID) {
        if(testDeviceStatusMapper.deleteByPrimaryKey(TDESID) == 1){
            log.info("delete TDESID:{} testDeviceLimit", TDESID);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult getAllTestDeviceLimits(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<TestDeviceLimit> testDeviceLimits = testDeviceLimitMapper.selectByExample(new TestDeviceLimitExample());
        if(testDeviceLimits == null || testDeviceLimits.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<TestDeviceLimitVo> testDeviceLimitVos = testDeviceLimits.stream().map(this::getTestDeviceLimitVo).collect(Collectors.toList());
        PageInfo<TestDeviceLimitVo> pageInfo = new PageInfo<>(testDeviceLimitVos);
        log.info("get all testDeviceLimit data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getTestDeviceLimitById(long TDELID) {
        TestDeviceLimit testDeviceLimit = testDeviceLimitMapper.selectByPrimaryKey(TDELID);
        TestDeviceLimitVo testDeviceLimitVo = new TestDeviceLimitVo();
        if(Objects.isNull(testDeviceLimit)){
            return ShcpResult.ok(testDeviceLimitVo);
        }
        log.info("get TDELID:{} deviceLimit", TDELID);
        testDeviceLimitVo = getTestDeviceLimitVo(testDeviceLimit);
        return ShcpResult.ok(testDeviceLimitVo);
    }

    @Override
    public ShcpResult modifyTestDeviceLimit(long TDELID, String tdelName, String tdelKey, String tdelValue) {
        TestDeviceLimit testDeviceLimit = testDeviceLimitMapper.selectByPrimaryKey(TDELID);
        if(Objects.isNull(testDeviceLimit)){
            return ShcpResult.build(707, "没有相应的设备权限");
        }
        boolean is_change = false;
        if(!Objects.equals(testDeviceLimit.getTdelname(), tdelName)){
            testDeviceLimit.setTdelname(tdelName);
            is_change = true;
        }
        if(!Objects.equals(testDeviceLimit.getTdelkey(), tdelKey)){
            testDeviceLimit.setTdelkey(tdelKey);
            is_change = true;
        }
        if(!Objects.equals(testDeviceLimit.getTdelvalue(), tdelValue)){
            testDeviceLimit.setTdelvalue(tdelValue);
            is_change = true;
        }
        if(is_change){
            if(testDeviceLimitMapper.updateByPrimaryKey(testDeviceLimit) == 1){
                log.info("update testDeviceLimit TDELID:{} tdelName:{} tdelKey:{} tdelValue:{}", TDELID,
                        tdelName, tdelKey, tdelValue);
                return ShcpResult.ok();
            }
            return ShcpResult.build(500, "服务器内部错误");
        }
        return ShcpResult.build(705, "无效修改");
    }

    @Override
    public ShcpResult deleteTestDeviceLimit(long TDELID) {
        if(testDeviceLimitMapper.deleteByPrimaryKey(TDELID) == 1){
            log.info("delete TDELID:{} deviceLimit");
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult getAllTestDeviceControls(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<TestDeviceControl> testDeviceControls = testDeviceControlMapper.selectByExample(new TestDeviceControlExample());
        if(testDeviceControls == null || testDeviceControls.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<TestDeviceControlVo> testDeviceControlVos = testDeviceControls.stream().map(this::getTestDeviceControlVo).collect(Collectors.toList());
        PageInfo<TestDeviceControlVo> pageInfo = new PageInfo<>(testDeviceControlVos);
        log.info("get all testDeviceControl data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getTestDeviceControlsById(long TDECID) {
        TestDeviceControl testDeviceControl = testDeviceControlMapper.selectByPrimaryKey(TDECID);
        TestDeviceControlVo testDeviceControlVo = new TestDeviceControlVo();
        if(Objects.isNull(testDeviceControl)){
            return ShcpResult.ok(testDeviceControlVo);
        }
        log.info("get TDECID:{} deviceControl", TDECID);
        testDeviceControlVo = getTestDeviceControlVo(testDeviceControl);
        return ShcpResult.ok(testDeviceControlVo);
    }

    @Override
    public ShcpResult modifyTestDeviceControl(long TDECID, String tdecName, String tdecKey, String tdecValue) {
        TestDeviceControl testDeviceControl = testDeviceControlMapper.selectByPrimaryKey(TDECID);
        if(Objects.isNull(testDeviceControl)){
            return ShcpResult.build(707, "没有相应的设备权限");
        }
        boolean is_change = false;
        if(!Objects.equals(testDeviceControl.getTdecname(), tdecName)){
            testDeviceControl.setTdecname(tdecName);
            is_change = true;
        }
        if(!Objects.equals(testDeviceControl.getTdeckey(), tdecKey)){
            testDeviceControl.setTdeckey(tdecKey);
            is_change = true;
        }
        if(!Objects.equals(testDeviceControl.getTdecvalue(), tdecValue)){
            testDeviceControl.setTdecvalue(tdecValue);
            is_change = true;
        }
        if(is_change){
            if(testDeviceControlMapper.updateByPrimaryKey(testDeviceControl) == 1){
                log.info("update deviceControl TDECID:{} tdecName:{} tdecKey:{} tdecValue:{}", TDECID,
                        tdecName, tdecKey, tdecValue);
                return ShcpResult.ok();
            }
            return ShcpResult.build(500, "服务器内部错误");
        }
        return ShcpResult.build(705, "无效修改");
    }

    @Override
    public ShcpResult deleteTestDeviceControl(long TDECID) {
        if(testDeviceControlMapper.deleteByPrimaryKey(TDECID) == 1){
            log.info("delete TDECID:{} deviceControl");
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    private TestDeviceVo getTestDeviceVO(TestDevice testDevice){
        TestDeviceVo testDeviceVo = new TestDeviceVo();
        Developer developer = developerMapper.selectByPrimaryKey(testDevice.getDid());
        TestDeviceType testDeviceType = Objects.isNull(testDevice.getTdeid()) ? null : testDeviceTypeMapper.selectByPrimaryKey(testDevice.getTdsid());
        testDeviceVo.setDeveloper(developer);
        testDeviceVo.setTestDevice(testDevice);
        testDeviceVo.setTestDeviceType(testDeviceType);
        return testDeviceVo;
    }

    private TestDeviceTypeVo getTestDeviceTypeVo(TestDeviceType testDeviceType){
        TestDeviceTypeVo testDeviceTypeVo = new TestDeviceTypeVo();
        Developer developer = developerMapper.selectByPrimaryKey(testDeviceType.getDid());
        testDeviceTypeVo.setDeveloper(developer);
        testDeviceTypeVo.setTestDeviceType(testDeviceType);
        return testDeviceTypeVo;
    }

    private TestDeviceLimitVo getTestDeviceLimitVo(TestDeviceLimit testDeviceLimit){
        TestDeviceLimitVo deviceTestLimitVo = new TestDeviceLimitVo();
        deviceTestLimitVo.setTestDeviceLimit(testDeviceLimit);
        TestDeviceType testDeviceType = testDeviceTypeMapper.selectByPrimaryKey(testDeviceLimit.getTdsid());
        deviceTestLimitVo.setTestDeviceType(testDeviceType);
        return deviceTestLimitVo;
    }

    private TestDeviceStatusVo getTestDeviceStatusVo(TestDeviceStatus testDeviceStatus){
        TestDeviceStatusVo testDeviceStatusVo = new TestDeviceStatusVo();
        testDeviceStatusVo.setTestDeviceStatus(testDeviceStatus);
        TestDeviceType testDeviceType = testDeviceTypeMapper.selectByPrimaryKey(testDeviceStatus.getTdsid());
        testDeviceStatusVo.setTestDeviceType(testDeviceType);
        return testDeviceStatusVo;
    }

    private TestDeviceControlVo getTestDeviceControlVo(TestDeviceControl testDeviceControl){
        TestDeviceControlVo testDeviceControlVo = new TestDeviceControlVo();
        testDeviceControlVo.setTestDeviceControl(testDeviceControl);
        TestDeviceType testDeviceType = testDeviceTypeMapper.selectByPrimaryKey(testDeviceControl.getTdsid());
        testDeviceControlVo.setTestDeviceType(testDeviceType);
        return testDeviceControlVo;
    }
}
