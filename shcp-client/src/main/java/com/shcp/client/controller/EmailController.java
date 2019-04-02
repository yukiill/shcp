package com.shcp.client.controller;

import com.shcp.client.service.EmailService;
import com.shcp.client.service.UserService;
import com.shcp.client.utils.RegisterCachePool;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.pojo.TbUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/3/25 22:47
 */
@Controller
@RequestMapping("/email")
public class EmailController {

    @Resource
    private UserService userService;

    @Resource
    private EmailService emailService;

    @PostMapping(value = "/sendCheck")
    public String sendEmail(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "email") String emailAddress,
                            @RequestParam(value = "time") Long time, @RequestParam(value = "eCode") Integer eCode, @RequestParam(value = "type") Boolean type){
        emailService.sendEmail(userId, time, "请点击下面的链接进行验证","验证邮件", emailAddress, true);
        return "/user/success";
    }

    @RequestMapping(value = "/send")
    public ShcpResult send(String content, String subject, String emailAddress, Boolean type){
//        emailService.sendEmail(content, subject, emailAddress, true);
        return ShcpResult.ok();
    }

    @RequestMapping("/check")
    @ResponseBody
    public String emailCheck(@RequestParam Integer userId, @RequestParam Long time, @RequestParam Integer eCode){
        if(emailService.check(userId, time)){
            System.err.println("check successfully");
        }
        return "";
    }
}
