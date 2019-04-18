package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Developer;

/**
 * @author Yuki
 * @date 2019/4/11 10:59
 */
public interface ExamineService {

    ShcpResult submitExamine(Developer tbDeveloper, String dcName, String dcAddr, String crType, String dcNumber);

    ShcpResult showDevExamineStatus(Developer tbDeveloper);

    ShcpResult modifiedExamineInfo(Developer tbDeveloper, String dcName, String dcAddr, String dcNumber);
}
