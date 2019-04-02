package com.shcp.client.controller;

import com.mysql.cj.api.Session;
import com.shcp.client.service.DeviceService;
import com.shcp.client.service.UserService;
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
import java.util.Date;
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
    private DeviceService deviceService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ShcpResult login(@RequestParam String userName, @RequestParam String password,
                            @RequestParam(required = false) String TerID, @RequestParam(required = false) String pageID,
                            @RequestParam(required = false) Object bw, HttpServletRequest request){
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            return ShcpResult.build(650, "用户名或密码为空");
        }
        TbUser tbUser = userService.login(userName, password, TerID);
        if(Objects.isNull(tbUser)){
            return ShcpResult.build(651, "用户名或密码错误");
        }
        request.getSession().setAttribute("user", tbUser);
        return ShcpResult.ok(tbUser);
    }

    @RequestMapping("/logout")
    @ResponseBody
    public ShcpResult logout(HttpServletRequest request){
        request.getSession().removeAttribute("user");
        return ShcpResult.ok();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestParam String username, @RequestParam String password,
                           @RequestParam String repassword, @RequestParam String email, @RequestParam(required = false) String pageID,
                           @RequestParam(required = false) String TerID, @RequestParam(required = false) Object bw,
                           Model model){
        if(StringUtils.isEmpty(username)){
            return "register";
        } else {
            if(userService.usernameIsPresent(username)){
                model.addAttribute("msg", ShcpResult.build(652, "用户名已注册"));
                return "register";
            }
        }
        if(!Objects.equals(password, repassword)){
            model.addAttribute("msg", ShcpResult.build(653, "密码和重复密码不一致"));
            return "register";
        }
        if(!StringUtil.isCorrect(email)){
            model.addAttribute("msg", ShcpResult.build(654, "邮箱格式错误"));
            return "register";
        }
        TbUser tbUser = userService.register(username, password, email, TerID);
        long time = System.nanoTime();
        RegisterCachePool registerCachePool = RegisterCachePool.getInstance();
        registerCachePool.add(tbUser, time);
        return "forward:" + URLUtil.getEmailCheckUrl(tbUser, time);
    }

    @RequestMapping(value = "/changeInfo", method = RequestMethod.POST)
    @ResponseBody
    public ShcpResult changeInfo(@RequestParam(required = false) String email, @RequestParam(required = false) String birthday,
                                 @RequestParam(required = false) String introduction, @RequestParam(required = false) String sex,
                                 @RequestParam(required = false) Object bw, HttpServletRequest request){
        TbUser tbUser = (TbUser) request.getSession().getAttribute("user");
        if(userService.changeInfo(tbUser.getUid(), email, birthday, introduction, sex)){
            return ShcpResult.ok();
        }
        return ShcpResult.build(500, "服务器内部错误");
    }

    @RequestMapping(value = "/changeimg")
    @ResponseBody
    public ShcpResult changeImg(@RequestParam(name = "file") MultipartFile multipartFile, Object bw, HttpServletRequest request){
        TbUser tbUser = (TbUser) request.getSession().getAttribute("user");
        String result = null;
        try {
            result = FileUtil.uploadHeadImage(tbUser.getUsername(), multipartFile);
        } catch (Exception e) {
            return ShcpResult.build(500, "服务器内部错误");
        }
        tbUser.setUhimg(result);
        if(userService.changeImg(tbUser)){
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(660, "修改失败");
        }
    }

    @RequestMapping("/user/cancellation")
    @ResponseBody
    public ShcpResult cancellation(Long userId, Object bw){
        if(userService.cancellation(userId)){
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500, "注销失败");
        }
    }

    @RequestMapping("/user/bindDid")
    @ResponseBody
    public ShcpResult bandDevice(@RequestParam(value = "Deid") Integer Deid, Object bw){
        return ShcpResult.ok();
    }

    @RequestMapping("/user/device/show")
    @ResponseBody
    public ShcpResult getDeviceList(HttpServletRequest request){
        TbUser tbUser = (TbUser) request.getSession().getAttribute("user");
        return deviceService.getDeviceListByUserId(tbUser.getUid());
    }

    @RequestMapping(value = "/user/feedback", method = RequestMethod.POST)
    @ResponseBody
    public ShcpResult submitFeedback(String content, String title, Short type, Object bw, HttpServletRequest request){
        TbUser tbUser = (TbUser) request.getSession().getAttribute("user");
        if(StringUtils.isEmpty(content)){
            return ShcpResult.build(702, "反馈内容不能为空");
        }
        if(StringUtils.isEmpty(title)){
            return ShcpResult.build(703, "反馈标题不能为空");
        }
        if(Objects.isNull(type)){
            return ShcpResult.build(704, "反馈类型不能为空");
        }
        return userService.submitFeedback(tbUser, content, title, type);
    }

    @RequestMapping("/showing")
    @ResponseBody
    public ShcpResult getUserInfo(Object bw, HttpServletRequest request){
        TbUser tbUser = (TbUser) request.getSession().getAttribute("user");
        return userService.getUserInfo(tbUser.getUid());
    }

    @PostMapping(value = "/forgetPwd")
    @ResponseBody
    public ShcpResult forgetPwd(String nPwd, String rPwd, String email, Object bw, HttpServletRequest request){
        TbUser tbUser = (TbUser) request.getSession().getAttribute("user");
        if(StringUtils.isEmpty(nPwd)){
            return ShcpResult.build(706, "密码不能为空");
        }
        if(Objects.equals(nPwd, rPwd)){
            return ShcpResult.build(707, "密码和重复密码不一致");
        }
        if(!StringUtil.isCorrect(email)){
            return ShcpResult.build(708, "邮箱格式不正确");
        }
        return ShcpResult.ok();
    }
}
