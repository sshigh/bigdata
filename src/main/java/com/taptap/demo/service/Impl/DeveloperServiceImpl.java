package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.Developer;
import com.taptap.demo.mapper.DeveloperMapper;
import com.taptap.demo.service.IDeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DeveloperServiceImpl implements IDeveloperService {

    @Autowired
    DeveloperMapper developerMapper;

    @Override
    public List<Developer> getDeveloperList() {
        return developerMapper.getDeveloperList();
    }
}
