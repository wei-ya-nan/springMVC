package com.wyn.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author wei-ya-nan
 * @version 1.0
 * @date 2022/2/16
 * 模拟增删改查，五个功能
 *  /user      GET   查询所有
 *  /user/id   GET   根据用户id查询信息
 *  /user     POST   添加用户信息
 *  /user/id  DELETE  根据id删除
 *  /user      PUT    更新用户信息
 *
 *
 */
@Controller
public class UserController {
//    @RequestMapping(value = "/test_rust",method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUser(){
        System.out.println("查询所有的用户信息");
        return "success";
    }
    @GetMapping("/user/{id}")
    public String deleteUserById(@PathVariable int id){
        System.out.println(id+"被找到了");
        return "success";
    }
    @PostMapping("/user")
    public String addeUser(@RequestParam String username,@RequestParam String password){
        System.out.println(username);
        System.out.println(password);
        return "success";
    }
    @PutMapping("/user")
    public String updateUser(String username,String password){
        System.out.println(username+"..."+password);
        return "success";
    }
}
