package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.developer.service.UserService;
import com.shcp.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/4/15 17:02
 */
@Slf4j
@Controller
@RequestMapping("/duser")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/searchuser")
    @ResponseBody
    public Object searchUser(@RequestParam String searchWd, @RequestParam String type, @RequestParam(required = false) Object bw){
        if(StringUtils.isEmpty(searchWd)){
            return CorsUtil.format(ShcpResult.build(720, "关键字不能为空"));
        }
        if(StringUtils.isEmpty(type)){
            return CorsUtil.format(ShcpResult.build(721, "请指定搜索类型"));
        }
        User tbUser = userService.searchUser(searchWd, type);
        return ShcpResult.ok(tbUser);
    }

}
