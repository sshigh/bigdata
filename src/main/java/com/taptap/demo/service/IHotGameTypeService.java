package com.taptap.demo.service;

import com.taptap.demo.entity.HotGameType;

import java.util.List;

public interface IHotGameTypeService {
    List<HotGameType> getHotGameTypeList();
    List<HotGameType> getHotTestGameTypeList();
}
