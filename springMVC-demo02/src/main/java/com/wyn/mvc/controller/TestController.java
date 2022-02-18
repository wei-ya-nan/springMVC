package com.wyn.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String hello() {
        return "index";
    }

    @RequestMapping("/params")
    public String params() {
        return "test_params";
    }

}
