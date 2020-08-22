package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.GameType;
import com.taptap.demo.mapper.GameTypeMapper;
import com.taptap.demo.service.IGameTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameTypeServiceImpl implements IGameTypeService {

    @Autowired
    private GameTypeMapper gameTypeMapper;

    @Override
    public List<GameType> getGameTypeList() {
         return gameTypeMapper.getGameTypeList();
    }

    @Override
    public List<GameType> getGameTypeCount() {
        return gameTypeMapper.getGameTypeCountList();
    }
}
