package com.taptap.demo.mapper;


import com.taptap.demo.entity.Developer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeveloperMapper {
    List<Developer> getDeveloperList();
}
