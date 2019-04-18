package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.developer.service.DeviceService;
import com.shcp.pojo.Device;
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
        Device tbDevice = deviceService.searchDevice(Dsid);
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

    @RequestMapping("/duser/addDevicesType")
    @ResponseBody
    public Object addDeviceType(@RequestParam String DSTypeName, @RequestParam(required = false) Object bw){
        if(StringUtils.isEmpty(DSTypeName)){
            return CorsUtil.format(ShcpResult.build(726, "设备类型的名称不能为空"));
        }
        return CorsUtil.format(deviceService.addDeviceType(DSTypeName));
    }

    @RequestMapping("/duser/addDeviceStatus")
    @ResponseBody
    public Object addDeviceStatus(@RequestParam Long tid, @RequestParam String desname, @RequestParam String destype,
                                  @RequestParam String defaultValue, @RequestParam String minValue, @RequestParam String maxValue){
        if(Objects.isNull(tid)){
            return CorsUtil.format(ShcpResult.build(727, "请选择正确的设备类型"));
        }
        if(StringUtils.isEmpty(desname)){
            return CorsUtil.format(ShcpResult.build(728, "状态名称不能为空"));
        }
        if(StringUtils.isEmpty(destype)){
            return CorsUtil.format(ShcpResult.build(728, "状态类型不能为空"));
        }
        if(StringUtils.isEmpty(defaultValue)){
            return CorsUtil.format(ShcpResult.build(728, "状态值预设值不能为空"));
        }
        if(StringUtils.isEmpty(minValue)){
            return CorsUtil.format(ShcpResult.build(728, "状态最小值不能为空"));
        }
        if(StringUtils.isEmpty(maxValue)){
            return CorsUtil.format(ShcpResult.build(728, "状态最大值不能为空"));
        }
        return CorsUtil.format(deviceService.addDeviceStatus(tid, desname, destype, defaultValue, minValue, maxValue));
    }

    @RequestMapping("/duser/addDevCtrl")
    @ResponseBody
    public Object addDeviceCtrl(@RequestParam Long DSTypeID, @RequestParam String DsCtrlName, @RequestParam String DsCtrlkey,
                                @RequestParam String DsCtrlValue, @RequestParam String DsCtrlValTy, @RequestParam(required = false) Object bw){
        if(Objects.isNull(DSTypeID)){
            return CorsUtil.format(ShcpResult.build(727, "请选择正确的设备类型"));
        }
        if(StringUtils.isEmpty(DsCtrlName)){
            return CorsUtil.format(ShcpResult.build(728, "控制字段名称不能为空"));
        }
        if(StringUtils.isEmpty(DsCtrlkey)){
            return CorsUtil.format(ShcpResult.build(728, "控制字段键不能为空"));
        }
        if(StringUtils.isEmpty(DsCtrlValue)){
            return CorsUtil.format(ShcpResult.build(728, "控制字段值不能为空"));
        }
        if(StringUtils.isEmpty(DsCtrlValTy)){
            return CorsUtil.format(ShcpResult.build(728, "控制字段类型不能为空"));
        }
        return CorsUtil.format(deviceService.addDevCtrl(DSTypeID, DsCtrlName, DsCtrlkey, DsCtrlValue, DsCtrlValTy));
    }
}
