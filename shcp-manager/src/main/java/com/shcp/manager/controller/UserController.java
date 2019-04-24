package com.shcp.manager.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.manager.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/4/23 21:43
 */
@Slf4j
@Controller
@RequestMapping("/admin/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/search")
    @ResponseBody
    public Object searchUser(String wd, @RequestParam(required = false, defaultValue = "p") String type){
        if(StringUtils.isEmpty(wd)){
            return CorsUtil.format(ShcpResult.build(704, "关键字不能为空"));
        }
        return CorsUtil.format(userService.getUsers(wd, type));
    }

    @RequestMapping("{UID}")
    @ResponseBody
    public Object getUserByUID(@PathVariable Long UID){
        return CorsUtil.format(userService.getUserByUid(UID));
    }

    @RequestMapping("/all")
    @ResponseBody
    public Object getAllUsers(@RequestParam(required = false, defaultValue = "1") int page,
                              @RequestParam(required = false, defaultValue = "20") int rows){
        return CorsUtil.format(userService.getAllUsers(page, rows));
    }

    @RequestMapping("/modify")
    @ResponseBody
    public Object modifyUserInfo(Long UID){
        return CorsUtil.format(userService.modifyUserInfo(UID));
    }

    @RequestMapping("/addLimit")
    @ResponseBody
    public Object addUserLimitForUser(Long UID, String ULname){
        if(StringUtils.isEmpty(ULname)){
            return CorsUtil.format(ShcpResult.build(705, "权限名称不能为空"));
        }
        return CorsUtil.format(userService.addUserLimitForUser(UID, ULname));
    }

    @RequestMapping("/limit/{ULID}")
    @ResponseBody
    public Object getUserLimitByULID(@PathVariable Short ULID){
        return CorsUtil.format(userService.getUserLimitById(ULID));
    }

    @RequestMapping("/limit/add")
    @ResponseBody
    public Object addUserLimit(String ULname){
        if(StringUtils.isEmpty(ULname)){
            return CorsUtil.format(ShcpResult.build(705, "权限名称不能为空"));
        }
        return CorsUtil.format(userService.addUserLimit(ULname));
    }

    @RequestMapping("/limit/delete/{ULID}")
    @ResponseBody
    public Object deleteUserLimit(@PathVariable Short ULID){
        return CorsUtil.format(userService.deleteUserLimit(ULID));
    }

    @RequestMapping("/limit/modify")
    @ResponseBody
    public Object modifyUserList(Short ULID, String ULname){
        if(StringUtils.isEmpty(ULname)){
            return CorsUtil.format(ShcpResult.build(705, "权限名称不能为空"));
        }
        return CorsUtil.format(userService.modifyUserLimit(ULID, ULname));
    }

    @RequestMapping("/limit/all")
    @ResponseBody
    public Object getAllUserLimits(@RequestParam(required = false, defaultValue = "1") int page,
                              @RequestParam(required = false, defaultValue = "20") int rows){
        return CorsUtil.format(userService.getAllUserLimit(page, rows));
    }

    @RequestMapping("/{UID}/limit/all")
    @ResponseBody
    public Object getAllUserLimitsForUser(@PathVariable Long UID){
        return CorsUtil.format(userService.getUserLimitsByUID(UID));
    }
}
