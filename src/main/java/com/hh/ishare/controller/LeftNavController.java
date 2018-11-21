package com.hh.ishare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("leftNav")
public class LeftNavController {

    @RequestMapping("getList")
    public  String getList(){
        System.out.println("i am in");
        return "include/leftNavList" ;
    }
}
