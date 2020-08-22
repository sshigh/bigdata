package com.taptap.demo.mapper;


import com.taptap.demo.entity.AttentionHotness;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import javax.accessibility.AccessibleText;
import java.util.List;

@Mapper
@Component
public interface AttentionHotnessMapper {
    List<AttentionHotness> getAttentionHotnessList();
}
