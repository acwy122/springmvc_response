package com.mashibing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticController {

    @RequestMapping("testStatic")
    public String testStatic(){

        System.out.println("static");
        return "forward:/index.jsp";
    }
}
