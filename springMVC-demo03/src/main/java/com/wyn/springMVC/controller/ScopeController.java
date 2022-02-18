package com.wyn.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author wei-ya-nan
 * @version 1.0
 * @date 2022/2/15
 */
@Controller
public class ScopeController {
    @RequestMapping("/testReq")
    public String testRequestByApi(HttpServletRequest request) {
        request.setAttribute("testScope", "hello,servlet");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView modelAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testModelAndView", "hello ModelAndView");
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testModel"," hello testModel");
        return "success";
    }
    @RequestMapping("/testMap")
    public String testMap(Map<String ,String> map){
        map.put("testMap", "hello,testMap");
        return "success";
    }
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("ModelMap","hello modelMap");
        System.out.println(modelMap.getClass().getName());
        return "success";
    }
    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSession", "hello session");
        return "success";
    }
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){

        ServletContext application = session.getServletContext();
        application.setAttribute("testApplication", "hello application");

        return "success";
    }
}
