package com.taptap.demo.service;

import com.taptap.demo.entity.WellSaleGameType;

import java.util.List;

public interface IWellSaleGameTypeService {
    List<WellSaleGameType> getWellSaleGameTypeList();
    List<WellSaleGameType> getWellSaleGameDisTypeList();
}
