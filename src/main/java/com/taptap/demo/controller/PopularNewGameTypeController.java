package com.taptap.demo.controller;


import com.taptap.demo.entity.PopularNewGameType;
import com.taptap.demo.service.IPopularNewGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("popularNewGameType")
public class PopularNewGameTypeController {


    @Autowired
    IPopularNewGameTypeService iPopularNewGameTypeService;


    @RequestMapping("/popularNewGameTypePage")
    public String getPopularNewGameTypePages(){
        return "list analysis2";
    }


    @RequestMapping("/getPopularNewGameType")
    @ResponseBody
    public List<PopularNewGameType> getPopularNewGameType(){
        return iPopularNewGameTypeService.getPopularNewGameTypeList();
    }


}
