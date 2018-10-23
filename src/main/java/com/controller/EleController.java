package com.controller;

import com.service.IEleService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EleController {
    @Autowired
    private IEleService iEleService;

    @RequestMapping("/select")
    @ResponseBody
    public String select(){
        return String.valueOf(iEleService.select(2));
    }
}
