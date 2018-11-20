package com.hh.ishare.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public  String toIndex(){
        return "index" ;
    }

    @RequestMapping("/nav")
    public  String nav(){
        return "navList";
    }

    @RequestMapping("/con")
    public  String con(){
        return "conList";
    }
}
