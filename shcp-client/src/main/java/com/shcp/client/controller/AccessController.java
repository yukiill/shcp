package com.shcp.client.controller;

import com.shcp.common.pojo.ShcpResult;
import com.shcp.common.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Yuki
 * @date 2019/4/21 19:46
 */
@Slf4j
@Controller
public class AccessController {

    @RequestMapping(value = "/accessDenied", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String accessDenied(){
        return JsonUtil.objectToJson(ShcpResult.build(800, "您没有权限进行此项操作"));
    }
}
