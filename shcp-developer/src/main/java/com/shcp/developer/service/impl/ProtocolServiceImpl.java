package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.developer.service.ProtocolService;
import com.shcp.pojo.Developer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Yuki
 * @date 2019/4/11 21:15
 */
@Slf4j
@Service
public class ProtocolServiceImpl implements ProtocolService{

    @Override
    public ShcpResult agreeDevProtocol(Developer tbDeveloper, String isAgree) {
        //TODO 等待新的表结构后，将同意的记录插入到数据库中
        return null;
    }
}
