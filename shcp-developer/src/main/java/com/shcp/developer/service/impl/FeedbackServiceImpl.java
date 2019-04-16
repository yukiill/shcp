package com.shcp.developer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.TbReplyMapper;
import com.shcp.dao.mapper.TbUserfeedbackMapper;
import com.shcp.developer.service.FeedbackService;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.TbDeveloper;
import com.shcp.pojo.TbReply;
import com.shcp.pojo.TbUserfeedback;
import com.shcp.pojo.TbUserfeedbackExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuki
 * @date 2019/4/11 10:56
 */
@Slf4j
@Service
public class FeedbackServiceImpl implements FeedbackService{

    @Resource
    private TbUserfeedbackMapper tbUserfeedbackMapper;
    @Resource
    private TbReplyMapper tbReplyMapper;

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

    @Override
    public ShcpResult getAllRepies(TbDeveloper tbDeveloper, Long FID, int rows, int page) {
        PageHelper.startPage(page, rows);
        List<TbReply> tbReplyList = tbReplyMapper.getRepliesWithBLOBsForDev(tbDeveloper.getDid(),FID);
        PageInfo<TbReply> pageInfo = new PageInfo<>(tbReplyList);
        return ShcpResult.ok(pageInfo.getList());
    }

    @Override
    public ShcpResult getAllFeedback(TbDeveloper tbDeveloper, int rows, int page) {
        PageHelper.startPage(page, rows);
        List<TbUserfeedback> tbUserfeedbacks = tbUserfeedbackMapper.selectByExample(new TbUserfeedbackExample());
        PageInfo<TbUserfeedback> pageInfo = new PageInfo<>(tbUserfeedbacks);
        log.info("devId:{} query all feedback rows:{} page:{}", tbDeveloper.getDid(), rows, page);
        return ShcpResult.ok(pageInfo.getList());
    }

    @Override
    public ShcpResult getFeedbackByWd(TbDeveloper tbDeveloper, String wd, int rows, int page) {
        TbUserfeedbackExample example = new TbUserfeedbackExample();
        //TODO 讨论后再写
        return null;
    }

    @Override
    public ShcpResult replyFeedback(TbDeveloper tbDeveloper, String FbId, String fbContent) {
        TbReply tbReply = new TbReply();
        long FID;
        try {
            FID = Long.parseLong(FbId);
        } catch (NumberFormatException e) {
            log.info("input FID:{} is invalid", FbId);
            return ShcpResult.build(726, "没有相应的反馈编号");
        }
        tbReply.setFid(FID);
        tbReply.setRrid(tbDeveloper.getDid());
        tbReply.setRcontent(fbContent);
        tbReplyMapper.insertSelective(tbReply);
        log.info("devId:{} insert new reply to FID:{} success", tbDeveloper.getDid(), FID);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getFeedbackByFID(TbDeveloper tbDeveloper, String FbId) {
        long FID;
        try {
            FID = Long.parseLong(FbId);
        } catch (NumberFormatException e) {
            FID = 0;
        }
        TbUserfeedbackExample tbUserfeedbackExample = new TbUserfeedbackExample();
        tbUserfeedbackExample.createCriteria()
                .andDidEqualTo(tbDeveloper.getDid())
                .andFidEqualTo(FID);
        TbUserfeedback tbUserfeedback = tbUserfeedbackMapper.selectByExample(tbUserfeedbackExample).get(0);
        log.info("devId:{} get feedback FID:{} success", tbDeveloper.getDid(), FID);
        return ShcpResult.ok(tbUserfeedback);
    }
}
