package com.shcp.manager.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.manager.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/6 16:59
 */
@Slf4j
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam String userName, @RequestParam String password,
                        @RequestParam(required = false) String pageID, @RequestParam(required = false) String TerID,
                        Object bw, Model model, HttpServletRequest request){
        if(StringUtils.isEmpty(userName) || StringUtils.isEmpty(password)){
            return CorsUtil.format(ShcpResult.build(651, "用户名或密码不能为空"));
        }
        Admin admin = adminService.login(userName, password, TerID);
        if(Objects.isNull(admin)){
            CorsUtil.format(ShcpResult.build(651, "用户名或密码错误"));
        }
        request.getSession().setAttribute("admin", admin);
        return CorsUtil.format(ShcpResult.ok());
    }
}
