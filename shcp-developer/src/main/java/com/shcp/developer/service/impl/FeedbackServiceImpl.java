package com.shcp.developer.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.FeedbackMapper;
import com.shcp.dao.mapper.ReplyMapper;
import com.shcp.developer.service.FeedbackService;
import com.shcp.developer.utils.IdGenerator;
import com.shcp.pojo.*;
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
    private FeedbackMapper feedbackMapper;
    @Resource
    private ReplyMapper replyMapper;

    @Override
    public ShcpResult submitDevFeedback(Developer tbDeveloper, String content, String title) {
        Feedback feedback = new Feedback();
        feedback.setFcontent(content);
        feedback.setFid(IdGenerator.generateFeedbackId());
        feedback.setFromUserType((byte) 2);
        feedback.setToUserId((long) 0);
        feedback.setFromUserId(tbDeveloper.getDid());
        feedback.setIsCheck((byte) 0);
        feedback.setIsReply((byte) 0);
        feedbackMapper.insertSelective(feedback);
        log.info("devID:{} submit feedback success", tbDeveloper.getDid());
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getAllRepies(Developer tbDeveloper, Long FID, int rows, int page) {
        //TODO 拆分成分页和单独查询
        PageHelper.startPage(page, rows);
        ReplyExample example = new ReplyExample();
        example.createCriteria()
                .andToUserIdEqualTo(tbDeveloper.getDid());
        List<Reply> tbReplyList = replyMapper.selectByExample(example);
        PageInfo<Reply> pageInfo = new PageInfo<>(tbReplyList);
        return ShcpResult.ok(pageInfo.getList());
    }

    @Override
    public ShcpResult getAllFeedback(Developer tbDeveloper, int rows, int page) {
        PageHelper.startPage(page, rows);
        List<Feedback> tbUserfeedbacks = feedbackMapper.selectByExample(new FeedbackExample());
        PageInfo<Feedback> pageInfo = new PageInfo<>(tbUserfeedbacks);
        log.info("devId:{} query all feedback rows:{} page:{}", tbDeveloper.getDid(), rows, page);
        return ShcpResult.ok(pageInfo.getList());
    }

    @Override
    public ShcpResult getFeedbackByWd(Developer tbDeveloper, String wd, int rows, int page) {
        FeedbackExample example = new FeedbackExample();
        //TODO 讨论后再写
        return null;
    }

    @Override
    public ShcpResult replyFeedback(Developer tbDeveloper, String FbId, String fbContent) {
        Reply tbReply = new Reply();
        long FID;
        try {
            FID = Long.parseLong(FbId);
        } catch (NumberFormatException e) {
            log.info("input FID:{} is invalid", FbId);
            return ShcpResult.build(726, "没有相应的反馈编号");
        }
        tbReply.setFid(FID);
        tbReply.setDid(tbDeveloper.getDid());
        tbReply.setRcontent(fbContent);
        //TODO 添加一个标题的普通用户ID
        tbReply.setToUserId(new Long(0));
        replyMapper.insertSelective(tbReply);
        log.info("devId:{} insert new reply to FID:{} success", tbDeveloper.getDid(), FID);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getFeedbackByFID(Developer tbDeveloper, String FbId) {
        //TODO 接口作用不清晰，需要切分
        long FID;
        try {
            FID = Long.parseLong(FbId);
        } catch (NumberFormatException e) {
            FID = 0;
        }
        FeedbackExample tbUserfeedbackExample = new FeedbackExample();
        tbUserfeedbackExample.createCriteria()
                .andToUserIdEqualTo(tbDeveloper.getDid())
                .andFidEqualTo(FID);
        Feedback tbUserfeedback = feedbackMapper.selectByExample(tbUserfeedbackExample).get(0);
        log.info("devId:{} get feedback FID:{} success", tbDeveloper.getDid(), FID);
        return ShcpResult.ok(tbUserfeedback);
    }
}
