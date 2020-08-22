package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.MostOrderGameType;
import com.taptap.demo.mapper.MostOrderGameTypeMapper;
import com.taptap.demo.service.IMostOrderGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IMostOrderGameTypeServiceImpl implements IMostOrderGameTypeService {

    @Autowired
    MostOrderGameTypeMapper mostOrderGameTypeMapper;


    @Override
    public List<MostOrderGameType> getMostOrderGameTypeList() {
        return mostOrderGameTypeMapper.getMostOrderGameTypeList();
    }
}
