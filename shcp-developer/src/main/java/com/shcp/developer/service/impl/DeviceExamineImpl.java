package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.TbDeviceexamineMapper;
import com.shcp.developer.service.DeviceExamineService;
import com.shcp.developer.service.DeviceService;
import com.shcp.pojo.TbDeveloper;
import com.shcp.pojo.TbDeviceexamine;
import com.shcp.pojo.TbDeviceexamineExample;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuki
 * @date 2019/4/15 20:27
 */
@Slf4j
@Service
public class DeviceExamineImpl implements DeviceExamineService{

    @Resource
    private TbDeviceexamineMapper tbDeviceexamineMapper;

    @Override
    public ShcpResult addDeviceExamine(TbDeveloper tbDeveloper, String DSEName, String DESType, String DSETestID, MultipartFile DSEFile) {
        TbDeviceexamine tbDeviceexamine = new TbDeviceexamine();
        tbDeviceexamine.setDid(tbDeveloper.getDid());
//        tbDeviceexamine.set
        return null;
    }

    @Override
    public ShcpResult showDeviceExamineStatus(String DSEXID) {
        if(StringUtils.isEmpty(DSEXID)){
            List<TbDeviceexamine> tbDeviceexamineList = tbDeviceexamineMapper.selectByExample(new TbDeviceexamineExample());
            log.info("return all deviceExamineStatus");
            return ShcpResult.ok(tbDeviceexamineList);
        }
        Long dsexid;
        try {
            dsexid = Long.parseLong(DSEXID);
        } catch (NumberFormatException e) {
            log.info("input DSEXID:{} is invalid", DSEXID);
            return ShcpResult.build(725, "请输入有效的设备编号");
        }
        TbDeviceexamine tbDeviceexamine = tbDeviceexamineMapper.selectByPrimaryKey(dsexid);
        log.info("query DSEXID:{} deviceExamineStatus", DSEXID);
        return ShcpResult.ok(tbDeviceexamine);
    }
}
