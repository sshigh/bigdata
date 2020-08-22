package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.WellSaleGameType;
import com.taptap.demo.mapper.WellSaleGameTypeMapper;
import com.taptap.demo.service.IWellSaleGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WellSaleGameTypeServiceImpl implements IWellSaleGameTypeService {


    @Autowired
    WellSaleGameTypeMapper wellSaleGameTypeMapper;

    @Override
    public List<WellSaleGameType> getWellSaleGameTypeList() {
        return wellSaleGameTypeMapper.getWellSaleGameTypeList();
    }

    @Override
    public List<WellSaleGameType> getWellSaleGameDisTypeList() {
        return wellSaleGameTypeMapper.getWellSaleGameDisTypeList();
    }
}
