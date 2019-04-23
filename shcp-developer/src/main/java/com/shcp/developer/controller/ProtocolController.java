package com.shcp.developer.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.developer.service.ProtocolService;
import com.shcp.pojo.Developer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author Yuki
 * @date 2019/4/11 20:56
 */
@Slf4j
@Controller
@RequestMapping("/duser")
public class ProtocolController {

    @Resource
    private ProtocolService protocolService;
    @Resource
    private HttpSession httpSession;

    @RequestMapping("/devpx")
    public String redirectToDevDoc(){
        //TODO 等静态页面写完，写入转发地址即可
        return "";
    }

    @RequestMapping("/subdevpx")
    public Object isAgreeDevProtocol(@RequestParam Integer isAgree, @RequestParam(required = false) Object bw){
        if(Objects.isNull(isAgree)){
            return ShcpResult.build(730, "发生了些意料之外的错误");
        }
        Developer developer = (Developer) httpSession.getAttribute("duser");
        return protocolService.agreeDevProtocol(developer, isAgree);
    }
}
