package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.HotGameType;
import com.taptap.demo.mapper.HotGameTypeMapper;
import com.taptap.demo.service.IHotGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class HotGameTypeServiceImpl implements IHotGameTypeService {

    @Autowired
    HotGameTypeMapper hotGameTypeMapper;


    @Override
    public List<HotGameType> getHotGameTypeList() {
        return hotGameTypeMapper.getHotGameDisType();
    }

    @Override
    public List<HotGameType> getHotTestGameTypeList() {
        return hotGameTypeMapper.getHotGameType();
    }

}
