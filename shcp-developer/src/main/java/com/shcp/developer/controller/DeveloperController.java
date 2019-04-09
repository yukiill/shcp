package com.shcp.developer.controller;

import com.shcp.client.service.DeveloperService;
import com.shcp.client.utils.RegisterCachePool;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.common.utils.StringUtil;
import com.shcp.pojo.TbDeveloper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public Object login(@RequestParam String userName, @RequestParam String password,
                        @RequestParam(required = false) String TerID, @RequestParam(required = false) String pageID,
                        @RequestParam(required = false) Object bw, HttpServletRequest request){
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            return CorsUtil.format(ShcpResult.build(650, "用户名或密码为空"));
        }
        TbDeveloper tbDeveloper = developerService.devLogin(userName, password, TerID);
        if(Objects.isNull(tbDeveloper)){
            CorsUtil.format(ShcpResult.build(651, "用户名或密码错误"));
        }
        request.getSession().setAttribute("duser", tbDeveloper);
        return CorsUtil.format(ShcpResult.ok());
    }

    @RequestMapping("/logout")
    @ResponseBody
    public ShcpResult logout(HttpServletRequest request){
        request.getSession().removeAttribute("duser");
        return ShcpResult.ok();
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
//        TbDeveloper tbDeveloper = developerService.register(userName, password, email, TerID);
        long time = System.nanoTime();

//        registerCachePool.add(tbDeveloper, time);
//        return "forward:" + URLUtil.getEmailCheckUrl(tbDeveloper, time);
        return "";
    }

    @RequestMapping("/cancellation")
    @ResponseBody
    public ShcpResult cancellation(@RequestParam Long devID, Object bw){
        if(developerService.devCancellation(devID)){
            return ShcpResult.ok();
        } else {
            return ShcpResult.build(500, "注销失败");
        }
    }

    @RequestMapping(value = "/feedback", method = RequestMethod.POST)
    @ResponseBody
    public Object submitFeedback(String content, String title, Short type, Object bw, HttpServletRequest request){
        TbDeveloper tbDeveloper = (TbDeveloper) request.getSession().getAttribute("duser");
        if(StringUtils.isEmpty(content)){
            return CorsUtil.format(ShcpResult.build(702, "反馈内容不能为空"));
        }
        if(StringUtils.isEmpty(title)){
            return CorsUtil.format(ShcpResult.build(703, "反馈标题不能为空"));
        }
        if(Objects.isNull(type)){
            return CorsUtil.format(ShcpResult.build(704, "反馈类型不能为空"));
        }
        return CorsUtil.format(developerService.submitDevFeedback(tbDeveloper, content, title));
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
