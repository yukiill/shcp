package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.developer.service.DeviceService;
import com.shcp.pojo.TbDevice;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/15 17:13
 */
@Slf4j
@Controller
public class DeviceController {

    @Resource
    private DeviceService deviceService;

    @RequestMapping("/duser/searchdevice")
    @ResponseBody
    public Object searchDevice(@RequestParam String Dsid, @RequestParam(required = false) Object bw){
        if(StringUtils.isEmpty(Dsid)){
            return CorsUtil.format(ShcpResult.build(723, "输入的设备编号无效"));
        }
        TbDevice tbDevice = deviceService.searchDevice(Dsid);
        return ShcpResult.ok(tbDevice);
    }

    @RequestMapping("/duser/delDervice")
    @ResponseBody
    public Object deleteDevice(@RequestParam String Dsid, @RequestParam(required = false) Object bw){
        if(StringUtils.isEmpty(Dsid)){
            return CorsUtil.format(ShcpResult.build(723, "输入的设备编号无效"));
        }
        return CorsUtil.format(deviceService.deleteDevice(Dsid));
    }
}
