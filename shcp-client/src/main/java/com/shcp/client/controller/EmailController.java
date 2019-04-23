package com.shcp.client.controller;

import com.shcp.client.service.EmailService;
import com.shcp.client.service.UserService;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/3/25 22:47
 */
@Slf4j
@Controller
@RequestMapping("/email")
public class EmailController {

    @Resource
    private UserService userService;
    @Resource
    private EmailService emailService;
    @Resource
    private HttpSession httpSession;

    @PostMapping(value = "/sendCheck")
    public String sendEmail(@RequestParam(value = "userId") Long userId, @RequestParam(value = "email") String emailAddress,
                            @RequestParam(value = "time") Long time, @RequestParam(value = "eCode") Integer eCode, @RequestParam(value = "type") Boolean type){
        emailService.sendCheckEmail(userId, time, emailAddress, type);
        return "/user/success";
    }

    @RequestMapping(value = "/send")
    public ShcpResult send(String content, String subject, String emailAddress, Boolean type){
        emailService.sendEmail(content, subject, emailAddress, true);
        return ShcpResult.ok();
    }

    @RequestMapping("/check")
    @ResponseBody
    public ShcpResult emailCheck(@RequestParam Long userId, @RequestParam Long time, @RequestParam Integer eCode){
        if(Objects.isNull(userId) || Objects.isNull(time)){
            return ShcpResult.build(713, "缺乏必要的信息，邮箱验证失败");
        }
        return emailService.check(userId, time);
    }

    @RequestMapping("/changeEmail")
    @ResponseBody
    public Object sendChangeEmail(String email, Boolean type){
        if(Objects.isNull(email)){
            return ShcpResult.build(713, "缺乏必要的信息，邮箱验证失败");
        }
        User user = (User) httpSession.getAttribute("user");
        return emailService.sendChangeEmail(user, email, type);
    }

    @RequestMapping("/sendForget")
    @ResponseBody
    public Object sendForget(@RequestParam Long time, @RequestParam String email, @RequestParam String password, @RequestParam Boolean type){
        emailService.sendForgetPassEmail(time, email, password, type);
        return CorsUtil.format(ShcpResult.ok());
    }

    @RequestMapping("/checkForget")
    @ResponseBody
    public Object checkForget(@RequestParam Long time){
        if(Objects.isNull(time)){
            log.info("checkForget time is null");
            return ShcpResult.build(714, "验证失败");
        }
        return emailService.checkForgetPass(time);
    }
}
