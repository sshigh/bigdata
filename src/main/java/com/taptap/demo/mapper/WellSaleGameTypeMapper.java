package com.taptap.demo.mapper;

import com.taptap.demo.entity.WellSaleGameType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface WellSaleGameTypeMapper {
    List<WellSaleGameType> getWellSaleGameTypeList();
    List<WellSaleGameType> getWellSaleGameDisTypeList();
}
