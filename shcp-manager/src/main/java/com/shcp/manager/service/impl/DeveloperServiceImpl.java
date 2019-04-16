package com.shcp.manager.service.impl;

import com.shcp.dao.mapper.TbDeveloperMapper;
import com.shcp.manager.service.DeveloperService;
import com.shcp.pojo.TbDeveloper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author CYZ
 * @date 2019/4/16 20:40
 */
@Slf4j
@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Resource
    private TbDeveloperMapper tbDeveloperMapper;

    @Override
    public TbDeveloper searchDeveloper(String Did) {
        Long _did;
        try {
            _did = Long.parseLong(Did);
        } catch (NumberFormatException e) {
            log.info("input Did is invaild data Did:{}", Did);
            return null;
        }
        log.info("search _did:{} device success", Did);
        return tbDeveloperMapper.selectByPrimaryKey(_did);
    }
}
