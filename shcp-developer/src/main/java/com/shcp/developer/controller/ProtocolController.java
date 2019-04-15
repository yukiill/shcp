package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Yuki
 * @date 2019/4/11 20:56
 */
@Slf4j
@Controller
@RequestMapping("/duser")
public class ProtocolController {

    @RequestMapping("/devpx")
    public String redirectToDevDoc(@RequestParam(required = false) String SdkType, @RequestParam(required = false) String ShowRDW,
                                   @RequestParam(required = false) Object bw){
        //TODO 等静态页面写完，写入转发地址即可
        return "";
    }

    @RequestMapping("/subdevpx")
    public Object isAgreeDevProtocol(@RequestParam String isAgree, @RequestParam(required = false) Object bw){
        return ShcpResult.ok();
    }
}
