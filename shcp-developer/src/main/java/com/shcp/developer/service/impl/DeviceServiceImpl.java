package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.TbDectrlMapper;
import com.shcp.dao.mapper.TbDeviceMapper;
import com.shcp.dao.mapper.TbDevicestatusMapper;
import com.shcp.dao.mapper.TbDevicetypeMapper;
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
    private TbDeviceMapper tbDeviceMapper;
    @Resource
    private TbDectrlMapper tbDectrlMapper;
    @Resource
    private TbDevicetypeMapper tbDevicetypeMapper;
    @Resource
    private TbDevicestatusMapper tbDevicestatusMapper;

    @Override
    public TbDevice searchDevice(String Dsid) {
        Long Did;
        try {
            Did = Long.parseLong(Dsid);
        } catch (NumberFormatException e) {
            log.info("input Dsid is invaild data Dsid:{}", Dsid);
            return null;
        }
        log.info("search Did:{} device success", Dsid);
        return tbDeviceMapper.selectByPrimaryKey(Did);
    }

    @Override
    public ShcpResult addDevice(TbDeveloper tbDeveloper, String Dsid, String DSname, String DStype, String DSmax, boolean isTest) {
        Long Did;
        try {
            Did = Long.parseLong(Dsid);
        } catch (NumberFormatException e) {
            log.info("input Dsid:{} is invalid", Dsid);
            return ShcpResult.build(725, "请输入有效的设备编号");
        }
        TbDevicetypeExample tbDevicetypeExample = new TbDevicetypeExample();
        tbDevicetypeExample.createCriteria().andTnameEqualTo(DStype);
        TbDevicetype tbDevicetype = tbDevicetypeMapper.selectByExample(tbDevicetypeExample).get(0);
        if(Objects.isNull(tbDevicetype)){
            return ShcpResult.build(500, "没有相应的设备类型");
        }
        //TODO 加入测试设备的新增
        TbDevice tbDevice = new TbDevice();
        tbDevice.setDid(tbDeveloper.getDid());
        tbDevice.setUid((long)0);
        tbDevice.setTid(tbDevicetype.getTid());
        tbDevice.setDstid(Did);
        tbDevice.setDsmac(DSmax);
        tbDeviceMapper.insertSelective(tbDevice);
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
        tbDeviceMapper.deleteByPrimaryKey(Did);
        log.info("delete Did:{} success", Dsid);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addDeviceType(String DSTypeName) {
        TbDevicetype tbDevicetype = new TbDevicetype();
        tbDevicetype.setTid(IdGenerator.generateDeviceTypeId());
        tbDevicetype.setTname(DSTypeName);
        tbDevicetypeMapper.insert(tbDevicetype);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addDeviceStatus(Long tid, String desname, String destype, String defaultValue, String minValue, String maxValue) {
        TbDevicestatus tbDevicestatus = new TbDevicestatus();
        tbDevicestatus.setDesid(IdGenerator.generateDeviceStatusId());
        tbDevicestatus.setTid(tid);
        tbDevicestatus.setDesname(desname);
        tbDevicestatus.setDestype(destype);
        tbDevicestatus.setDesdefaultvalue(defaultValue);
        tbDevicestatus.setDesminvalue(minValue);
        tbDevicestatus.setDesmaxvalue(maxValue);
        tbDevicestatusMapper.insertSelective(tbDevicestatus);
        log.info("insert new deviceStatus:{} success", tbDevicestatus);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addDevCtrl(Long DSTypeID, String DsCtrlName, String DsCtrlKey, String DsCtrlValue, String DsCtrlValTy) {
        TbDectrl tbDectrl = new TbDectrl();
        tbDectrl.setDecid(IdGenerator.generateDeviceCtrlId());
        tbDectrl.setTid(DSTypeID);
        tbDectrl.setDecname(DsCtrlName);
        tbDectrl.setDeckey(DsCtrlKey);
        tbDectrl.setDecvaluetype(DsCtrlValTy);
        tbDectrlMapper.insertSelective(tbDectrl);
        log.info("insert new deviceCtrl:{} success", tbDectrl);
        return ShcpResult.ok();
    }
}
