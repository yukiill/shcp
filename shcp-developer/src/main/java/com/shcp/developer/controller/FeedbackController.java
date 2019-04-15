package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.developer.service.FeedbackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/11 10:54
 */
@Slf4j
@Controller
@RequestMapping("/duser")
public class FeedbackController {

    @Resource
    private FeedbackService feedbackService;
    @Resource
    private HttpSession session;

    @RequestMapping(value = "/feedback")
    @ResponseBody
    public Object submitFeedback(String content, String title, Short type, Object bw){
        TbDeveloper tbDeveloper = (TbDeveloper) session.getAttribute("duser");
        if(StringUtils.isEmpty(content)){
            return CorsUtil.format(ShcpResult.build(702, "反馈内容不能为空"));
        }
        if(StringUtils.isEmpty(title)){
            return CorsUtil.format(ShcpResult.build(703, "反馈标题不能为空"));
        }
        if(Objects.isNull(type)){
            return CorsUtil.format(ShcpResult.build(704, "反馈类型不能为空"));
        }
        return CorsUtil.format(feedbackService.submitDevFeedback(tbDeveloper, content, title));
    }
}
