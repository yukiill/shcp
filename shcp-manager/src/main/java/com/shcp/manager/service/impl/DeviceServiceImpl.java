package com.shcp.manager.service.impl;

import com.shcp.dao.mapper.TbDeviceMapper;
import com.shcp.manager.service.DevelopService;
import com.shcp.manager.service.DeviceService;
import com.shcp.pojo.TbDeveloper;
import com.shcp.pojo.TbDevice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author CYZ
 * @date 2019/4/16 20:06
 */
@Slf4j
@Service
public class DeviceServiceImpl implements DeviceService {

    @Resource
    private TbDeviceMapper tbDeviceMapper;

    @Override
    public TbDevice searchDevice(String Dstid) {
        Long _dstid;
        try {
            _dstid = Long.parseLong(Dstid);
        } catch (NumberFormatException e) {
            log.info("input Dstid is invaild data Dsid:{}", Dstid);
            return null;
        }
        log.info("search _dstid:{} device success", Dstid);
        return tbDeviceMapper.selectByPrimaryKey(_dstid);
    }}
