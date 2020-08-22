package com.taptap.demo.controller;


import com.taptap.demo.entity.DeveloperGame;
import com.taptap.demo.service.IDeveloperGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("developedGame")
public class DeveloperGameController {


    @Autowired
    IDeveloperGameService iDeveloperGameService;


    @RequestMapping("/developedGameAverageScore")
    public String getDeveloperGamePage(){
        return "Cross-over Analysis";
    }


    @RequestMapping("/getDeveloperGame")
    @ResponseBody
    public List<DeveloperGame> getDeveloperGame(){
        return iDeveloperGameService.getDeveloperGameList();
    }

}
