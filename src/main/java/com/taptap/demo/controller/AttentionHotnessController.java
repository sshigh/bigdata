package com.taptap.demo.controller;



import com.taptap.demo.entity.AttentionHotness;
import com.taptap.demo.service.IAttentionHotnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/attentionHotness")
public class AttentionHotnessController {

    @Autowired
    IAttentionHotnessService iAttentionHotnessService;


    @RequestMapping("/attentionAmountAndHotnessRelationship")
    public String getAttentionHotnessPage(){
        return "Cross-over Analysis";
    }


    @RequestMapping("/getAttentionHotness")
    @ResponseBody
    public List<AttentionHotness> getAttentionHotness(){
        return iAttentionHotnessService.getAttentionHotnessList();
    }


}
