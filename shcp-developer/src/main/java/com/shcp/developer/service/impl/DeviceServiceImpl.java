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
    public Device searchDevice(String Dsid) {
        Long Did;
        try {
            Did = Long.parseLong(Dsid);
        } catch (NumberFormatException e) {
            log.info("input Dsid is invaild data Dsid:{}", Dsid);
            return null;
        }
        log.info("search Did:{} device success", Dsid);
        return deviceMapper.selectByPrimaryKey(Did);
    }

    @Override
    public ShcpResult addDevice(Developer tbDeveloper, String Dsid, String DSname, String DStype, String DSmax, boolean isTest) {
        Long Did;
        try {
            Did = Long.parseLong(Dsid);
        } catch (NumberFormatException e) {
            log.info("input Dsid:{} is invalid", Dsid);
            return ShcpResult.build(725, "请输入有效的设备编号");
        }
        DeviceTypeExample tbDevicetypeExample = new DeviceTypeExample();
        tbDevicetypeExample.createCriteria().andDsenameEqualTo(DStype);
        DeviceType tbDevicetype = deviceTypeMapper.selectByExample(tbDevicetypeExample).get(0);
        if(Objects.isNull(tbDevicetype)){
            return ShcpResult.build(500, "没有相应的设备类型");
        }
        //TODO 加入测试设备的新增
        Device tbDevice = new Device();
        tbDevice.setDid(tbDeveloper.getDid());
        tbDevice.setUid((long)0);
        tbDevice.setDetid(tbDevicetype.getDetid());
        tbDevice.setDid(Did);
        tbDevice.setDemac(DSmax);
        deviceMapper.insertSelective(tbDevice);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult deleteDevice(String Dsid) {
        Long Did;
        try {
            Did = Long.parseLong(Dsid);
        } catch (NumberFormatException e) {
            log.info("input Dsid is invaild data Dsid:{}", Dsid);
            return null;
        }
        deviceMapper.deleteByPrimaryKey(Did);
        log.info("delete Did:{} success", Dsid);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addDeviceType(String DSTypeName) {
        DeviceType tbDevicetype = new DeviceType();
        tbDevicetype.setDetid(IdGenerator.generateDeviceTypeId());
        tbDevicetype.setDsename(DSTypeName);
        deviceTypeMapper.insert(tbDevicetype);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addDeviceStatus(Long tid, String desname, String destype, String defaultValue, String minValue, String maxValue) {
        DeviceStatus tbDevicestatus = new DeviceStatus();
        tbDevicestatus.setDesid(IdGenerator.generateDeviceStatusId());
        tbDevicestatus.setDetid(tid);
        tbDevicestatus.setDesname(desname);
        tbDevicestatus.setDestype(destype);
        tbDevicestatus.setDesdefaultvalue(defaultValue);
        tbDevicestatus.setDesminvalue(minValue);
        tbDevicestatus.setDesmaxvalue(maxValue);
        deviceStatusMapper.insertSelective(tbDevicestatus);
        log.info("insert new deviceStatus:{} success", tbDevicestatus);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addDevCtrl(Long DSTypeID, String DsCtrlName, String DsCtrlKey, String DsCtrlValue, String DsCtrlValTy) {
        DeviceControl tbDectrl = new DeviceControl();
        tbDectrl.setDecid(IdGenerator.generateDeviceCtrlId());
        tbDectrl.setDetid(DSTypeID);
        tbDectrl.setDecname(DsCtrlName);
        tbDectrl.setDeckey(DsCtrlKey);
        tbDectrl.setDecvalue(DsCtrlValTy);
        deviceControlMapper.insertSelective(tbDectrl);
        log.info("insert new deviceCtrl:{} success", tbDectrl);
        return ShcpResult.ok();
    }
}
