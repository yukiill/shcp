package com.shcp.client.service.impl;

import com.github.pagehelper.PageHelper;
import com.shcp.client.service.FeedbackService;
import com.shcp.client.utils.IdGenerator;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.dao.mapper.FeedbackMapper;
import com.shcp.dao.mapper.ReplyMapper;
import com.shcp.pojo.Feedback;
import com.shcp.pojo.Reply;
import com.shcp.pojo.ReplyExample;
import com.shcp.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Yuki
 * @date 2019/4/21 15:11
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
    private static final byte USER_TYPE = 1;

    @Override
    public ShcpResult submitFeedback(User user, String content, String title, Short type, long to_user_id) {
        Feedback feedback = new Feedback();
        feedback.setFcontent(content);
        feedback.setFromUserId(user.getUid());
        feedback.setFromUserType(USER_TYPE);
        feedback.setFid(IdGenerator.generateFeedbackId());
        feedback.setFtitle(title);
        feedback.setIsCheck(INIT_CHECK);
        feedback.setIsReply(INIT_REPLY);
        feedback.setToUserId(to_user_id);
        if(feedbackMapper.insertSelective(feedback) == 1){
            log.info("userId:{} submit feedback id:{} success", user.getUid(), feedback.getFid());
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "发生了意料之外的错误");
    }

    @Override
    public ShcpResult getReplyById(long RID) {
        return ShcpResult.ok(replyMapper.selectByPrimaryKey(RID));
    }

    @Override
    public ShcpResult getAllReplies(long UID, int page, int rows) {
        PageHelper.startPage(page, rows);
        ReplyExample replyExample = new ReplyExample();
        replyExample.createCriteria()
                .andToUserIdEqualTo(UID);
        List<Reply> tbReplies = replyMapper.selectByExample(replyExample);
        if(tbReplies != null && tbReplies.size() > 0){
            log.info("UID:{} query replies success", UID);
            return ShcpResult.ok(tbReplies);
        }
        return ShcpResult.build(500, "发生了意料之外的错误");
    }
}
