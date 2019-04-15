package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.StringUtil;
import com.shcp.developer.service.DeveloperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/6 17:44
 */
@Slf4j
@Controller
@RequestMapping("/duser")
public class DeveloperController {

    @Resource
    private DeveloperService developerService;

    @RequestMapping("/cancellation")
    @ResponseBody
    public ShcpResult cancellation(@RequestParam Long devID, Object bw){
        if(developerService.devCancellation(devID)){
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500, "注销失败");
        }
    }

    @PostMapping(value = "/changePwd")
    @ResponseBody
    public ShcpResult changePwd(String nPwd, String rPwd, String email, Object bw, HttpServletRequest request){
        TbDeveloper tbDeveloper = (TbDeveloper) request.getSession().getAttribute("duser");
        if(StringUtils.isEmpty(nPwd)){
            return ShcpResult.build(706, "密码不能为空");
        }
        if(Objects.equals(nPwd, rPwd)){
            return ShcpResult.build(707, "密码和重复密码不一致");
        }
        if(!StringUtil.isCorrect(email)){
            return ShcpResult.build(708, "邮箱格式不正确");
        }
        tbDeveloper.setPassword(nPwd);
        developerService.changePwd(tbDeveloper);
        return ShcpResult.ok();
    }
}
