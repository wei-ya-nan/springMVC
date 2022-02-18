package com.wyn.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author wei-ya-nan
 * @version 1.0
 * @date 2022/2/18
 */
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {ArithmeticException.class, NullPointerException.class})
        public String testException(Exception ex, Model model){
            model.addAttribute("ex",ex);
            return "error";
        }

    }

