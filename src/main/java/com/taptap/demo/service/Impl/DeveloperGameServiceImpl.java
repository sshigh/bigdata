package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.DeveloperGame;
import com.taptap.demo.mapper.DeveloperGameMapper;
import com.taptap.demo.service.IDeveloperGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeveloperGameServiceImpl implements IDeveloperGameService {

    @Autowired
    DeveloperGameMapper developerGameMapper;


    @Override
    public List<DeveloperGame> getDeveloperGameList() {
        return developerGameMapper.getDeveloperGameList();
    }
}
