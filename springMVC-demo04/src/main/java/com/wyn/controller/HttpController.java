package com.wyn.controller;

import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wei-ya-nan
 * @version 1.0
 * @date 2022/2/17
 */
@Controller
public class HttpController {
    @PostMapping("/testReqBody")
    public String testReqBody(@RequestBody String requestBody) {
        System.out.println("..." + requestBody);
        return "success";
    }

    @RequestMapping("/testReqEntity")
    public String testReqEntity(RequestEntity<String> requestEntity) {
        System.out.println("requestHeader:" + requestEntity.getHeaders());
        System.out.println("requestBody:" + requestEntity.getBody());
        return "success";
    }

    @RequestMapping("testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello");

    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    public String testResponseBody() {
        return "success";
    }
    @RequestMapping("/testAjax")
    @ResponseBody
    public String testAjax(String username, String password) {
        System.out.println(username+"..."+password);
        return "hello ajax";
    }


}
