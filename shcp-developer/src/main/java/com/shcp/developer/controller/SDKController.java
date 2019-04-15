package com.shcp.developer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Yuki
 * @date 2019/4/15 16:21
 */
@Slf4j
@Controller
public class SDKController {

    @RequestMapping("/duser/devsddoc")
    public String redirectToSDKHtml(@RequestParam(required = false) String SdkType, @RequestParam(required = false) String ShowRDW,
                                    @RequestParam(required = false) Object bw){
        return "";
    }
}
