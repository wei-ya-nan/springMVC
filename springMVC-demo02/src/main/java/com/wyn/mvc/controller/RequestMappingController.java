package com.wyn.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping("/testRequestMapping")
    public String success(){
        return "success";
    }
    @GetMapping("/getMapping")
    public String testGetMapping(){
        return "getMapping";
    }
    @GetMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable int id,@PathVariable String username){
        System.out.println(id);
        System.out.println(username);
        return "success";
    }


}
