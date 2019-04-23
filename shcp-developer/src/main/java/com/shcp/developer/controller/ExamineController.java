package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.developer.service.ExamineService;
import com.shcp.pojo.Developer;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/11 11:21
 */
@Slf4j
@Controller("/duser")
public class ExamineController {

    @Resource
    private ExamineService examineService;
    @Resource
    private HttpSession session;

    @RequestMapping("/examine")
    @ResponseBody
    public Object submitExamine(@RequestParam String dcName, @RequestParam String dcAddr,@RequestParam String crType, @RequestParam String dcNumber){
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
        if(StringUtils.isEmpty(dcName)){
            return CorsUtil.format(ShcpResult.build(716, "组织名不能为空"));
        }
        if(StringUtils.isEmpty(dcAddr)){
            return CorsUtil.format(ShcpResult.build(717, "组织地址不能为空"));
        }
        if(StringUtils.isEmpty(crType)){
            return CorsUtil.format(ShcpResult.build(718, "相关证件类型不能为空"));
        }
        if(StringUtils.isEmpty(dcNumber)){
            return CorsUtil.format(ShcpResult.build(719, "相关证件号不能为空"));
        }
        return examineService.submitExamine(tbDeveloper,dcName, dcAddr, crType, dcNumber);
    }

    @RequestMapping("/showDevExamineStatus")
    @ResponseBody
    public Object showExamineStatus(@RequestParam(required = false) Object bw){
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
        return CorsUtil.format(examineService.showDevExamineStatus(tbDeveloper));
    }

    @RequestMapping("/modifyExamine")
    @ResponseBody
    public Object modifyExamineInfo(@RequestParam(defaultValue = "", required = false) String dcName,
                                    @RequestParam(defaultValue = "", required = false) String dcAddr,
                                    @RequestParam(defaultValue = "", required = false) String crType,
                                    @RequestParam(defaultValue = "", required = false) String dcNumber,
                                    @RequestParam(required = false) Object bw){
        if(Objects.equals("", dcName) && Objects.equals("", dcAddr) && Objects.equals("", dcNumber)){
            return CorsUtil.format(ShcpResult.build(721, "请输入有效的修改"));
        }
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
        return CorsUtil.format(examineService.modifiedExamineInfo(tbDeveloper, dcName, dcAddr, dcNumber));
    }
}
