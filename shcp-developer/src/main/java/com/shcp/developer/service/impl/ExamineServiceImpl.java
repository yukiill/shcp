package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeveloperinfoMapper;
import com.shcp.developer.pojo.ExamineStatus;
import com.shcp.developer.service.ExamineService;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.Developerinfo;
import com.shcp.pojo.TbDeveloper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
}
