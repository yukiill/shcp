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
import java.util.Objects;

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

    private static final byte INIT_CHECK = 0;
    private static final byte INIT_REPLY = 0;
    private static final byte DEVELOPER_TYPE = 0;
    private static final long TO_MANAGER = 0;

    @Override
    public ShcpResult submitDevFeedback(Developer tbDeveloper, String content, String title) {
        Feedback feedback = new Feedback();
        feedback.setFcontent(content);
        feedback.setFid(IdGenerator.generateFeedbackId());
        feedback.setFromUserType(DEVELOPER_TYPE);
        feedback.setToUserId(TO_MANAGER);
        feedback.setFromUserId(tbDeveloper.getDid());
        feedback.setIsCheck(INIT_CHECK);
        feedback.setIsReply(INIT_REPLY);
        feedbackMapper.insertSelective(feedback);
        log.info("devID:{} submit feedback success", tbDeveloper.getDid());
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getAllRepies(Developer tbDeveloper, int rows, int page) {
        PageHelper.startPage(page, rows);
        ReplyExample example = new ReplyExample();
        example.createCriteria()
                .andToUserIdEqualTo(tbDeveloper.getDid());
        List<Reply> tbReplyList = replyMapper.selectByExample(example);
        PageInfo<Reply> pageInfo = new PageInfo<>(tbReplyList);
        log.info("devId:{} get page:{} rows:{} replyData success", tbDeveloper.getDid(), page, rows);
        return ShcpResult.ok(pageInfo);
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
    public ShcpResult replyFeedback(Developer developer, long FID, long UID, String rContent, String rTitle) {
        Reply tbReply = new Reply();
        tbReply.setFid(FID);
        tbReply.setDid(developer.getDid());
        tbReply.setRcontent(rContent);
        tbReply.setRtitle(rContent);
        tbReply.setToUserId(UID);
        tbReply.setRid(IdGenerator.generateReplyId());
        replyMapper.insertSelective(tbReply);
        log.info("devId:{} insert new reply to FID:{} success", developer.getDid(), FID);
        return ShcpResult.ok();
    }

    @Override
    public ShcpResult getFeedbackByFID(long FID) {
        Feedback feedback = feedbackMapper.selectByPrimaryKey(FID);
        log.info("feedback FID:{} success", FID);
        return ShcpResult.ok(feedback);
    }
}
