package com.shcp.manager.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.CorsUtil;
import com.shcp.manager.constant.WebConstant;
import com.shcp.manager.service.TestDeviceService;
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
 * @date 2019/4/25 21:19
 */
@Slf4j
@Controller
@RequestMapping("/admin/device/t")
public class TestDeviceController {

    @Resource
    private TestDeviceService testDeviceService;

    @RequestMapping("/search")
    @ResponseBody
    public Object searchTestService(String wd, @RequestParam(required = false, defaultValue = "q") String type){
        if(StringUtils.isEmpty(wd)){
            return CorsUtil.format(ShcpResult.build(704, "关键字不能为空"));
        }
        return CorsUtil.format(testDeviceService.searchTestDevice(wd, type));
    }

    @RequestMapping("/{TDEID}")
    @ResponseBody
    public Object getTestDeviceById(@PathVariable Long TDEID){
        return CorsUtil.format(testDeviceService.getTestDeviceById(TDEID));
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Object deleteTestDevice(Long TDEID){
        return CorsUtil.format(testDeviceService.deleteTestDeviceById(TDEID));
    }

    @RequestMapping("/all")
    @ResponseBody
    public Object getAllTestDevices(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                                @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(testDeviceService.getAllTestDevices(page, rows));
    }

    @RequestMapping("/type/all")
    @ResponseBody
    public Object getAllTestDeviceTypes(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                                    @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(testDeviceService.getAllTestDeviceTypes(page, rows));
    }

    @RequestMapping("/type/{TDSID}")
    @ResponseBody
    public Object getTestDeviceType(@PathVariable Long TDSID){
        return CorsUtil.format(testDeviceService.getTestDeviceTypeById(TDSID));
    }

    @RequestMapping("/type/modify")
    @ResponseBody
    public Object modifyTestDeviceType(Long TDSID, String desName){
        if(StringUtils.isEmpty(desName)){
            return CorsUtil.format(ShcpResult.build(705, "设备类型名称不能为空"));
        }
        return CorsUtil.format(testDeviceService.modifyTestDeviceTypeName(TDSID, desName));
    }

    @RequestMapping("/status/all")
    @ResponseBody
    public Object getAllTestDeviceStatus(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                               @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(testDeviceService.getAllTestDeviceStatus(page, rows));
    }

    @RequestMapping("/status/{TDESID}")
    @ResponseBody
    public Object getTestDeviceStatus(@PathVariable Long TDESID){
        return CorsUtil.format(testDeviceService.getTestDeviceStatusById(TDESID));
    }

    @RequestMapping("/status/modify")
    @ResponseBody
    public Object modifyTestDeviceStatus(Long TDESID, @RequestParam(required = false, defaultValue = "") String desName,
                                     @RequestParam(required = false, defaultValue = "")String desType,
                                     @RequestParam(required = false, defaultValue = "")String desDefaultValue,
                                     @RequestParam(required = false, defaultValue = "")String desMinValue,
                                     @RequestParam(required = false, defaultValue = "")String desMaxValue){
        if(Objects.equals("", desName) && Objects.equals("", desType) && Objects.equals("", desDefaultValue) &&
                Objects.equals("", desMinValue) && Objects.equals("", desMaxValue)){
            return CorsUtil.format(ShcpResult.build(721, "请输入有效的修改"));
        }
        return CorsUtil.format(testDeviceService.modifyTestDeviceStatus(TDESID, desName, desType, desDefaultValue, desMinValue, desMaxValue));
    }

    @RequestMapping("/status/delete")
    @ResponseBody
    public Object deleteTestDeviceStatus(Long TDESID){
        return CorsUtil.format(testDeviceService.deleteTestDeviceStatus(TDESID));
    }

    @RequestMapping("/limit/all")
    @ResponseBody
    public Object getAllTestDeviceLimit(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                                    @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(testDeviceService.getAllTestDeviceLimits(page, rows));
    }

    @RequestMapping("/limit/{TDELID}")
    @ResponseBody
    public Object getDeviceLimit(@PathVariable Long TDELID){
        return CorsUtil.format(testDeviceService.getTestDeviceLimitById(TDELID));
    }

    @RequestMapping("/limit/modify")
    @ResponseBody
    public Object modifyTestDeviceLimit(Long TDELID, @RequestParam(required = false, defaultValue = "") String delName,
                                    @RequestParam(required = false, defaultValue = "") String delKey,
                                    @RequestParam(required = false, defaultValue = "") String delValue){
        if(Objects.equals("", delName) && Objects.equals("", delKey) && Objects.equals("", delValue)){
            return CorsUtil.format(ShcpResult.build(721, "请输入有效的修改"));
        }
        return CorsUtil.format(testDeviceService.modifyTestDeviceLimit(TDELID, delName, delKey, delValue));
    }

    @RequestMapping("/limit/delete")
    @ResponseBody
    public Object deleteTestDeviceLimit(Long DELID){
        return CorsUtil.format(testDeviceService.deleteTestDeviceLimit(DELID));
    }

    @RequestMapping("/control/all")
    @ResponseBody
    public Object getAllTestDeviceControl(@RequestParam(required = false, defaultValue = WebConstant.DEFAULT_PAGE) int page,
                                      @RequestParam(required = false, defaultValue = WebConstant.PAGE_SIZE) int rows){
        return CorsUtil.format(testDeviceService.getAllTestDeviceControls(page, rows));
    }

    @RequestMapping("/control/{TDECID}")
    @ResponseBody
    public Object getDeviceControl(@PathVariable Long TDECID){
        return CorsUtil.format(testDeviceService.getTestDeviceControlsById(TDECID));
    }

    @RequestMapping("/control/modify")
    @ResponseBody
    public Object modifyDeviceControl(Long TDECID, @RequestParam(required = false, defaultValue = "") String decName,
                                      @RequestParam(required = false, defaultValue = "") String decKey,
                                      @RequestParam(required = false, defaultValue = "") String decValue){
        if(Objects.equals("", decName) && Objects.equals("", decKey) && Objects.equals("", decValue)){
            return CorsUtil.format(ShcpResult.build(721, "请输入有效的修改"));
        }
        return CorsUtil.format(testDeviceService.modifyTestDeviceControl(TDECID, decName, decKey, decValue));
    }

    @RequestMapping("/control/delete")
    @ResponseBody
    public Object deleteDeviceControl(Long TDECID){
        return CorsUtil.format(testDeviceService.deleteTestDeviceControl(TDECID));
    }
}
