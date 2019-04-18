package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Developer;

/**
 * @author Yuki
 * @date 2019/4/11 21:13
 */
public interface ProtocolService {

    ShcpResult agreeDevProtocol(Developer tbDeveloper, String isAgree);
}
