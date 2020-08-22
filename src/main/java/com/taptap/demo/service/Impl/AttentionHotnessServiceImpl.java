package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.AttentionHotness;
import com.taptap.demo.mapper.AttentionHotnessMapper;
import com.taptap.demo.service.IAttentionHotnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AttentionHotnessServiceImpl implements IAttentionHotnessService {


    @Autowired
    AttentionHotnessMapper attentionHotnessMapper;


    @Override
    public List<AttentionHotness> getAttentionHotnessList() {
        return attentionHotnessMapper.getAttentionHotnessList();
    }
}
