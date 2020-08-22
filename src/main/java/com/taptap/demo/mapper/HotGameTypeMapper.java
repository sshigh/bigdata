package com.taptap.demo.mapper;


import com.taptap.demo.entity.HotGameType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HotGameTypeMapper {
    List<HotGameType> getHotGameType();
    List<HotGameType> getHotGameDisType();
}
