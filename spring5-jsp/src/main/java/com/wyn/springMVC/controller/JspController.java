package com.wyn.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wei-ya-nan
 * @version 1.0
 * @date 2022/2/16
 */
@Controller
public class JspController {
    @RequestMapping("/haha")
    public String testJsp(){
        return "success";
    }

}
