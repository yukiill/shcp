package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeveloperinfoMapper;
import com.shcp.developer.pojo.ExamineStatus;
import com.shcp.developer.service.ExamineService;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.Developerinfo;
import com.shcp.pojo.TbDeveloper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/11 11:03
 */
@Slf4j
@Service
public class ExamineServiceImpl implements ExamineService{

    @Resource
    private DeveloperinfoMapper developerinfoMapper;

    @Override
    public ShcpResult submitExamine(TbDeveloper tbDeveloper, String dcName, String dcAddr, String crType, String dcNumber) {
        Developerinfo developerinfo = new Developerinfo();
        developerinfo.setDcaddr(dcAddr);
        developerinfo.setDcname(dcName);
        developerinfo.setDid(tbDeveloper.getDid());
        developerinfo.setDcstatus(ExamineStatus.AUDITING);
        developerinfo.setDcnumber(dcNumber);
        developerinfo.setDcid(IdGenerator.generateExamineId());
        developerinfo.setDcaid((long) 0);
        developerinfoMapper.insertSelective(developerinfo);
        log.info("developerinfo:{} insert success", developerinfo);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult showDevExamineStatus(TbDeveloper tbDeveloper) {
        Developerinfo developerinfo = developerinfoMapper.selectByPrimaryKey(tbDeveloper.getDcid());
        if(Objects.isNull(developerinfo)){
            return ShcpResult.build(720, "没有相关的开发者审核信息");
        }
        log.info("developerId:{} query opposite examine examineId:{} info success", tbDeveloper.getDid(), developerinfo.getDcid());
        return ShcpResult.ok(developerinfo);
    }

    @Override
    public ShcpResult modifiedExamineInfo(TbDeveloper tbDeveloper, String dcName, String dcAddr, String dcNumber) {
        Developerinfo developerinfo = developerinfoMapper.selectByPrimaryKey(tbDeveloper.getDcid());
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
        log.info("developerId:{} modified examineInfo examineId:{} success", tbDeveloper.getDid(), developerinfo.getDcid());
        return ShcpResult.ok();
    }
}
