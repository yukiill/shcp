package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.TbDeviceMapper;
import com.shcp.dao.mapper.TbDevicetypeMapper;
import com.shcp.developer.service.DeviceService;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.TbDeveloper;
import com.shcp.pojo.TbDevice;
import com.shcp.pojo.TbDevicetype;
import com.shcp.pojo.TbDevicetypeExample;
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
    private TbDevicetypeMapper tbDevicetypeMapper;

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
    public ShcpResult addDevice(TbDeveloper tbDeveloper, String Dsid, String DSname, String DStype, boolean isTest) {
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
        TbDevice tbDevice = new TbDevice();
        tbDevice.setDid(tbDeveloper.getDid());
        tbDevice.setUid((long)0);
        tbDevice.setTid(tbDevicetype.getTid());
        tbDevice.setDstid(Did);
//        tbDevice.setDsipaddr();
//        tbDevice.setDsmac();
//        tbDevice.setDsipaddr();
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
    public ShcpResult addDeviceType(String DSTypeName, String DSStatusType, String DSStatusValue, String DSCtrlType, String DSCtrlValue) {
        //TODO 完全不知道写什么
        TbDevicetype tbDevicetype = new TbDevicetype();
        tbDevicetype.setTid(IdGenerator.generateDeviceTypeId());
        tbDevicetype.setTname(DSTypeName);
        return ShcpResult.ok();
    }
}
