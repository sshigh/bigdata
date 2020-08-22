package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.MostAttentionGameType;
import com.taptap.demo.mapper.MostAttentionGameTypeMapper;
import com.taptap.demo.service.IMostAttentionGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostAttentionGameTypeServiceImpl implements IMostAttentionGameTypeService {

    @Autowired
    MostAttentionGameTypeMapper mostAttentionGameTypeMapper;


    @Override
    public List<MostAttentionGameType> getMostAttentionGameTypeList() {
        return mostAttentionGameTypeMapper.getMostAttentionGameType();
    }
}
