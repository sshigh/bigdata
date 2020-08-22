package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.PopularNewGameType;
import com.taptap.demo.mapper.PopularNewGameTypeMapper;
import com.taptap.demo.service.IPopularNewGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPopularNewGameTypeServiceImpl implements IPopularNewGameTypeService {


    @Autowired
    PopularNewGameTypeMapper popularNewGameTypeMapper;


    @Override
    public List<PopularNewGameType> getPopularNewGameTypeList() {
        return popularNewGameTypeMapper.getPopularNewGameTypeList();
    }
}
