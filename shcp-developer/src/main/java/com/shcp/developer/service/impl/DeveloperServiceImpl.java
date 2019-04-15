package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.TbDeveloperMapper;
import com.shcp.dao.mapper.TbUserfeedbackMapper;
import com.shcp.developer.service.DeveloperService;
import com.shcp.developer.utils.FileUtil;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.TbDeveloper;
import com.shcp.pojo.TbDeveloperExample;
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
    private TbDeveloperMapper tbDeveloperMapper;
    @Resource
    private TbUserfeedbackMapper tbUserfeedbackMapper;

    @Override
    public TbDeveloper devLogin(String username, String password, String TerID) {
        TbDeveloperExample example = new TbDeveloperExample();
        example.createCriteria()
                .andDevnameEqualTo(username)
                .andPasswordEqualTo(password);
        return tbDeveloperMapper.selectByExample(example).get(0);
    }

    @Override
    public TbDeveloper devRegister(String username, String password, String email, String TerID) {
        TbDeveloper tbDeveloper = new TbDeveloper();
        tbDeveloper.setDemail(email);
        tbDeveloper.setDevname(username);
        tbDeveloper.setPassword(password);
        tbDeveloper.setDhimg(FileUtil.DEFAULT_IMAGE_URL);
        tbDeveloper.setDid(IdGenerator.generateDeveloporId());
//        tbDeveloper.setDcid();
//        tbDeveloper.setDsub();
        tbDeveloper.setDlimit(0);
        tbDeveloper.setDstatus((byte) 0);
        tbDeveloperMapper.insertSelective(tbDeveloper);
        log.info("insert developer:{} success", tbDeveloper);
        return tbDeveloper;
    }

    @Override
    public Boolean devNameIsPresent(String username) {
        TbDeveloperExample example = new TbDeveloperExample();
        example.createCriteria()
                .andDevnameEqualTo(username);
        return tbDeveloperMapper.selectByExample(example).size() > 0;
    }

    @Override
    public Boolean devCancellation(Long DEId) {
        log.info("delete devID:{} success", DEId);
        return tbDeveloperMapper.deleteByPrimaryKey(DEId) == 1;
    }

    @Override
    public ShcpResult submitExamine(String dcName, String dcAddr) {
        return null;
    }

    @Override
    public ShcpResult changePwd(TbDeveloper tbDeveloper) {
        tbDeveloperMapper.updateByPrimaryKeySelective(tbDeveloper);
        log.info("devID:{} change pwd success", tbDeveloper.getDid());
        return ShcpResult.ok();
    }

    @Override
    public boolean emailIsPresent(String email) {
        return !StringUtils.isEmpty(tbDeveloperMapper.selectByEmail(email));
    }
}
