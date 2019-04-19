package com.shcp.client.controller;

import com.shcp.client.service.DeviceService;
import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author Yuki
 * @date 2019/4/9 10:13
 */

@Slf4j
@Controller
public class DeviceController {

    @Resource
    private DeviceService deviceService;
    @Resource
    private HttpSession httpSession;

    @RequestMapping("/user/bindDid")
    @ResponseBody
    public Object bindDevice(@RequestParam(value = "Deid") Long dstID, Object bw){
        User user = (User) httpSession.getAttribute("user");
        return CorsUtil.format(deviceService.bindDevice(dstID, user));
    }

    @RequestMapping("/user/device/show")
    @ResponseBody
    public Object getDeviceList(){
        User user = (User) httpSession.getAttribute("user");
        return CorsUtil.format(deviceService.getDeviceListByUserId(user.getUid()));
    }

    @RequestMapping("/user/device/status")
    @ResponseBody
    public Object getDeviceStatus(@RequestParam Long deviceID, Object bw){
        return CorsUtil.format(ShcpResult.ok());
    }

    @RequestMapping("/user/device/controlStream")
    @ResponseBody
    public Object sendControlStream(@RequestParam Long deviceID, @RequestParam String cKey, @RequestParam String cValue,
                                    @RequestParam(required = false) Object bwKey, @RequestParam(required = false) Object bwValue){
        return CorsUtil.format(ShcpResult.ok());
    }
}
