package com.taptap.demo.mapper;


import com.taptap.demo.entity.MostOrderGameType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MostOrderGameTypeMapper {
    List<MostOrderGameType> getMostOrderGameTypeList();
}
