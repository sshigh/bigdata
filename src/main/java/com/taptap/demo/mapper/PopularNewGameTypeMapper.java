package com.taptap.demo.mapper;


import com.taptap.demo.entity.PopularNewGameType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface PopularNewGameTypeMapper {
    List<PopularNewGameType> getPopularNewGameTypeList();
}
