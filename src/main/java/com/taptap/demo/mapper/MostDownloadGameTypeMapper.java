package com.taptap.demo.mapper;

import com.taptap.demo.entity.MostDownloadGameType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface MostDownloadGameTypeMapper {
    List<MostDownloadGameType> getMostDownloadGameType();

}
