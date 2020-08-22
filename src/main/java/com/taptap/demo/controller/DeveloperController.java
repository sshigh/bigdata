package com.taptap.demo.controller;


import com.taptap.demo.entity.Developer;
import com.taptap.demo.service.IDeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/developer")
public class DeveloperController {

    @Autowired
    IDeveloperService iDeveloperService;


    @RequestMapping("/developerEvaluation")
    public String getDeveloperPage(){
        return "Cross-over Analysis";
    }


    @ResponseBody
    @RequestMapping("/getDeveloper")
    public List<Developer> getDeveloper(){
        return iDeveloperService.getDeveloperList();
    }




}
