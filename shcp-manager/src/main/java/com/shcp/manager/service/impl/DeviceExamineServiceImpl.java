package com.shcp.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeviceExamineMapper;
import com.shcp.manager.service.DeviceExamineService;
import com.shcp.pojo.DeviceExamine;
import com.shcp.pojo.DeviceExamineExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/25 20:06
 */
@Slf4j
@Service
public class DeviceExamineServiceImpl implements DeviceExamineService{

    @Resource
    private DeviceExamineMapper deviceExamineMapper;

    @Override
    public ShcpResult getAllDeviceExamines(int page, int rows) {
        PageHelper.startPage(page, rows);
        List<DeviceExamine> examineList = deviceExamineMapper.selectByExample(new DeviceExamineExample());
        PageInfo<DeviceExamine> pageInfo = new PageInfo<>(examineList);
        return ShcpResult.ok(pageInfo);
    }

    @Override
    public ShcpResult modifyDeviceExamineStatus(long DEID, byte status, String reason) {
        DeviceExamine deviceExamine = deviceExamineMapper.selectByPrimaryKey(DEID);
        if(Objects.isNull(deviceExamine)){
            return ShcpResult.build(707, "没有相应的设备审核信息");
        }
        deviceExamine.setIsPass(status);
        deviceExamine.setReason(reason);
        if(deviceExamineMapper.updateByPrimaryKeySelective(deviceExamine) == 1){
            log.info("modify deviceExamine DEID:{} status:{} reason:{}", DEID, status, reason);
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");

    }

    @Override
    public ShcpResult getDeivceExamineById(long DEID) {
        DeviceExamine deviceExamine = deviceExamineMapper.selectByPrimaryKey(DEID);
        return ShcpResult.ok(deviceExamine);
    }
}
