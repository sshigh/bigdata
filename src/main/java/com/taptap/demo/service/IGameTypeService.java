package com.taptap.demo.service;

import com.taptap.demo.entity.GameType;

import java.util.List;

public interface IGameTypeService {
    List<GameType> getGameTypeList();
    List<GameType> getGameTypeCount();
}
