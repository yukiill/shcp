package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.common.utils.StringUtil;
import com.shcp.developer.service.DeveloperService;
import com.shcp.developer.utils.RegisterCachePool;
import com.shcp.pojo.TbDeveloper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/11 10:35
 */
@Slf4j
@Controller
@RequestMapping("/duser")
public class LoginController {

    @Resource
    private DeveloperService developerService;
    @Resource
    private HttpSession session;

    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public Object login(@RequestParam String userName, @RequestParam String password,
                        @RequestParam(required = false) String TerID, @RequestParam(required = false) String pageID,
                        @RequestParam(required = false) Object bw){
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            return CorsUtil.format(ShcpResult.build(650, "用户名或密码为空"));
        }
        TbDeveloper tbDeveloper = developerService.devLogin(userName, password, TerID);
        if(Objects.isNull(tbDeveloper)){
            CorsUtil.format(ShcpResult.build(651, "用户名或密码错误"));
        }
        session.setAttribute("duser", tbDeveloper);
        return CorsUtil.format(ShcpResult.ok());
    }

    @RequestMapping("/logout")
    @ResponseBody
    public Object logout(HttpServletRequest request){
        session.removeAttribute("duser");
        return CorsUtil.format(ShcpResult.ok());
    }

    @RequestMapping(value = "/register", method = {RequestMethod.POST})
    public Object register(@RequestParam String userName, @RequestParam String password,
                           @RequestParam String repassword, @RequestParam String email, @RequestParam(required = false) String pageID,
                           @RequestParam(required = false) String TerID, @RequestParam(required = false) Object bw,
                           Model model){
        RegisterCachePool registerCachePool = RegisterCachePool.getInstance();
        if(StringUtils.isEmpty(userName)){
            return CorsUtil.format(ShcpResult.build(710, "用户名为空"));
        } else {
            if(developerService.devNameIsPresent(userName) || registerCachePool.isUsernameExistInCache(userName)){
                return CorsUtil.format(ShcpResult.build(652, "用户名已注册"));
            }
        }
        if(!Objects.equals(password, repassword)){
            return CorsUtil.format(ShcpResult.build(653, "密码和重复密码不一致"));
        }
        if(!StringUtil.isCorrect(email)){
            return CorsUtil.format(ShcpResult.build(654, "邮箱格式错误"));
        }
        if(developerService.emailIsPresent(email)){
            return CorsUtil.format(ShcpResult.build(712, "邮箱已被绑定"));
        }
        TbDeveloper tbDeveloper = developerService.devRegister(userName, password, email, TerID);
        long time = System.nanoTime();
        registerCachePool.add(tbDeveloper, time);
        return CorsUtil.format(ShcpResult.ok());
    }
}
