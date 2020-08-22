package com.taptap.demo.controller;


import com.taptap.demo.entity.HotGameType;
import com.taptap.demo.service.IHotGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/hotPlayGameType")
public class HotGameTypeController {

    @Autowired
    IHotGameTypeService iHotGameTypeService;

    @RequestMapping("/hottestPlayGame")
    public String getHotGameTypePage(){
        return "List Analysis 1";
    }


    @RequestMapping("/getHotGameTypeDistribution")
    @ResponseBody
    public List<HotGameType> getHotGameTypeDistribution(){
        return iHotGameTypeService.getHotGameTypeList();
    }


    @RequestMapping("/getHotTestGameType")
    @ResponseBody
    public List<HotGameType> getHotTestGameType(){
        return iHotGameTypeService.getHotTestGameTypeList();
    }

}
