package com.shcp.developer.service.impl;

import com.mysql.cj.api.Session;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeveloperMapper;
import com.shcp.developer.service.ProtocolService;
import com.shcp.pojo.Developer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author Yuki
 * @date 2019/4/11 21:15
 */
@Slf4j
@Service
public class ProtocolServiceImpl implements ProtocolService{

    @Resource
    private DeveloperMapper developerMapper;

    @Override
    public ShcpResult agreeDevProtocol(Developer tbDeveloper, Integer isAgree) {
        tbDeveloper.setIsAgree(isAgree.byteValue());
        developerMapper.updateByPrimaryKeySelective(tbDeveloper);
        log.info("devId:{} agree developerProtocol", tbDeveloper.getDid());
        return ShcpResult.ok();
    }
}
