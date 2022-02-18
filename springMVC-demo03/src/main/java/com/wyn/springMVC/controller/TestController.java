package com.wyn.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wei-ya-nan
 * @version 1.0
 * @date 2022/2/15
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String String(){
        return "test_rest";
    }
    @RequestMapping("/test_view")
    public String test_View(){
        return "test_view";
    }
}
