package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;

/**
 * @author Yuki
 * @date 2019/4/11 21:13
 */
public interface ProtocolService {

    ShcpResult agreeDevProtocol(TbDeveloper tbDeveloper, String isAgree);
}
