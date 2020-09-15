package com.aiguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "你给我里";
    }
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
