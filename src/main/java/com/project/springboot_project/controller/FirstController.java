package com.project.springboot_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
    @RequestMapping("/uid")
    @ResponseBody
//    public String hello(@PathVariable("id") String id){
//        return id;
//    }
    public String hello1(@RequestParam("name") String name){
        return name;
    }
}
