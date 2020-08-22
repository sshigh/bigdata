package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.GameType;
import com.taptap.demo.mapper.GameTypeMapper;
import com.taptap.demo.service.IGameTypeSercive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class gameTypeSerciveImpl implements IGameTypeSercive {

    @Autowired
    private GameTypeMapper gameTypeMapper;

    @Override
    public List<GameType> getGameTypeList() {
         return gameTypeMapper.getGameTypeList();
    }
}
