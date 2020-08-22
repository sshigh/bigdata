package com.taptap.demo.controller;

import com.taptap.demo.entity.WellSaleGameType;
import com.taptap.demo.service.IWellSaleGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/wellSaleGameType")
public class WellSaleGameTypeController {


    @Autowired
    IWellSaleGameTypeService iWellSaleGameTypeService;

    @RequestMapping("/bestSaleGame")
    public String getWellSaleGameTypePage(){ return "List Analysis 1"; }

    @RequestMapping("/getWellSaleGameType")
    @ResponseBody
    public List<WellSaleGameType> getWellSaleGameType(){
        return iWellSaleGameTypeService.getWellSaleGameTypeList();
    }

    @RequestMapping("/getWellSaleGameDisType")
    @ResponseBody
    public List<WellSaleGameType> getWellSaleGameDisType(){
        return iWellSaleGameTypeService.getWellSaleGameDisTypeList();
    }

}
