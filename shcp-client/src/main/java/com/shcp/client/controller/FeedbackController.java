package com.shcp.client.controller;

import com.shcp.client.service.FeedbackService;
import com.shcp.client.service.UserService;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/9 15:34
 */
@Slf4j
@Controller
public class FeedbackController {

    @Resource
    private FeedbackService feedbackService;
    @Resource
    private HttpSession session;

    @RequestMapping(value = "/user/feedback")
    @ResponseBody
    public Object submitFeedback(String content, String title, Short type, Long to_user_id, @RequestParam(required = false) Object bw){
        User user = (User) session.getAttribute("user");
        if(StringUtils.isEmpty(content)){
            return CorsUtil.format(ShcpResult.build(702, "反馈内容不能为空"));
        }
        if(StringUtils.isEmpty(title)){
            return CorsUtil.format(ShcpResult.build(703, "反馈标题不能为空"));
        }
        if(Objects.isNull(type)){
            return CorsUtil.format(ShcpResult.build(704, "反馈类型不能为空"));
        }
        return CorsUtil.format(feedbackService.submitFeedback(user, content, title, type, to_user_id));
    }

    @RequestMapping(value = "/user/replies/all")
    @ResponseBody
    public Object getAllReplies(@RequestParam(defaultValue = "1", required = false) int page,
                                @RequestParam(defaultValue = "20", required = false) int rows){
        User user = (User) session.getAttribute("user");
        return CorsUtil.format(feedbackService.getAllReplies(user.getUid(), page, rows));
    }

    @RequestMapping(value = "/user/replies/{RID}")
    @ResponseBody
    public Object showReplyInfo(@PathVariable Long RID){
        User user = (User) session.getAttribute("user");
        return CorsUtil.format(feedbackService.getReplyById(RID));
    }
}
