package com.shcp.manager.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.manager.service.DeveloperService;
import com.shcp.manager.service.DeviceService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author CYZ
 * @date 2019/4/27 13:40
 */
@Slf4j
@Controller
@RequestMapping("/admin/developer")
public class DeveloperController {

    @Resource
    private DeviceService deviceService;
    @Resource
    private DeveloperService developerService;


    @RequestMapping("/findDeveloper")
    @ResponseBody
    public Object findDeveloper(String wd, @RequestParam(required = false, defaultValue = "q") String type){
        if(org.springframework.util.StringUtils.isEmpty(wd)){
            return CorsUtil.format(ShcpResult.build(704, "关键字不能为空"));
        }
        return CorsUtil.format(developerService.findDeveloper(wd, type));
    }

    @RequestMapping("/showDeveloper")
    @ResponseBody
    public Object showDeveloper(@RequestParam String DID, @RequestParam(required = false) String Bw){

        if(StringUtils.isEmpty(DID)){
            return CorsUtil.format(ShcpResult.build(723, "输入的开发者编号无效"));
        }
        return CorsUtil.format(developerService.showDeveloper(DID));
    }


    @RequestMapping("/findDeveloperExamp")
    @ResponseBody
    public Object findDeveloperExamp(String wd, @RequestParam(required = false, defaultValue = "q") String type){
        if(org.springframework.util.StringUtils.isEmpty(wd)){
            return CorsUtil.format(ShcpResult.build(704, "关键字不能为空"));
        }
        return CorsUtil.format(developerService.findDeveloperExamp(wd, type));
    }

    @RequestMapping("/showDeveloperExamp")
    @ResponseBody
    public Object showDeveloperExamp(@RequestParam String DID, @RequestParam(required = false) String Bw){

        if(StringUtils.isEmpty(DID)){
            return CorsUtil.format(ShcpResult.build(723, "输入的开发者编号无效"));
        }
        return CorsUtil.format(developerService.showDeveloperExamp(DID));
    }

    @RequestMapping("/submitDeveloperExamp")
    @ResponseBody
    public Object submitDeveloperExamp(@RequestParam Long DID,
                                       @RequestParam(required = false, defaultValue = "")Byte is_open,
                                       @RequestParam(required = false, defaultValue = "")String info,
                                       @RequestParam(required = false) String Bw){

        return CorsUtil.format(developerService.submitDeveloperExamp(DID,is_open,info));
    }

    @RequestMapping("/modifyDeveloperLimit")
    @ResponseBody
    public Object modifyDeveloperLimit(@RequestParam Long DID,
                                       @RequestParam Short DLID,
                                       @RequestParam Boolean dlstatus,
                                       @RequestParam(required = false) String Bw){

        return CorsUtil.format(developerService.modifyDeveloperLimit(DID,DLID,dlstatus));
    }



}

