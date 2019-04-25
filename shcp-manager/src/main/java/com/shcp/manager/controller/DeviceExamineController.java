package com.shcp.manager.controller;

import com.shcp.common.utils.CorsUtil;
import com.shcp.manager.constant.WebConstant;
import com.shcp.manager.service.DeviceExamineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/4/25 21:49
 */
@Slf4j
@Controller
@RequestMapping("/admin/device/examine")
public class DeviceExamineController {

    @Resource
    private DeviceExamineService deviceExamineService;

    @RequestMapping("/all")
    @ResponseBody
    public Object getAllDeviceExamines(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                                       @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(deviceExamineService.getAllDeviceExamines(page, rows));
    }

    @RequestMapping("/verify")
    public Object verifyDeviceExamine(Long DEID, @RequestParam(defaultValue = "0") byte status, String reason){
        return CorsUtil.format(deviceExamineService.modifyDeviceExamineStatus(DEID, status, reason));
    }

    @RequestMapping("/{DEID}")
    @ResponseBody
    public Object getDeviceExamineById(@RequestParam(defaultValue = "0") Long DEID){
        return CorsUtil.format(deviceExamineService.getDeivceExamineById(DEID));
    }
}
