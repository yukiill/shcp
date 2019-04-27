package com.shcp.manager.service;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.Developer;

/**
 * @author CYZ
 * @date 2019/4/27 12:00
 */
public interface DeveloperService {

    //开发者相关
    Developer searchDeveloper(String DID);
    ShcpResult findDeveloper(String wd,String type);
    ShcpResult showDeveloper(String DID);
    ShcpResult modifyDeveloperInfo(String DID,String wd,String type);

    //开发者审核信息相关
    ShcpResult findDeveloperExamp(String wd, String type);
    ShcpResult showDeveloperExamp(String DID);
    ShcpResult submitDeveloperExamp(Long DFID,byte is_open,String info);

    //开发者权限相关
    ShcpResult modifyDeveloperLimit(Long DID,Short DLID,Boolean dlstatus);


}