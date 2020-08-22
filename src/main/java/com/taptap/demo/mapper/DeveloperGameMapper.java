package com.taptap.demo.mapper;


import com.taptap.demo.entity.DeveloperGame;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeveloperGameMapper {
    List<DeveloperGame> getDeveloperGameList();
}
