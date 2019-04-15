package com.shcp.developer.service.impl;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.developer.service.FeedbackService;
import com.shcp.developer.utils.IdGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/4/11 10:56
 */
@Slf4j
@Service
public class FeedbackServiceImpl implements FeedbackService{

    @Resource
    private TbUserfeedbackMapper tbUserfeedbackMapper;

    @Override
    public ShcpResult submitDevFeedback(TbDeveloper tbDeveloper, String content, String title) {
        TbUserfeedback tbUserfeedback = new TbUserfeedback();
        tbUserfeedback.setFcontent(content);
        tbUserfeedback.setDid(tbDeveloper.getDid());
        tbUserfeedback.setFid(IdGenerator.generateFeedbackId());
        tbUserfeedback.setFutype((short) 1);
        tbUserfeedback.setUid((long) 0);
        tbUserfeedback.setFreply((byte) 0);
        tbUserfeedback.setFcheck((byte) 0);
        tbUserfeedbackMapper.insertSelective(tbUserfeedback);
        log.info("devID:{} submit feedback success", tbDeveloper.getDid());
        return ShcpResult.ok();
    }
}
