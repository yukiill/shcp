package com.shcp.manager.service.impl;

import com.shcp.manager.service.DevelopService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuki
 * @date 2019/4/6 16:57
 */
public class DeviceServiceImpl implements DevelopService{

    @Resource
    private DevelopService developService;

    @Override
    public List<TbDeveloper> findDevelops(String wd, String type) {
        return null;
    }
}
