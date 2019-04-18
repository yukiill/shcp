package com.shcp.client.controller;

import com.shcp.client.service.EmailService;
import com.shcp.client.service.UserService;
import com.shcp.client.utils.RegisterCachePool;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.common.utils.StringUtil;
import com.shcp.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/7 23:27
 */
@Slf4j
@Controller
public class LoginController {

    @Resource
    private UserService userService;
    @Resource
    private EmailService emailService;

    @RequestMapping(value = "/user/login")
    @ResponseBody
    public Object login(@RequestParam String userName, @RequestParam String password,
                        @RequestParam(required = false) String TerID, @RequestParam(required = false) String pageID,
                        @RequestParam(required = false) Object bw, HttpServletRequest request){
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            return CorsUtil.format(ShcpResult.build(650, "用户名或密码为空"));
        }
        User user = userService.login(userName, password, TerID);
        if(Objects.isNull(user)){
            return CorsUtil.format(ShcpResult.build(651, "用户名或密码错误"));
        }
        request.getSession().setAttribute("user", user);
        return CorsUtil.format(ShcpResult.ok());
    }

    @RequestMapping("/user/logout")
    @ResponseBody
    public Object logout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return CorsUtil.format(ShcpResult.ok());
    }

    @RequestMapping(value = "/user/register")
    @ResponseBody
    public Object register(@RequestParam String userName, @RequestParam String password,
                           @RequestParam String repassword, @RequestParam String email, @RequestParam(required = false) String pageID,
                           @RequestParam(required = false) String TerID, @RequestParam(required = false) Object bw,
                           Model model){
        RegisterCachePool registerCachePool = RegisterCachePool.getInstance();
        if(StringUtils.isEmpty(userName)){
            return CorsUtil.format(ShcpResult.build(710, "用户名为空"));
        } else {
            if(userService.usernameIsPresent(userName) || registerCachePool.isUsernameExistInCache(userName)){
                return CorsUtil.format(ShcpResult.build(652, "用户名已注册"));
            }
        }
        if(!Objects.equals(password, repassword)){
            return CorsUtil.format(ShcpResult.build(653, "密码和重复密码不一致"));
        }
        if(!StringUtil.isCorrect(email)){
            return CorsUtil.format(ShcpResult.build(654, "邮箱格式错误"));
        }
        if(userService.emailIsPresent(email)){
           return CorsUtil.format(ShcpResult.build(712, "邮箱已被绑定"));
        }
        User user = userService.register(userName, password, email, TerID);
        long time = System.nanoTime();
        registerCachePool.add(user, time);
        return emailService.sendCheckEmail(user.getUid(), time, user.getEmail(), false);
    }
}
