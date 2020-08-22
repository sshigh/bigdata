package com.taptap.demo.controller;


import com.taptap.demo.entity.GameType;
import com.taptap.demo.service.IGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/gameType")
public class GameTypeController {

    @Autowired
    private IGameTypeService iGameTypeService;

    @RequestMapping("/allGame")
    public String getGameTypePage(){
        return "Index";
    }

    @RequestMapping("/getGameTypeDistribution")
    @ResponseBody
    public List<GameType> getGameTypeDistribution(){
        return iGameTypeService.getGameTypeList();
    }

    @RequestMapping("/getGameTypeCount")
    @ResponseBody
    public List<GameType> getGameTypeCount(){
        return iGameTypeService.getGameTypeCount();
    }

}
