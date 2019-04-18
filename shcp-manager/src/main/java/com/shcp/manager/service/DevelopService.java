package com.shcp.manager.service;

import com.shcp.pojo.Developer;

import java.util.List;

/**
 * @author Yuki
 * @date 2019/4/6 16:17
 */
public interface DevelopService {

    List<Developer> findDevelops(String wd, String type);


}
