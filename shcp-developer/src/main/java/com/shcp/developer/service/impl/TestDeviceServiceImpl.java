package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.*;
import com.shcp.developer.service.TestDeviceService;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/4/18 10:54
 */
@Slf4j
@Controller
public class TestDeviceServiceImpl implements TestDeviceService{

    @Resource
    private TestDeviceMapper testDeviceMapper;
    @Resource
    private TestDeviceTypeMapper testDeviceTypeMapper;
    @Resource
    private TestDeviceStatusMapper testDeviceStatusMapper;
    @Resource
    private TestDeviceControlMapper testDeviceControlMapper;
    @Resource
    private TestDeviceLimitMapper testDeviceLimitMapper;

    @Override
    public ShcpResult addTestDevice(Developer tbDeveloper, String tdeName, String ipaddr, int port, String tdemac) {
        TestDevice tbTestdevices = new TestDevice();
        tbTestdevices.setDid(tbDeveloper.getDid());
        tbTestdevices.setTdeid(IdGenerator.generateTestDeviceId());
        tbTestdevices.setTdeipaddr(ipaddr);
        tbTestdevices.setTdeport(port);
        tbTestdevices.setDemac(tdemac);
        tbTestdevices.setTdename(tdeName);
        tbTestdevices.setTdsid((long)0);
        testDeviceMapper.insertSelective(tbTestdevices);
        log.info("devId:{} insert new testDeviceID:{} success", tbDeveloper.getDid(), tbTestdevices.getTdeid());
        return null;
    }

    @Override
    public ShcpResult searchTestDevice(Long tdeID) {
        TestDevice testDevice = testDeviceMapper.selectByPrimaryKey(tdeID);
        log.info("query tdeID:{} succes", tdeID);
        return ShcpResult.ok(testDevice);
    }

    @Override
    public ShcpResult addTestDeviceType(Developer tbDeveloper, String tdesName) {
        TestDeviceType testDeviceType = new TestDeviceType();
        testDeviceType.setTdsid(IdGenerator.generateTestDeviceId());
        testDeviceType.setTdsname(tdesName);
        testDeviceTypeMapper.insertSelective(testDeviceType);
        log.info("insert new testDeviceType:{} success", testDeviceType);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addTestDeviceStatus(Long tdsID, String tdesName, String tdesType, String tdesDefaultValue, String tdesMinValue, String tdesMaxValue) {
        TestDeviceStatus testDeviceStatus = new TestDeviceStatus();
        testDeviceStatus.setTdesid(IdGenerator.generateTestDeviceStatusId());
        testDeviceStatus.setTdsid(tdsID);
        testDeviceStatus.setTdesname(tdesName);
        testDeviceStatus.setTdestype(tdesType);
        testDeviceStatus.setTdesdefaultvalue(tdesDefaultValue);
        testDeviceStatus.setTdesminvalue(tdesMinValue);
        testDeviceStatus.setTdesmaxvalue(tdesMaxValue);
        testDeviceStatusMapper.insertSelective(testDeviceStatus);
        log.info("insert new testDeviceStatus:{} success", testDeviceStatus);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addTestDeviceLimit(Long tdsID, String tdelName, String tdelKey, String tdelValue) {
        TestDeviceLimit testDeviceLimit = new TestDeviceLimit();
        testDeviceLimit.setTdsid(tdsID);
        testDeviceLimit.setTdelid(IdGenerator.generateTestDeviceLimitId());
        testDeviceLimit.setTdelname(tdelName);
        testDeviceLimit.setTdelkey(tdelKey);
        testDeviceLimit.setTdelvalue(tdelValue);
        log.info("insert new TestDeviceLimit:{} success", testDeviceLimit);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult addTestDeviceControl(Long tdsID, String tdecName, String tdecKey, String tdecValue) {
        TestDeviceControl testDeviceControl = new TestDeviceControl();
        testDeviceControl.setTdecid(IdGenerator.generateTestDeviceControlId());
        testDeviceControl.setTdsid(tdsID);
        testDeviceControl.setTdecname(tdecName);
        testDeviceControl.setTdeckey(tdecKey);
        testDeviceControl.setTdecvalue(tdecValue);
        testDeviceControlMapper.insertSelective(testDeviceControl);
        log.info("insert new TestDeviceControl:{} success", testDeviceControl);
        return ShcpResult.ok();

    }
}
