package com.taptap.demo.mapper;


import com.taptap.demo.entity.GameType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface GameTypeMapper {
    List<GameType> getGameTypeList();
    List<GameType> getGameTypeCountList();
}
