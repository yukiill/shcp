package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.DeveloperMapper;
import com.shcp.dao.mapper.FeedbackMapper;
import com.shcp.developer.service.DeveloperService;
import com.shcp.developer.utils.FileUtil;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.Developer;
import com.shcp.pojo.DeveloperExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/4/6 17:24
 */
@Slf4j
@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Resource
    private DeveloperMapper developerMapper;
    @Resource
    private FeedbackMapper feedbackMapper;

    @Override
    public Developer devLogin(String username, String password, String TerID) {
        DeveloperExample example = new DeveloperExample();
        example.createCriteria()
                .andUsernameEqualTo(username)
                .andPasswordEqualTo(password);
        return developerMapper.selectByExample(example).get(0);
    }

    @Override
    public Developer devRegister(String username, String password, String email, String TerID) {
        Developer tbDeveloper = new Developer();
        tbDeveloper.setEmail(email);
        tbDeveloper.setUsername(username);
        tbDeveloper.setPassword(password);
        tbDeveloper.setImg(FileUtil.DEFAULT_IMAGE_URL);
        tbDeveloper.setDid(IdGenerator.generateDeveloporId());
        tbDeveloper.setIsPass((byte) 0);
        developerMapper.insertSelective(tbDeveloper);
        log.info("insert developer:{} success", tbDeveloper);
        return tbDeveloper;
    }

    @Override
    public Boolean devNameIsPresent(String username) {
        DeveloperExample example = new DeveloperExample();
        example.createCriteria()
                .andUsernameEqualTo(username);
        return developerMapper.selectByExample(example).size() > 0;
    }

    @Override
    public Boolean devCancellation(Long DEId) {
        log.info("delete devID:{} success", DEId);
        return developerMapper.deleteByPrimaryKey(DEId) == 1;
    }

    @Override
    public ShcpResult changePwd(Developer tbDeveloper) {
        developerMapper.updateByPrimaryKeySelective(tbDeveloper);
        log.info("devID:{} change pwd success", tbDeveloper.getDid());
        return ShcpResult.ok();
    }

    @Override
    public boolean emailIsPresent(String email) {
        return !StringUtils.isEmpty(developerMapper.selectByEmail(email));
    }
}
