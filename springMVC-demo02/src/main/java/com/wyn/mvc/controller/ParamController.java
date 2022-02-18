package com.wyn.mvc.controller;

import com.sun.istack.internal.NotNull;
import com.wyn.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author wei-ya-nan
 * @version 1.0
 */
@Controller
public class ParamController {
    @RequestMapping("/testServletApi")
    public String testServletApi(@NotNull HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + ",,," + password);
        return "test_params";
    }

    @RequestMapping("/testParam")
    public String testParam(@RequestParam("username") String username, @RequestParam("password") String password,
                            @RequestParam("hobby") String hobby) {
        System.out.println(username + ",,," + password + "..." + Arrays.toString(new String[]{hobby}));
        return "success";
    }
    @RequestMapping("/testpojo")
    public String testpojo(User user){
        System.out.println(user);
        return "sccuss";
    }

}
