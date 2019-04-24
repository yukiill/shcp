package com.shcp.manager.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.manager.service.DeveloperService;
import com.shcp.manager.service.DeviceService;
import com.shcp.pojo.Developer;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author CYZ
 * @date 2019/4/16 20:40
 */
@Slf4j
@Controller
public class DeveloperController {

    @Resource
    private DeviceService deviceService;
    @Resource
    private DeveloperService developerService;


    @RequestMapping("/admin/showDeveloper")
    @ResponseBody
    public Object showDeveloper(@RequestParam String DVid, @RequestParam(required = false) String Bw){

        if(StringUtils.isEmpty(DVid)){
            return CorsUtil.format(ShcpResult.build(723, "输入的设备编号无效"));
        }
        Long _did = deviceService.searchDevice(DVid).getDid();
        Developer tbDeveloper = developerService.searchDeveloper( _did.toString());
        return ShcpResult.ok(tbDeveloper);

    }


}

