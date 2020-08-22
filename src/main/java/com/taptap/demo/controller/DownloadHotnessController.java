package com.taptap.demo.controller;


import com.taptap.demo.entity.DownloadHotness;
import com.taptap.demo.service.IDownloadHotnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/downloadHotness")
public class DownloadHotnessController {

    @Autowired
    IDownloadHotnessService iDownloadHotnessService;


    @RequestMapping("/downloadingTimesAndHotnessRelationship")
    public String getDownloadHotnessPage(){
        return "Cross-over Analysis";
    }


    @RequestMapping("/getDownloadHotness")
    @ResponseBody
    public List<DownloadHotness> getDownloadHotness(){
        return iDownloadHotnessService.getDownloadHotnessList();
    }

}
