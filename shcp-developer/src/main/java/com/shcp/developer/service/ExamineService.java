package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.TbDeveloper;

/**
 * @author Yuki
 * @date 2019/4/11 10:59
 */
public interface ExamineService {

    ShcpResult submitExamine(TbDeveloper tbDeveloper, String dcName, String dcAddr, String crType, String dcNumber);

    ShcpResult showDevExamineStatus(TbDeveloper tbDeveloper);

    ShcpResult modifiedExamineInfo(TbDeveloper tbDeveloper, String dcName, String dcAddr, String dcNumber);
}
