package com.wyn.mvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
//@Component//标识当前的类为普通组件
@Controller//标识为控制组件
//@Service//标识为业务组件service类
//@Repository//表示为持久层组件操作数据库的部分
public class HelloController {
    @RequestMapping("/")
    public String index(){
        //返回视图名称
        return "index";
    }
    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
