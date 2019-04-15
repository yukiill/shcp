package com.shcp.client.controller;

import com.shcp.client.service.UserService;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.pojo.TbUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
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
    private UserService userService;
    @Resource
    private HttpSession session;

    @RequestMapping(value = "/user/feedback")
    @ResponseBody
    public Object submitFeedback(String content, String title, Short type, Object bw){
        TbUser tbUser = (TbUser) session.getAttribute("user");
        if(StringUtils.isEmpty(content)){
            return CorsUtil.format(ShcpResult.build(702, "反馈内容不能为空"));
        }
        if(StringUtils.isEmpty(title)){
            return CorsUtil.format(ShcpResult.build(703, "反馈标题不能为空"));
        }
        if(Objects.isNull(type)){
            return CorsUtil.format(ShcpResult.build(704, "反馈类型不能为空"));
        }
        return CorsUtil.format(userService.submitFeedback(tbUser, content, title, type));
    }

    @RequestMapping(value = "/user/Replyfb")
    @ResponseBody
    public Object showReplyInfo(@RequestParam(required = false) String UfbID){
        TbUser tbUser = (TbUser) session.getAttribute("user");
        return CorsUtil.format(userService.getAllReplies(tbUser.getUid(), UfbID));
    }
}
