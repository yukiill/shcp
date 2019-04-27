package com.shcp.manager.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeveloperInfoMapper;
import com.shcp.dao.mapper.DeveloperLimitRelationshipMapper;
import com.shcp.dao.mapper.DeveloperMapper;
import com.shcp.manager.service.DeveloperService;
import com.shcp.pojo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author CYZ
 * @date 2019/4/27 12:20
 */
@Slf4j
@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Resource
    private DeveloperMapper developerMapper;
    @Resource
    private DeveloperInfoMapper developerInfoMapper;
    @Resource
    private DeveloperLimitRelationshipMapper developerLimitRelationshipMapper;

    @Override
    public Developer searchDeveloper(String DID) {
        Long did;
        try {
            did = Long.parseLong(DID);
        } catch (NumberFormatException e) {
            log.info("input DID is invaild data DID:{}", DID);
            return null;
        }
        log.info("search did:{} device success", DID);
        return developerMapper.selectByPrimaryKey(did);
    }

    @Override
    public ShcpResult findDeveloper(String wd, String type) {
        if(Objects.equals("q", type)){
            //开发者编号
            long did;
            try {
                did = Long.parseLong(wd);
            } catch (NumberFormatException e) {
                return ShcpResult.build(702, "输入的数据不合法");
            }
            Developer developer = developerMapper.selectByPrimaryKey(did);
            return ShcpResult.ok(developer);
        } else  if(Objects.equals("p", type)){
            //用户名称
            DeveloperExample example = new DeveloperExample();
            example.createCriteria().andUsernameEqualTo(wd);
            List<Developer> developer = developerMapper.selectByExample(example);
            return ShcpResult.ok(developer);
        }
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult showDeveloper(String DID) {
        long did;
        try {
            did = Long.parseLong(DID);
        } catch (NumberFormatException e) {
            log.info("input DID is invaild data DID:{}", DID);
            return ShcpResult.build(702, "输入的开发者编号不存在");
        }
        Developer developer = developerMapper.selectByPrimaryKey(did);
        return ShcpResult.ok(developer);
    }

    @Override
    public ShcpResult modifyDeveloperInfo(String DID, String wd, String type) {
        //TODO 没写完，不知道如何通过一个字段一次接受多个数据
        return null;
    }

    @Override
    public ShcpResult findDeveloperExamp(String wd, String type) {
        if(Objects.equals("q", type)){
            //开发者审核信息编号
            long dfid;
            try {
                dfid = Long.parseLong(wd);
            } catch (NumberFormatException e) {
                return ShcpResult.build(702, "输入的数据不合法");
            }
            DeveloperInfo developerInfo = developerInfoMapper.selectByPrimaryKey(dfid);
            return ShcpResult.ok(developerInfo);
        } else  if(Objects.equals("p", type)){
            //组织名称
            DeveloperInfoExample example = new DeveloperInfoExample();
            example.createCriteria().andDcnameEqualTo(wd);
            List<DeveloperInfo> developerInfo = developerInfoMapper.selectByExample(example);
            return ShcpResult.ok(developerInfo);
        }
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult showDeveloperExamp(String DID) {
        long did;
        try {
            did = Long.parseLong(DID);
        } catch (NumberFormatException e) {
            log.info("input DID is invaild data DID:{}", DID);
            return ShcpResult.build(702, "输入的开发者编号不存在");
        }
        DeveloperInfoExample example = new DeveloperInfoExample();
        example.createCriteria().andDidEqualTo(did);
        List<DeveloperInfo> developerInfo = developerInfoMapper.selectByExample(example);
        return ShcpResult.ok(developerInfo);
    }

    @Override
    public ShcpResult submitDeveloperExamp(Long DFID, byte is_open,String info) {
        DeveloperInfo developerInfo = developerInfoMapper.selectByPrimaryKey(DFID);
        if(Objects.isNull(developerInfo)){
            return ShcpResult.build(704, "输入的是无效的开发者审核信息编号");
        }
        // 字节1为通过，字节0为未通过
        if(is_open == 0){
            return ShcpResult.ok(info);
        }

        Long did = developerInfo.getDid();
        Developer developer = developerMapper.selectByPrimaryKey(did);
        // 更改developer里的审核状态
        developer.setIsPass((byte)1);
        // 更改developerInfo里的审核状态
        developerInfo.setDcstatus((byte)1);

        if(developerMapper.updateByPrimaryKey(developer) == 1 &&
                developerInfoMapper.updateByPrimaryKey(developerInfo) == 1 ){
            log.info("modify deviceInfo DFID:{} DCSTATUS:{} DID:{} DCSTATUS:{}", DFID, is_open, did, is_open);
            return ShcpResult.ok();
        }
        return ShcpResult.build(705, "无效修改");
    }

    @Override
    public ShcpResult modifyDeveloperLimit(Long DID, Short DLID, Boolean dlstatus) {

        DeveloperLimitRelationshipExample example = new DeveloperLimitRelationshipExample();
        example.createCriteria().andDidEqualTo(DID).andDlidEqualTo(DLID);
        DeveloperLimitRelationship developerLimitRelationship = developerLimitRelationshipMapper.selectByExample(example).get(0);

        if(Objects.isNull(developerLimitRelationship)){
            return ShcpResult.build(707, "没有相应的设备权限");
        }
        developerLimitRelationship.setDlstatus(true);
        if(developerLimitRelationshipMapper.updateByPrimaryKey(developerLimitRelationship) == 1){
            log.info("modify developerLimitRelationship DID:{} DLID:{} dlstatus:{}", DID, DLID,dlstatus);
            return ShcpResult.ok();
        }

        return ShcpResult.build(705, "无效修改");
    }


}
