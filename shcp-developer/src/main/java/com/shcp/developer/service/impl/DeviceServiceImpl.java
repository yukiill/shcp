package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeviceControlMapper;
import com.shcp.dao.mapper.DeviceMapper;
import com.shcp.dao.mapper.DeviceStatusMapper;
import com.shcp.dao.mapper.DeviceTypeMapper;
import com.shcp.developer.service.DeviceService;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/15 17:12
 */
@Slf4j
@Service
public class DeviceServiceImpl implements DeviceService{

    @Resource
    private DeviceMapper deviceMapper;
    @Resource
    private DeviceControlMapper deviceControlMapper;
    @Resource
    private DeviceTypeMapper deviceTypeMapper;
    @Resource
    private DeviceStatusMapper deviceStatusMapper;

    @Override
    public Device searchDevice(long deid) {
        Device device = deviceMapper.selectByPrimaryKey(deid);
        if(Objects.isNull(device)){
            log.info("search Did:{} device success", deid);
        }
        return device;
    }

    @Override
    public ShcpResult addDevice(Developer tbDeveloper, String deName, String deMac, long DETID, long DEID) {
        DeviceType tbDevicetype = deviceTypeMapper.selectByPrimaryKey(DETID);
        if(Objects.isNull(tbDevicetype)){
            return ShcpResult.build(731, "没有相应的设备类型");
        }
        Device tbDevice = new Device();
        tbDevice.setDeid(DEID);
        tbDevice.setDid(tbDeveloper.getDid());
        tbDevice.setDetid(DETID);
        tbDevice.setDemac(deMac);
        deviceMapper.insertSelective(tbDevice);
        log.info("insert new device:{} for devId:{}", tbDeveloper.getDid(), tbDevice);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult deleteDevice(long DEID) {
        if(deviceMapper.deleteByPrimaryKey(DEID) == 1){
            log.info("delete Did:{} success", DEID);
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500 , "服务器内部出错");
        }
    }

    @Override
    public ShcpResult addDeviceType(String DSTypeName) {
        DeviceType tbDevicetype = new DeviceType();
        tbDevicetype.setDetid(IdGenerator.generateDeviceTypeId());
        tbDevicetype.setDsename(DSTypeName);
        if(deviceTypeMapper.insert(tbDevicetype) == 1){
            log.info("insert new deviceType:{}", tbDevicetype);
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500 , "服务器内部出错");
        }
    }

    @Override
    public ShcpResult addDeviceStatus(Long DETID, String desname, String destype, String defaultValue, String minValue, String maxValue) {
        DeviceType deviceType = deviceTypeMapper.selectByPrimaryKey(DETID);
        if(Objects.isNull(deviceType)){
            return ShcpResult.build(731, "没有相应的设备类型");
        }
        if(!isVaildValueType(destype)){
            return ShcpResult.build(732, "设备状态的值类型不合法");
        }
        DeviceStatus deviceStatus = new DeviceStatus();
        deviceStatus.setDesid(IdGenerator.generateDeviceStatusId());
        deviceStatus.setDetid(DETID);
        deviceStatus.setDesname(desname);
        deviceStatus.setDestype(destype);
        deviceStatus.setDesdefaultvalue(defaultValue);
        deviceStatus.setDesminvalue(minValue);
        deviceStatus.setDesmaxvalue(maxValue);
        if(deviceStatusMapper.insertSelective(deviceStatus) == 1){
            log.info("insert new deviceStatus:{} success", deviceStatus);
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500 , "服务器内部出错");
        }
    }

    @Override
    public ShcpResult addDevCtrl(Long DETID, String decName, String decKey, String decValue, String decType) {
        DeviceType deviceType = deviceTypeMapper.selectByPrimaryKey(DETID);
        if(Objects.isNull(deviceType)){
            return ShcpResult.build(731, "没有相应的设备类型");
        }
        DeviceControl deviceControl = new DeviceControl();
        deviceControl.setDecid(IdGenerator.generateDeviceCtrlId());
        deviceControl.setDetid(DETID);
        deviceControl.setDecname(decName);
        deviceControl.setDeckey(decKey);
        deviceControl.setDecvalue(decValue);
        //TODO 讨论一下是不是缺少字段
//        tbDectrl.setDecvalue(deviceType);
        if(deviceControlMapper.insertSelective(deviceControl) == 1){
            log.info("insert new deviceCtrl:{} success", deviceControl);
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500 , "服务器内部出错");
        }
    }

    private boolean isVaildValueType(String type){
        switch (type){
            case "char":
                return true;
            case "int":
                return true;
            default:
                return false;
        }
    }
}
