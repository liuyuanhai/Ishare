package com.hh.ishare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/content")
public class ContentController {

    @RequestMapping("getList")
    public String getList(){

        return "include/conList" ;
    }
}
