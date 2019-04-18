package com.shcp.manager.service;

import com.shcp.pojo.Developer;

/**
 * @author CYZ
 * @date 2019/4/16 20:39
 */
public interface DeveloperService {
    Developer searchDeveloper(String DVID);
}