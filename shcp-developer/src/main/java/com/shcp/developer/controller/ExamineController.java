package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.developer.service.ExamineService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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
        TbDeveloper tbDeveloper = (TbDeveloper) session.getAttribute("duser");
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
}
