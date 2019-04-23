package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.developer.service.TestDeviceService;
import com.shcp.pojo.Developer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/21 13:12
 */
@Slf4j
@Controller
@RequestMapping("/duser/td/")
public class TestServiceController {

    @Resource
    private TestDeviceService testDeviceService;
    @Resource
    private HttpSession httpSession;

    @RequestMapping("/addTestDevice")
    @ResponseBody
    public Object addTestDevice(String tdeName, @RequestParam(defaultValue = "", required = false) String ipaddr,
                                @RequestParam(defaultValue = "0", required = false) int port, String tdemac){
        if(StringUtils.isEmpty(tdeName) || StringUtils.isEmpty(tdemac)){
            return CorsUtil.format(ShcpResult.build(736, "必填项不能为空"));
        }
        Developer developer = (Developer) httpSession.getAttribute("duser");
        return CorsUtil.format(testDeviceService.addTestDevice(developer, tdeName, ipaddr, port, tdemac));
    }

    @RequestMapping("/addTestDeviceType")
    @ResponseBody
    public Object addTestDeviceType(String tdesName){
        if(StringUtils.isEmpty(tdesName)){
            return CorsUtil.format(ShcpResult.build(736, "必填项不能为空"));
        }
        Developer developer = (Developer) httpSession.getAttribute("duser");
        return CorsUtil.format(testDeviceService.addTestDeviceType(developer, tdesName));
    }

    @RequestMapping("/addTestDeviceStatus")
    @ResponseBody
    public Object addTestDeviceStatus(Long tdsID, String tdesName, String tdesType,
                                      String tdesDefaultValue, String tdesMinValue, String tdesMaxValue){
        if(Objects.isNull(tdsID)){
            return CorsUtil.format(ShcpResult.build(727, "请选择正确的设备类型"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdesName)){
            return CorsUtil.format(ShcpResult.build(728, "状态名称不能为空"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdesType)){
            return CorsUtil.format(ShcpResult.build(728, "状态类型不能为空"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdesDefaultValue)){
            return CorsUtil.format(ShcpResult.build(728, "状态值预设值不能为空"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdesMinValue)){
            return CorsUtil.format(ShcpResult.build(728, "状态最小值不能为空"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdesMaxValue)){
            return CorsUtil.format(ShcpResult.build(728, "状态最大值不能为空"));
        }
        return CorsUtil.format(testDeviceService.addTestDeviceStatus(tdsID, tdesName, tdesType,
                tdesDefaultValue, tdesMinValue, tdesMaxValue));
    }

    @RequestMapping("/addTestDeviceControl")
    @ResponseBody
    public Object addTestDeviceControl(Long tdsID, String tdecName, String tdecKey, String tdecValue, String tdecType){
        if(Objects.isNull(tdsID)){
            return CorsUtil.format(ShcpResult.build(666, "请选择正确的设备类型"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdecName)){
            return CorsUtil.format(ShcpResult.build(728, "控制字段名称不能为空"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdecKey)){
            return CorsUtil.format(ShcpResult.build(728, "控制字段键不能为空"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdecValue)){
            return CorsUtil.format(ShcpResult.build(728, "控制字段值不能为空"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdecType)){
            return CorsUtil.format(ShcpResult.build(728, "控制字段类型不能为空"));
        }
        return CorsUtil.format(testDeviceService.addTestDeviceControl(tdsID, tdecName, tdecKey, tdecValue));
    }

    @RequestMapping("/addTestDeviceLimit")
    @ResponseBody
    public Object addTestDeviceLimit(Long tdsID, String tdelName, String tdelKey, String tdelValue){
        if(Objects.isNull(tdsID)){
            return CorsUtil.format(ShcpResult.build(666, "请选择正确的设备类型"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdelName)){
            return CorsUtil.format(ShcpResult.build(728, "权限名称不能为空"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdelKey)){
            return CorsUtil.format(ShcpResult.build(728, "权限键不能为空"));
        }
        if(org.apache.commons.lang3.StringUtils.isEmpty(tdelValue)){
            return CorsUtil.format(ShcpResult.build(728, "权限值不能为空"));
        }
        return CorsUtil.format(testDeviceService.addTestDeviceLimit(tdsID, tdelName, tdelKey, tdelValue));
    }

    @RequestMapping("/status")
    @ResponseBody
    public Object getAllStatus(Long TDSID, @RequestParam(defaultValue = "1", required = false) int page,
                               @RequestParam(defaultValue = "20", required = false) int rows){
        if(Objects.isNull(TDSID)){
            return CorsUtil.format(ShcpResult.build(727, "请选择正确的设备类型"));
        }
        return CorsUtil.format(testDeviceService.searchTestDeviceStatus(TDSID, page, rows));
    }

    @RequestMapping("/status/{TDESID}")
    @ResponseBody
    public Object searchStatusById(@PathVariable Long TDESID){
        return CorsUtil.format(testDeviceService.searchTestDeviceStatus(TDESID));
    }

    @RequestMapping("/control")
    @ResponseBody
    public Object getAllControls(Long TDSID, @RequestParam(defaultValue = "1", required = false) int page,
                               @RequestParam(defaultValue = "20", required = false) int rows){
        if(Objects.isNull(TDSID)){
            return CorsUtil.format(ShcpResult.build(727, "请选择正确的设备类型"));
        }
        return CorsUtil.format(testDeviceService.searchTestDeviceControl(TDSID, page, rows));
    }

    @RequestMapping("/control/{TDECID}")
    @ResponseBody
    public Object searchControlById(@PathVariable Long TDECID){
        return CorsUtil.format(testDeviceService.searchTestDeviceControl(TDECID));
    }

    @RequestMapping("/limit")
    @ResponseBody
    public Object getAllLimits(Long TDSID, @RequestParam(defaultValue = "1", required = false) int page,
                               @RequestParam(defaultValue = "20", required = false) int rows){
        if(Objects.isNull(TDSID)){
            return CorsUtil.format(ShcpResult.build(727, "请选择正确的设备类型"));
        }
        return CorsUtil.format(testDeviceService.searchTestDeviceLimit(TDSID, page, rows));
    }

    @RequestMapping("/limit/{TDELID}")
    @ResponseBody
    public Object searchLimitById(@PathVariable Long TDELID){
        return CorsUtil.format(testDeviceService.searchTestDeviceLimit(TDELID));
    }

    @RequestMapping("/device")
    @ResponseBody
    public Object getAllDevices(@RequestParam(defaultValue = "1", required = false) int page,
                                @RequestParam(defaultValue = "20", required = false) int rows){
        Developer developer = (Developer) httpSession.getAttribute("duser");
        return CorsUtil.format(testDeviceService.searchTestDevice(developer, page, rows));
    }

    @RequestMapping("/device/{tdeID}")
    @ResponseBody
    public Object search(@PathVariable Long tdeID){
        return CorsUtil.format(testDeviceService.searchTestDevice(tdeID));
    }

}
