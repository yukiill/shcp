package com.shcp.developer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.*;
import com.shcp.developer.service.TestDeviceService;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

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
        if(testDeviceMapper.insertSelective(tbTestdevices) == 1){
            log.info("devId:{} insert new testDeviceID:{} success", tbDeveloper.getDid(), tbTestdevices.getTdeid());
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500, "发生了意料之外的错误");
        }
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
        if (testDeviceTypeMapper.insertSelective(testDeviceType) == 1) {
            log.info("insert new testDeviceType:{} success", testDeviceType);
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500, "发生了意料之外的错误");
        }
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
        if (testDeviceStatusMapper.insertSelective(testDeviceStatus) == 1) {
            log.info("insert new testDeviceStatus:{} success", testDeviceStatus);
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500, "发生了意料之外的错误");
        }
    }

    @Override
    public ShcpResult addTestDeviceLimit(Long tdsID, String tdelName, String tdelKey, String tdelValue) {
        TestDeviceLimit testDeviceLimit = new TestDeviceLimit();
        testDeviceLimit.setTdsid(tdsID);
        testDeviceLimit.setTdelid(IdGenerator.generateTestDeviceLimitId());
        testDeviceLimit.setTdelname(tdelName);
        testDeviceLimit.setTdelkey(tdelKey);
        testDeviceLimit.setTdelvalue(tdelValue);
        if (testDeviceLimitMapper.insert(testDeviceLimit) == 1) {
            log.info("insert new TestDeviceLimit:{} success", testDeviceLimit);
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500, "发生了意料之外的错误");
        }
    }

    @Override
    public ShcpResult addTestDeviceControl(Long tdsID, String tdecName, String tdecKey, String tdecValue) {
        TestDeviceControl testDeviceControl = new TestDeviceControl();
        testDeviceControl.setTdecid(IdGenerator.generateTestDeviceControlId());
        testDeviceControl.setTdsid(tdsID);
        testDeviceControl.setTdecname(tdecName);
        testDeviceControl.setTdeckey(tdecKey);
        testDeviceControl.setTdecvalue(tdecValue);
        if (testDeviceControlMapper.insertSelective(testDeviceControl) == 1) {
            log.info("insert new TestDeviceControl:{} success", testDeviceControl);
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500, "发生了意料之外的错误");
        }
    }

    @Override
    public ShcpResult searchTestDeviceType(long TDSID) {
        return ShcpResult.ok(testDeviceTypeMapper.selectByPrimaryKey(TDSID));
    }

    @Override
    public ShcpResult searchTestDeviceStatus(long TDESID) {
        return ShcpResult.ok(testDeviceStatusMapper.selectByPrimaryKey(TDESID));
    }

    @Override
    public ShcpResult searchTestDeviceControl(long TDECID) {
        return ShcpResult.ok(testDeviceControlMapper.selectByPrimaryKey(TDECID));
    }

    @Override
    public ShcpResult searchTestDeviceLimit(long TDELID) {
        return ShcpResult.ok(testDeviceLimitMapper.selectByPrimaryKey(TDELID));
    }

    @Override
    public ShcpResult getAllTestDeviceTypes(Developer developer) {
        TestDeviceExample testDeviceExample = new TestDeviceExample();
        testDeviceExample.createCriteria()
                .andDidEqualTo(developer.getDid());
        List<TestDevice> testDevices = testDeviceMapper.selectByExample(testDeviceExample);
        List<Long> typeIds = testDevices.stream().map(TestDevice::getTdeid).collect(Collectors.toList());
        TestDeviceTypeExample deviceTypeExample = new TestDeviceTypeExample();
        testDeviceExample.createCriteria().andTdeidIn(typeIds);
        List<TestDeviceType> testDeviceTypes = testDeviceTypeMapper.selectByExample(deviceTypeExample);
        if(testDeviceTypes != null && testDeviceTypes.size() > 0){
            log.info("devId:{} getAllTestDeviceTypes size:{}", developer.getDid(), testDeviceTypes.size());
            return ShcpResult.ok(testDeviceTypes);
        }
        return ShcpResult.build(500, "发生了意外之外的错误");
    }

    @Override
    public ShcpResult searchTestDevice(Developer developer, int page, int rows) {
        PageHelper.startPage(page, rows);
        TestDeviceExample example = new TestDeviceExample();
        example.createCriteria().andDidEqualTo(developer.getDid());
        List<TestDevice> testDevices = testDeviceMapper.selectByExample(example);
        if(testDevices != null && testDevices.size() > 0){
            PageInfo<TestDevice> pageInfo = new PageInfo<>(testDevices);
            log.info("searchTestDevice devId:{} get page:{} rows:{}", developer.getDid(), page, rows);
            return ShcpResult.ok(pageInfo);
        }
        return ShcpResult.build(500, "发生了意外之外的错误");
    }

    @Override
    public ShcpResult searchTestDeviceStatus(long TDSID, int page, int rows) {
        TestDeviceStatusExample example = new TestDeviceStatusExample();
        example.createCriteria().andTdsidEqualTo(TDSID);
        List<TestDeviceStatus> testDeviceStatuses = testDeviceStatusMapper.selectByExample(example);
        if(testDeviceStatuses != null && testDeviceStatuses.size() > 0){
            PageInfo<TestDeviceStatus> pageInfo = new PageInfo<>(testDeviceStatuses);
            log.info("searchTestDeviceStatus get page:{} rows:{} TDSID:{}", page, rows, TDSID);
            return ShcpResult.ok(pageInfo);
        }
        return ShcpResult.build(500, "发生了意外之外的错误");
    }

    @Override
    public ShcpResult searchTestDeviceControl(long TDSID, int page, int rows) {
        TestDeviceControlExample example = new TestDeviceControlExample();
        example.createCriteria().andTdsidEqualTo(TDSID);
        List<TestDeviceControl> testDeviceControls = testDeviceControlMapper.selectByExample(example);
        if(testDeviceControls != null && testDeviceControls.size() > 0){
            PageInfo<TestDeviceControl> pageInfo = new PageInfo<>(testDeviceControls);
            log.info("searchTestDeviceControl get page:{} rows:{} TDSID:{}", page, rows, TDSID);
            return ShcpResult.ok(pageInfo);
        }
        return ShcpResult.build(500, "发生了意外之外的错误");
    }

    @Override
    public ShcpResult searchTestDeviceLimit(long TDSID, int page, int rows) {
        TestDeviceLimitExample example = new TestDeviceLimitExample();
        example.createCriteria().andTdsidEqualTo(TDSID);
        List<TestDeviceLimit> testDeviceLimits = testDeviceLimitMapper.selectByExample(example);
        if(testDeviceLimits != null && testDeviceLimits.size() > 0){
            PageInfo<TestDeviceLimit> pageInfo = new PageInfo<>(testDeviceLimits);
            log.info("searchTestDeviceLimit get page:{} rows:{} TDSID:{}", page, rows, TDSID);
            return ShcpResult.ok(pageInfo);
        }
        return ShcpResult.build(500, "发生了意外之外的错误");
    }
}
