package com.shcp.client.service.impl;

import com.shcp.client.service.DeviceService;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.TbDeviceMapper;
import com.shcp.pojo.TbDevice;
import com.shcp.pojo.TbDeviceExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/1 20:47
 */
@Slf4j
@Service
public class DeviceServiceImpl implements DeviceService{

    @Autowired
    private TbDeviceMapper tbDeviceMapper;

    @Override
    public ShcpResult getDeviceListByUserId(Long userId) {
        if(Objects.isNull(userId)){
            log.info("userid should not be null");
            return ShcpResult.build(7777, "用户状态异常");
        }
        TbDeviceExample tbDeviceExample = new TbDeviceExample();
        tbDeviceExample.createCriteria()
                .andUidEqualTo(userId);
        List<TbDevice> tbDevices =  tbDeviceMapper.selectByExample(tbDeviceExample);
        log.info("userId:{} query device list success", userId);
        return ShcpResult.ok(tbDevices);
    }
}
