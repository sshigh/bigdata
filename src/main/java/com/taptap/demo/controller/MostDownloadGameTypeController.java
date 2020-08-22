package com.taptap.demo.controller;


import com.taptap.demo.entity.MostDownloadGameType;
import com.taptap.demo.service.IMostDownloadGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/mostDownloadGameType")
public class MostDownloadGameTypeController {

    @Autowired
    IMostDownloadGameTypeService iMostDownloadGameTypeService;


    @RequestMapping("/mostDownloadGame")
    public String getMostDownloadGameTypePage(){
        return "Data Analysis";
    }


    @ResponseBody
    @RequestMapping("/getMostDownloadGameType")
    public List<MostDownloadGameType> getMostDownloadGameType(){
        return  iMostDownloadGameTypeService.getMostDownloadGameTypeList();
    }

}
