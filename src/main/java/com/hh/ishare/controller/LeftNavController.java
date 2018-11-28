package com.hh.ishare.controller;

import com.hh.ishare.bean.DataType;
import com.hh.ishare.service.DataTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("leftNav")
public class LeftNavController {

    @Autowired
    private DataTypeService dataTypeService;
    @RequestMapping("getList")
    public  String getList(Model model, String userId){
        DataType typ=new DataType();
        typ.setPublisher(userId);
        List<DataType> dataTypeList=dataTypeService.list(typ);
        model.addAttribute("dataTypeList",dataTypeList);

        return "include/leftNavList" ;
    }

    @PostMapping("add")
    @ResponseBody
    public  int add(String navName){
        System.out.println(navName);
        DataType typ=new DataType();
        typ.setPublisher("1");
        typ.setTypeName(navName);
        int flag= dataTypeService.add(typ);
        return flag ;
    }
}
