package com.taptap.demo.controller;


import com.taptap.demo.entity.MostOrderGameType;
import com.taptap.demo.service.IMostOrderGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/mostOrderGameType")
public class MostOrderGameTypeController {

    @Autowired
    IMostOrderGameTypeService iMostOrderGameTypeService;

    @RequestMapping("/mostOrderGameTypePages")
    public String getMostOrderGameTypePage(){
        return "";
    }

    @RequestMapping("/getMostOrderGameType")
    @ResponseBody
    public List<MostOrderGameType> getMostOrderGameType(){
        return iMostOrderGameTypeService.getMostOrderGameTypeList();
    }


}
