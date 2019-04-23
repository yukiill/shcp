package com.shcp.developer.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Developer;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Yuki
 * @date 2019/4/11 10:59
 */
public interface ExamineService {

    ShcpResult submitExamine(Developer tbDeveloper, String dcName, String dcAddr, String crType, String dcNumber);

    ShcpResult submitExamine(Developer tbDeveloper, String dcName, String dcAddr,
                             String crType, String dcNumber, MultipartFile positive, MultipartFile negitive);

    ShcpResult showDevExamineStatus(Developer tbDeveloper);

    ShcpResult modifiedExamineInfo(Developer tbDeveloper, String dcName, String dcAddr, String dcNumber);
}
