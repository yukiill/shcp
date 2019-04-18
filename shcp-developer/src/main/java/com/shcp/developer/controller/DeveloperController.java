package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.common.utils.StringUtil;
import com.shcp.developer.service.DeveloperService;
import com.shcp.developer.service.EmailService;
import com.shcp.developer.utils.CookieUtil;
import com.shcp.pojo.Developer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
    @Resource
    private EmailService emailService;
    @Resource
    private HttpSession session;

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
        Developer tbDeveloper = (Developer) session.getAttribute("duser");
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

    @RequestMapping(value = "/forgetPwd")
    @ResponseBody
    public Object forgetPwd(@RequestParam String nPwd, @RequestParam String rPwd, @RequestParam String email,
                            @RequestParam(required = false) Object bw, HttpServletRequest request, HttpServletResponse response){
        if(!Objects.equals(nPwd, rPwd)){
            return CorsUtil.format(ShcpResult.build(653, "密码和重复密码不一致"));
        }
        if(!StringUtil.isCorrect(email)){
            if(!StringUtil.isCorrect(email)){
                return CorsUtil.format(ShcpResult.build(654, "邮箱格式错误"));
            }
        }
        if(!developerService.emailIsPresent(email)){
            return CorsUtil.format(ShcpResult.build(715, "邮箱未绑定"));
        }
        CookieUtil.addCookie(request, response);
        return emailService.sendForgetPassEmail(Long.parseLong(CookieUtil.getCookieValue(request)), email, nPwd, false);
    }
}
