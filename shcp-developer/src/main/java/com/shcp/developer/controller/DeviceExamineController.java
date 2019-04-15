package com.shcp.developer.controller;

import com.shcp.developer.service.DeviceExamineService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Yuki
 * @date 2019/4/15 20:45
 */
@Slf4j
@Controller
public class DeviceExamineController {

    @Resource
    private DeviceExamineService deviceExamineService;

    @RequestMapping("/duser/showDevExamine")
    @ResponseBody
    public Object showDevExamine(@RequestParam(required = false) String DSEXID, @RequestParam(required = false) Object bw){
        return deviceExamineService.showDeviceExamineStatus(DSEXID);
    }


}
