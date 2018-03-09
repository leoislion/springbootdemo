package com.example.ajaxserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/testJson")
    @ResponseBody
    public String testJson(){
        return "hello springboot";
    }
    @RequestMapping("/testPage")
    public String testPage(){
        return "welcome";
    }
}
