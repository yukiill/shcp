package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeveloperInfoMapper;
import com.shcp.developer.pojo.ExamineStatus;
import com.shcp.developer.service.ExamineService;
import com.shcp.developer.utils.FileUtil;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.Developer;
import com.shcp.pojo.DeveloperInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/11 11:03
 */
@Slf4j
@Service
public class ExamineServiceImpl implements ExamineService{

    @Resource
    private DeveloperInfoMapper developerinfoMapper;

    @Override
    public ShcpResult submitExamine(Developer tbDeveloper, String dcName, String dcAddr, String crType, String dcNumber) {
        //TODO 添加正反面照片等功能
        DeveloperInfo developerinfo = new DeveloperInfo();
        developerinfo.setDcaddr(dcAddr);
        developerinfo.setDcname(dcName);
        developerinfo.setDid(tbDeveloper.getDid());
        developerinfo.setDcstatus(ExamineStatus.NOT_EXAMINED);
        developerinfo.setDcnumber(dcNumber);
        developerinfo.setDfid(IdGenerator.generateExamineId());
        developerinfoMapper.insertSelective(developerinfo);
        log.info("developerinfo:{} insert success", developerinfo);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult showDevExamineStatus(Developer tbDeveloper) {
        DeveloperInfo developerinfo = developerinfoMapper.selectByPrimaryKey(tbDeveloper.getDfid());
        if(Objects.isNull(developerinfo)){
            return ShcpResult.build(720, "没有相关的开发者审核信息");
        }
        log.info("developerId:{} query opposite examine examineId:{} info success", tbDeveloper.getDid(), developerinfo.getDfid());
        return ShcpResult.ok(developerinfo);
    }

    @Override
    public ShcpResult modifiedExamineInfo(Developer tbDeveloper, String dcName, String dcAddr, String dcNumber) {
        DeveloperInfo developerinfo = developerinfoMapper.selectByPrimaryKey(tbDeveloper.getDfid());
        if(Objects.isNull(developerinfo)){
            return ShcpResult.build(720, "没有相关的开发者审核信息");
        }
        if(!StringUtils.isEmpty(dcName)){
            developerinfo.setDcname(dcName);
        }
        if(!StringUtils.isEmpty(dcAddr)){
            developerinfo.setDcaddr(dcAddr);
        }
        if(!StringUtils.isEmpty(dcNumber)){
            developerinfo.setDcnumber(dcNumber);
        }
        developerinfoMapper.updateByPrimaryKeySelective(developerinfo);
        log.info("developerId:{} modified examineInfo examineId:{} success", tbDeveloper.getDid(), developerinfo.getDfid());
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult submitExamine(Developer tbDeveloper, String dcName, String dcAddr, String crType, String dcNumber, MultipartFile positive, MultipartFile negitive) {
        //TODO 这个接口待测试
        DeveloperInfo developerinfo = new DeveloperInfo();
        developerinfo.setDcaddr(dcAddr);
        developerinfo.setDcname(dcName);
        developerinfo.setDid(tbDeveloper.getDid());
        developerinfo.setDcstatus(ExamineStatus.NOT_EXAMINED);
        developerinfo.setDcnumber(dcNumber);
        developerinfo.setDfid(IdGenerator.generateExamineId());
        String positivePath = FileUtil.uploadFile(tbDeveloper.getUsername(), positive);
        String negitivePath = FileUtil.uploadFile(tbDeveloper.getUsername(), negitive);
        developerinfo.setPositiveimg(positivePath);
        developerinfo.setNegitiveimg(negitivePath);
        developerinfoMapper.insertSelective(developerinfo);
        log.info("developerinfo:{} insert success", developerinfo);
        return ShcpResult.ok();
    }
}
