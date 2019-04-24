package com.shcp.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.*;
import com.shcp.manager.pojo.*;
import com.shcp.manager.service.DeviceService;
import com.shcp.pojo.*;
import com.sun.istack.internal.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author CYZ
 * @date 2019/4/16 20:06
 */
@Slf4j
@Service
public class DeviceServiceImpl implements DeviceService {

    @Resource
    private UserMapper userMapper;
    @Resource
    private DeveloperMapper developerMapper;
    @Resource
    private DeviceMapper deviceMapper;
    @Resource
    private DeviceStatusMapper deviceStatusMapper;
    @Resource
    private DeviceTypeMapper deviceTypeMapper;
    @Resource
    private DeviceLimitMapper deviceLimitMapper;
    @Resource
    private DeviceControlMapper deviceControlMapper;
    @Resource
    private DeviceLimitRelationMapper deviceLimitRelationMapper;

    @Override
    public ShcpResult searchDevice(String wd, String type) {
        if(Objects.equals("q", type)){
            //设备编号
            long deid;
            try {
                deid = Long.parseLong(wd);
            } catch (NumberFormatException e) {
                return ShcpResult.build(702, "输入的数据不合法");
            }
            User user = userMapper.selectByPrimaryKey(deid);
            return ShcpResult.ok(user);
        } else  if(Objects.equals("p", type)){
            //设备名称
            DeviceExample example = new DeviceExample();
            example.createCriteria().andDenameEqualTo(wd);
            List<Device> devices = deviceMapper.selectByExample(example);
            return ShcpResult.ok(devices);
        }
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getDeviceById(long DEID) {
        Device device = deviceMapper.selectByPrimaryKey(DEID);
        DeviceVo deviceVo = new DeviceVo();
        if(Objects.isNull(device)){
            ShcpResult.ok(deviceVo);
        }
        deviceVo = getDeviceVO(device);
        log.info("search device DEID:{} success", DEID);
        return ShcpResult.ok(deviceVo);
    }

    @Override
    public ShcpResult deleteDeviceById(long DEID) {
        if(deviceMapper.deleteByPrimaryKey(DEID) == 1){
            log.info("delete deviceID:{} success", DEID);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult getAllDevices(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<Device> deviceList = deviceMapper.selectByExample(new DeviceExample());
        if(deviceList == null || deviceList.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<DeviceVo> deviceVos = deviceList.stream().map(this::getDeviceVO).collect(Collectors.toList());
        PageInfo<DeviceVo> pageInfo = new PageInfo<>(deviceVos);
        log.info("get all device data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getAllDeviceTypes(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<DeviceType> deviceTypeList = deviceTypeMapper.selectByExample(new DeviceTypeExample());
        if(deviceTypeList == null || deviceTypeList.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<DeviceTypeVo> deviceTypeVos = deviceTypeList.stream().map(this::getDeviceTypeVo).collect(Collectors.toList());
        PageInfo<DeviceTypeVo> pageInfo = new PageInfo<>(deviceTypeVos);
        log.info("get all deviceType data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getDeviceTypeById(long DETID) {
        DeviceType deviceType = deviceTypeMapper.selectByPrimaryKey(DETID);
        DeviceTypeVo deviceTypeVo = new DeviceTypeVo();
        if(Objects.isNull(deviceType)){
            ShcpResult.ok(deviceTypeVo);
        }
        deviceTypeVo = getDeviceTypeVo(deviceType);
        log.info("search device DEID:{} success", DETID);
        return ShcpResult.ok(deviceTypeVo);
    }

    @Override
    public ShcpResult modifyDeviceTypeName(long DETID, String desName) {
        DeviceType deviceType = deviceTypeMapper.selectByPrimaryKey(DETID);
        if(Objects.isNull(deviceType)){
            return ShcpResult.build(704, "输入的是无效的设备类型编号");
        }
        if(Objects.equals(deviceType.getDsename(), desName)){
            return ShcpResult.build(705, "无效修改");
        }
        deviceType.setDsename(desName);
        if(deviceTypeMapper.updateByPrimaryKey(deviceType) == 1){
            log.info("modify deviceType DETID:{} desName:{}", DETID, desName);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult modifyDeviceTypeStatus(long DETID, byte is_open) {
        DeviceType deviceType = deviceTypeMapper.selectByPrimaryKey(DETID);
        if(Objects.isNull(deviceType)){
            return ShcpResult.build(704, "输入的是无效的设备类型编号");
        }
        if(deviceType.getIsOpen() == is_open){
            return ShcpResult.build(705, "无效修改");
        }
        deviceType.setIsOpen(is_open);
        if(deviceTypeMapper.updateByPrimaryKey(deviceType) == 1){
            log.info("modify deviceType DETID:{} is_open:{}", DETID, is_open);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult getAllDeviceStatus(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<DeviceStatus> deviceStatusList = deviceStatusMapper.selectByExample(new DeviceStatusExample());
        if(deviceStatusList == null || deviceStatusList.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<DeviceStatusVo> deviceStatusVos = deviceStatusList.stream().map(this::getDeviceStatusVo).collect(Collectors.toList());
        PageInfo<DeviceStatusVo> pageInfo = new PageInfo<>(deviceStatusVos);
        log.info("get all deviceStatus data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getDeviceStatusById(long DESID) {
        DeviceStatus deviceStatus = deviceStatusMapper.selectByPrimaryKey(DESID);
        DeviceStatusVo deviceStatusVo = new DeviceStatusVo();
        if(Objects.isNull(deviceStatus)){
            ShcpResult.ok(deviceStatusVo);
        }
        deviceStatusVo = getDeviceStatusVo(deviceStatus);
        log.info("search deviceStatus DESID:{} success", DESID);
        return ShcpResult.ok(deviceStatusVo);
    }

    @Override
    public ShcpResult modifyDeviceStatus(long DESID, String desName, String desType, String desDefaultValue, String desMinValue, String desMaxValue) {
        DeviceStatus deviceStatus = deviceStatusMapper.selectByPrimaryKey(DESID);
        if(Objects.isNull(deviceStatus)){
            return ShcpResult.build(707, "没有相应的设备状态");
        }
        boolean is_change = false;
        if(!Objects.equals(deviceStatus.getDesname(), desName)){
            deviceStatus.setDesname(desName);
            is_change = true;
        }
        if(!Objects.equals(deviceStatus.getDestype(), desType)){
            deviceStatus.setDestype(desType);
            is_change = true;
        }
        if(!Objects.equals(deviceStatus.getDesdefaultvalue(), desDefaultValue)){
            deviceStatus.setDesdefaultvalue(desDefaultValue);
            is_change = true;
        }
        if(!Objects.equals(deviceStatus.getDesminvalue(), desMinValue)){
            deviceStatus.setDesminvalue(desMinValue);
            is_change = true;
        }
        if(!Objects.equals(deviceStatus.getDesmaxvalue(), desMaxValue)){
            deviceStatus.setDesmaxvalue(desMaxValue);
            is_change = true;
        }
        if(is_change){
            if(deviceStatusMapper.updateByPrimaryKey(deviceStatus) == 1){
                log.info("update deviceStatus DESID:{} desName:{} desType:{} desDefaultValue:{} minValue:{} maxValue:{}", DESID,
                        desName, desType, desDefaultValue, desMinValue, desMaxValue);
                return ShcpResult.ok();
            }
            return ShcpResult.build(500, "服务器内部错误");
        }
        return ShcpResult.build(705, "无效修改");
    }

    @Override
    public ShcpResult deleteDeviceStatus(long DESID) {
        if(deviceStatusMapper.deleteByPrimaryKey(DESID) == 1){
            log.info("delete DESID:{} deviceLimit", DESID);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult getAllDeviceLimits(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<DeviceLimit> deviceLimitList = deviceLimitMapper.selectByExample(new DeviceLimitExample());
        if(deviceLimitList == null || deviceLimitList.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<DeviceLimitVo> deviceLimitVos = deviceLimitList.stream().map(this::getDeviceLimitVo).collect(Collectors.toList());
        PageInfo<DeviceLimitVo> pageInfo = new PageInfo<>(deviceLimitVos);
        log.info("get all deviceLimit data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getDeviceLimitById(long DELID) {
        DeviceLimit deviceLimit = deviceLimitMapper.selectByPrimaryKey(DELID);
        DeviceLimitVo deviceLimitVo = new DeviceLimitVo();
        if(Objects.isNull(deviceLimit)){
            return ShcpResult.ok(deviceLimitVo);
        }
        log.info("get DELID:{} deviceLimit", DELID);
        deviceLimitVo = getDeviceLimitVo(deviceLimit);
        return ShcpResult.ok(deviceLimitVo);
    }

    @Override
    public ShcpResult modifyDeviceLimit(long DELID, String delName, String delKey, String delValue) {
        DeviceLimit deviceLimit = deviceLimitMapper.selectByPrimaryKey(DELID);
        if(Objects.isNull(deviceLimit)){
            return ShcpResult.build(707, "没有相应的设备权限");
        }
        boolean is_change = false;
        if(!Objects.equals(deviceLimit.getDelname(), delName)){
            deviceLimit.setDelname(delName);
            is_change = true;
        }
        if(!Objects.equals(deviceLimit.getDelkey(), delKey)){
            deviceLimit.setDelkey(delKey);
            is_change = true;
        }
        if(!Objects.equals(deviceLimit.getDelvalue(), delValue)){
            deviceLimit.setDelvalue(delValue);
            is_change = true;
        }
        if(is_change){
            if(deviceLimitMapper.updateByPrimaryKey(deviceLimit) == 1){
                log.info("update deviceLimit DELID:{} delName:{} delKey:{} delValue:{}", DELID,
                        delName, delKey, delValue);
                return ShcpResult.ok();
            }
            return ShcpResult.build(500, "服务器内部错误");
        }
        return ShcpResult.build(705, "无效修改");
    }

    @Override
    public ShcpResult addDeviceLimitToDevice(long DEID, long DELID) {
        Device device = deviceMapper.selectByPrimaryKey(DEID);
        if(Objects.isNull(device)){
            return ShcpResult.build(706, "没有相应的设备");
        }
        DeviceLimit deviceLimit = deviceLimitMapper.selectByPrimaryKey(DELID);
        if(Objects.isNull(deviceLimit)){
            return ShcpResult.build(707, "没有相应的设备权限");
        }
        DeviceLimitRelation deviceLimitRelation = new DeviceLimitRelation();
        deviceLimitRelation.setDeid(DEID);
        deviceLimitRelation.setDelid(DELID);
        deviceLimitRelation.setDelstatus(true);
        if(deviceLimitRelationMapper.insert(deviceLimitRelation) == 1){
            log.info("insert DELID:{} deviceLimit for device DEID:{}", DELID, DEID);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult deleteDeviceLimitToDevice(long DEID, long DELID) {
        Device device = deviceMapper.selectByPrimaryKey(DEID);
        if(Objects.isNull(device)){
            return ShcpResult.build(706, "没有相应的设备");
        }
        DeviceLimit deviceLimit = deviceLimitMapper.selectByPrimaryKey(DELID);
        if(Objects.isNull(deviceLimit)){
            return ShcpResult.build(707, "没有相应的设备权限");
        }
        DeviceLimitRelationExample deviceLimitRelationExample = new DeviceLimitRelationExample();
        deviceLimitRelationExample.createCriteria()
                .andDelidEqualTo(DELID)
                .andDeidEqualTo(DEID);
        if(deviceLimitRelationMapper.deleteByExample(deviceLimitRelationExample) == 1){
            log.info("delete DELID:{} deviceLimit for device DEID:{}", DELID, DEID);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult deleteDeviceLimit(long DELID) {
        if(deviceLimitMapper.deleteByPrimaryKey(DELID) == 1){
            log.info("delete DELID:{} deviceLimit");
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @Override
    public ShcpResult getAllDeviceControls(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<DeviceControl> deviceControls = deviceControlMapper.selectByExample(new DeviceControlExample());
        if(deviceControls == null || deviceControls.size() <= 0){
            return ShcpResult.build(500, "服务器内部错误");
        }
        List<DeviceControlVo> deviceControlVos = deviceControls.stream().map(this::getDeviceControlVo).collect(Collectors.toList());
        PageInfo<DeviceControlVo> pageInfo = new PageInfo<>(deviceControlVos);
        log.info("get all deviceControl data page:{} rows:{}", page, rows);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult getDeviceControlsById(long DECID) {
        DeviceControl deviceControl = deviceControlMapper.selectByPrimaryKey(DECID);
        DeviceControlVo deviceControlVo = new DeviceControlVo();
        if(Objects.isNull(deviceControl)){
            return ShcpResult.ok(deviceControlVo);
        }
        log.info("get DECID:{} deviceControl", DECID);
        deviceControlVo = getDeviceControlVo(deviceControl);
        return ShcpResult.ok(deviceControlVo);
    }

    @Override
    public ShcpResult modifyDeviceControl(long DECID, String decName, String decKey, String decValue) {
        DeviceControl deviceControl = deviceControlMapper.selectByPrimaryKey(DECID);
        if(Objects.isNull(deviceControl)){
            return ShcpResult.build(707, "没有相应的设备权限");
        }
        boolean is_change = false;
        if(!Objects.equals(deviceControl.getDecname(), decName)){
            deviceControl.setDecname(decName);
            is_change = true;
        }
        if(!Objects.equals(deviceControl.getDeckey(), decKey)){
            deviceControl.setDeckey(decKey);
            is_change = true;
        }
        if(!Objects.equals(deviceControl.getDecvalue(), decValue)){
            deviceControl.setDecvalue(decValue);
            is_change = true;
        }
        if(is_change){
            if(deviceControlMapper.updateByPrimaryKey(deviceControl) == 1){
                log.info("update deviceControl DECID:{} decName:{} decKey:{} decValue:{}", DECID,
                        decName, decKey, decValue);
                return ShcpResult.ok();
            }
            return ShcpResult.build(500, "服务器内部错误");
        }
        return ShcpResult.build(705, "无效修改");
    }

    @Override
    public ShcpResult deleteDeviceControl(long DECID) {
        if(deviceLimitMapper.deleteByPrimaryKey(DECID) == 1){
            log.info("delete DECID:{} deviceControl");
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    private DeviceVo getDeviceVO(Device device){
        DeviceVo deviceVo = new DeviceVo();
        Developer developer = developerMapper.selectByPrimaryKey(device.getDid());
        User user = device.getUid() == null ? null : userMapper.selectByPrimaryKey(device.getUid());
        DeviceType deviceType = deviceTypeMapper.selectByPrimaryKey(device.getDetid());
        log.info("DEID:{} devID:{} UID:{} DETID:{}", device.getDeid(), device.getDid(),
                device.getUid(), device.getDetid());
        deviceVo.setDeveloper(developer);
        deviceVo.setUser(user);
        deviceVo.setDeviceType(deviceType);
        deviceVo.setDevice(device);
        return deviceVo;
    }

    private DeviceTypeVo getDeviceTypeVo(DeviceType deviceType){
        DeviceTypeVo deviceTypeVo = new DeviceTypeVo();
        Developer developer = developerMapper.selectByPrimaryKey(deviceType.getDid());
        deviceTypeVo.setDeveloper(developer);
        deviceTypeVo.setDeviceType(deviceType);
        return deviceTypeVo;
    }

    private DeviceLimitVo getDeviceLimitVo(DeviceLimit deviceLimit){
        DeviceLimitVo deviceLimitVo = new DeviceLimitVo();
        deviceLimitVo.setDeviceLimit(deviceLimit);
        DeviceType deviceType = deviceTypeMapper.selectByPrimaryKey(deviceLimit.getDetid());
        deviceLimitVo.setDeviceType(deviceType);
        return deviceLimitVo;
    }

    private DeviceStatusVo getDeviceStatusVo(DeviceStatus deviceStatus){
        DeviceStatusVo deviceStatusVo = new DeviceStatusVo();
        deviceStatusVo.setDeviceStatus(deviceStatus);
        DeviceType deviceType = deviceTypeMapper.selectByPrimaryKey(deviceStatus.getDetid());
        deviceStatusVo.setDeviceType(deviceType);
        return deviceStatusVo;
    }

    private DeviceControlVo getDeviceControlVo(DeviceControl deviceControl){
        DeviceControlVo deviceControlVo = new DeviceControlVo();
        deviceControlVo.setDeviceControl(deviceControl);
        DeviceType deviceType = deviceTypeMapper.selectByPrimaryKey(deviceControl.getDetid());
        deviceControlVo.setDeviceType(deviceType);
        return deviceControlVo;
    }
}
