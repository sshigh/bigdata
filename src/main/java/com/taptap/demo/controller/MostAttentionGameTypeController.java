package com.taptap.demo.controller;


import com.taptap.demo.entity.MostAttentionGameType;
import com.taptap.demo.service.IMostAttentionGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/mostAttentionGameType")
public class MostAttentionGameTypeController {


    @Autowired
    IMostAttentionGameTypeService iMostAttentionGameTypeService;

    @RequestMapping("/mostAttentionGame")
    public String getMostAttentionGameTypePage(){
        return "Data Analysis";
    }

    @RequestMapping("/getMostAttentionGameType")
    @ResponseBody
    public List<MostAttentionGameType> getMostAttentionGameType(){
        return iMostAttentionGameTypeService.getMostAttentionGameTypeList();
    }

}
