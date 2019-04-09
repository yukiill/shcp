package com.shcp.client.controller;

import com.shcp.client.service.DeviceService;
import com.shcp.client.service.EmailService;
import com.shcp.client.service.UserService;
import com.shcp.common.utils.CorsUtil;
import com.shcp.client.utils.FileUtil;
import com.shcp.client.utils.RegisterCachePool;
import com.shcp.client.utils.URLUtil;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.StringUtil;
import com.shcp.pojo.TbUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/3/25 21:12
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private EmailService emailService;
    @Resource
    private HttpSession session;

    @RequestMapping(value = "/changeInfo")
    @ResponseBody
    public Object changeInfo(@RequestParam(required = false, defaultValue = "") String email,
                             @RequestParam(required = false, defaultValue = "") String birthday,
                             @RequestParam(required = false, defaultValue = "") String introduction,
                             @RequestParam(required = false, defaultValue = "") String sex,
                                 @RequestParam(required = false) Object bw){
        TbUser tbUser = (TbUser) session.getAttribute("user");
        if(userService.changeInfo(tbUser, email, birthday, introduction, sex)){
            return CorsUtil.format(ShcpResult.ok());
        }
        return CorsUtil.format(ShcpResult.build(500, "服务器内部错误"));
    }

    @RequestMapping(value = "/changeimg")
    @ResponseBody
    public Object changeImg(@RequestParam(name = "file") MultipartFile multipartFile, Object bw){
        TbUser tbUser = (TbUser) session.getAttribute("user");
        String result = null;
        try {
            result = FileUtil.uploadHeadImage(tbUser.getUsername(), multipartFile);
        } catch (Exception e) {
            return CorsUtil.format(ShcpResult.build(500, "服务器内部错误"));
        }
        tbUser.setUhimg(result);
        if(userService.changeImg(tbUser)){
            return ShcpResult.ok();
        } else {
            return CorsUtil.format(ShcpResult.build(660, "修改失败"));
        }
    }

    @RequestMapping("/cancellation")
    @ResponseBody
    public Object cancellation(Long userId, Object bw){
        if(userService.cancellation(userId)){
            return CorsUtil.format(ShcpResult.ok());
        } else {
            return CorsUtil.format(ShcpResult.build(500, "注销失败"));
        }
    }

    @RequestMapping("/showing")
    @ResponseBody
    public Object getUserInfo(Object bw){
        TbUser tbUser = (TbUser) session.getAttribute("user");
        return CorsUtil.format(userService.getUserInfo(tbUser.getUid()));
    }

    @PostMapping(value = "/changePwd")
    @ResponseBody
    public Object changePwd(String nPwd, String rPwd, String email, Object bw){
        TbUser tbUser = (TbUser) session.getAttribute("user");
        if(StringUtils.isEmpty(nPwd)){
            return CorsUtil.format(ShcpResult.build(706, "密码不能为空"));
        }
        if(!Objects.equals(nPwd, rPwd)){
            return CorsUtil.format(ShcpResult.build(707, "密码和重复密码不一致"));
        }
        if(!StringUtil.isCorrect(email)){
            return CorsUtil.format(ShcpResult.build(708, "邮箱格式不正确"));
        }
        return CorsUtil.format(userService.changePwd(tbUser, nPwd));
    }

    @RequestMapping(value = "/forgetPwd")
    @ResponseBody
    public Object forgetPwd(@RequestParam String nPwd, @RequestParam String rPwd, @RequestParam String email,
                            @RequestParam(required = false) Object bw){
        if(!Objects.equals(nPwd, rPwd)){
            return CorsUtil.format(ShcpResult.build(653, "密码和重复密码不一致"));
        }
        if(!StringUtil.isCorrect(email)){
            if(!StringUtil.isCorrect(email)){
                return CorsUtil.format(ShcpResult.build(654, "邮箱格式错误"));
            }
        }
        if(!emailService.sendForgetPassEmail(System.nanoTime(), email, false)){
            return CorsUtil.format(ShcpResult.build(711, "邮件发送失败"));
        }
        return CorsUtil.format(ShcpResult.ok());
    }
}
