package com.shcp.manager.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.manager.constant.WebConstant;
import com.shcp.manager.service.DeviceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/24 21:50
 */
@Slf4j
@Controller
@RequestMapping("/admin/device")
public class DeviceController {

    @Resource
    private DeviceService deviceService;

    @RequestMapping("/search")
    @ResponseBody
    public Object searchService(String wd, @RequestParam(required = false, defaultValue = "q") String type){
        if(StringUtils.isEmpty(wd)){
            return CorsUtil.format(ShcpResult.build(704, "关键字不能为空"));
        }
        return CorsUtil.format(deviceService.searchDevice(wd, type));
    }

    @RequestMapping("/{DEID}")
    @ResponseBody
    public Object getDeviceById(@PathVariable Long DEID){
        return CorsUtil.format(deviceService.getDeviceById(DEID));
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Object deleteDevice(Long DEID){
        return CorsUtil.format(deviceService.deleteDeviceById(DEID));
    }

    @RequestMapping("/all")
    @ResponseBody
    public Object getAllDevices(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                                @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(deviceService.getAllDevices(page, rows));
    }

    @RequestMapping("/type/all")
    @ResponseBody
    public Object getAllDeviceTypes(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                                    @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(deviceService.getAllDeviceTypes(page, rows));
    }

    @RequestMapping("/type/{DETID}")
    @ResponseBody
    public Object getDeviceType(@PathVariable Long DETID){
        return CorsUtil.format(deviceService.getDeviceTypeById(DETID));
    }

    @RequestMapping("/type/modify")
    @ResponseBody
    public Object modifyDeviceType(Long DETID, String desName){
        if(StringUtils.isEmpty(desName)){
            return CorsUtil.format(ShcpResult.build(705, "设备类型名称不能为空"));
        }
        return CorsUtil.format(deviceService.modifyDeviceTypeName(DETID, desName));
    }

    @RequestMapping("/type/modify/status")
    @ResponseBody
    public Object modifyDeviceStatus(Long DETID, byte is_open){
        return CorsUtil.format(deviceService.modifyDeviceTypeStatus(DETID, is_open));
    }

    @RequestMapping("/status/all")
    @ResponseBody
    public Object getAllStatus(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                               @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(deviceService.getAllDeviceStatus(page, rows));
    }

    @RequestMapping("/status/{DESID}")
    @ResponseBody
    public Object getDeviceStatus(@PathVariable Long DESID){
        return CorsUtil.format(deviceService.getDeviceStatusById(DESID));
    }

    @RequestMapping("/status/modify")
    @ResponseBody
    public Object modifyDeviceStatus(Long DESID, @RequestParam(required = false, defaultValue = "") String desName,
                                     @RequestParam(required = false, defaultValue = "")String desType,
                                     @RequestParam(required = false, defaultValue = "")String desDefaultValue,
                                     @RequestParam(required = false, defaultValue = "")String desMinValue,
                                     @RequestParam(required = false, defaultValue = "")String desMaxValue){
        if(Objects.equals("", desName) && Objects.equals("", desType) && Objects.equals("", desDefaultValue) &&
                Objects.equals("", desMinValue) && Objects.equals("", desMaxValue)){
            return CorsUtil.format(ShcpResult.build(721, "请输入有效的修改"));
        }
        return CorsUtil.format(deviceService.modifyDeviceStatus(DESID, desName, desType, desDefaultValue, desMinValue, desMaxValue));
    }

    @RequestMapping("/status/delete")
    @ResponseBody
    public Object deleteDeviceStatus(Long DESID){
        return CorsUtil.format(deviceService.deleteDeviceStatus(DESID));
    }

    @RequestMapping("/limit/all")
    @ResponseBody
    public Object getAllDeviceLimit(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                                    @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(deviceService.getAllDeviceLimits(page, rows));
    }

    @RequestMapping("/limit/{DELID}")
    @ResponseBody
    public Object getDeviceLimit(@PathVariable Long DELID){
        return CorsUtil.format(deviceService.getDeviceLimitById(DELID));
    }

    @RequestMapping("/limit/modify")
    @ResponseBody
    public Object modifyDeviceLimit(Long DELID, @RequestParam(required = false, defaultValue = "") String delName,
                                    @RequestParam(required = false, defaultValue = "") String delKey,
                                    @RequestParam(required = false, defaultValue = "") String delValue){
        if(Objects.equals("", delName) && Objects.equals("", delKey) && Objects.equals("", delValue)){
            return CorsUtil.format(ShcpResult.build(721, "请输入有效的修改"));
        }
        return CorsUtil.format(deviceService.modifyDeviceLimit(DELID, delName, delKey, delValue));
    }

    @RequestMapping("/addLimit")
    @ResponseBody
    public Object addDeviceLimitForDevice(Long DEID, Long DELID){
        return CorsUtil.format(deviceService.addDeviceLimitToDevice(DEID, DELID));
    }

    @RequestMapping("/delLimit")
    @ResponseBody
    public Object deleteDeviceLimitForDevice(Long DEID, Long DELID){
        return CorsUtil.format(deviceService.deleteDeviceLimitToDevice(DEID, DELID));
    }

    @RequestMapping("/limit/delete")
    @ResponseBody
    public Object deleteDeviceLimit(Long DELID){
        return CorsUtil.format(deviceService.deleteDeviceLimit(DELID));
    }

    @RequestMapping("/control/all")
    @ResponseBody
    public Object getAllDeviceControl(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                                    @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(deviceService.getAllDeviceControls(page, rows));
    }

    @RequestMapping("/control/{DECID}")
    @ResponseBody
    public Object getDeviceControl(Long DECID){
        return CorsUtil.format(deviceService.getDeviceControlsById(DECID));
    }

    @RequestMapping("/control/modify")
    @ResponseBody
    public Object modifyDeviceControl(Long DECID, @RequestParam(required = false, defaultValue = "") String decName,
                                      @RequestParam(required = false, defaultValue = "") String decKey,
                                      @RequestParam(required = false, defaultValue = "") String decValue){
        if(Objects.equals("", decName) && Objects.equals("", decKey) && Objects.equals("", decValue)){
            return CorsUtil.format(ShcpResult.build(721, "请输入有效的修改"));
        }
        return CorsUtil.format(deviceService.modifyDeviceControl(DECID, decName, decKey, decValue));
    }

    @RequestMapping("/control/delete")
    @ResponseBody
    public Object deleteDeviceControl(Long DECID){
        return CorsUtil.format(deviceService.deleteDeviceControl(DECID));
    }
}
