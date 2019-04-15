package com.shcp.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Yuki
 * @date 2019/4/10 15:09
 */
@Controller
public class PageController {

    @RequestMapping("{page}")
    public String redirctPage(@PathVariable String page){
        return page;
    }
}
