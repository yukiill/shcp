package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.developer.service.FeedbackService;
import com.shcp.pojo.Developer;
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

    @RequestMapping(value = "/submitfb")
    @ResponseBody
    public Object submitFeedback(@RequestParam String FbContent, @RequestParam String FbTitle, @RequestParam String FbType,
                                 @RequestParam(required = false) Object bw){
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
        if(StringUtils.isEmpty(FbContent)){
            return CorsUtil.format(ShcpResult.build(702, "反馈内容不能为空"));
        }
        if(StringUtils.isEmpty(FbTitle)){
            return CorsUtil.format(ShcpResult.build(703, "反馈标题不能为空"));
        }
        if(Objects.isNull(FbType)){
            return CorsUtil.format(ShcpResult.build(704, "反馈类型不能为空"));
        }
        return CorsUtil.format(feedbackService.submitDevFeedback(tbDeveloper, FbContent, FbTitle));
    }

    @RequestMapping("/repies")
    @ResponseBody
    public Object showReplies(@RequestParam(required = false) Long FID, @RequestParam(defaultValue = "10", required = false) int rows,
                              @RequestParam(defaultValue = "1", required = false) int page){
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
        return CorsUtil.format(feedbackService.getAllRepies(tbDeveloper, FID, rows, page));
    }


    @RequestMapping("/replyfb")
    @ResponseBody
    public Object addReply(@RequestParam String FbId, @RequestParam String fbContent, @RequestParam(required = false) Object bw){
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
        return CorsUtil.format(feedbackService.replyFeedback(tbDeveloper, FbId, fbContent));
    }

    @RequestMapping("/showfb")
    @ResponseBody
    public Object getFeedback(@RequestParam String FbId, @RequestParam(required = false) Object bw){
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
        return CorsUtil.format(feedbackService.getFeedbackByFID(tbDeveloper, FbId));
    }

    @RequestMapping("/searchfb")
    @ResponseBody
    public Object searchFeedback(){
        //TODO 需要修复
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
        return CorsUtil.format("asd");
    }

    @RequestMapping("/browsefb")
    @ResponseBody
    public Object getAllReply(@RequestParam Long FID, @RequestParam(defaultValue = "10", required = false) int rows,
                              @RequestParam(defaultValue = "1", required = false) int page, @RequestParam(required = false) Object bw){
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
        return CorsUtil.format(feedbackService.getAllRepies(tbDeveloper, FID, rows, page));
    }
}
