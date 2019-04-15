package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.TbDeveloper;

/**
 * @author Yuki
 * @date 2019/4/11 21:13
 */
public interface ProtocolService {

    ShcpResult agreeDevProtocol(TbDeveloper tbDeveloper, String isAgree);
}
