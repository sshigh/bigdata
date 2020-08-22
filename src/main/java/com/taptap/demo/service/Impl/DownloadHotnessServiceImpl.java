package com.taptap.demo.service.Impl;

import com.taptap.demo.entity.DownloadHotness;
import com.taptap.demo.mapper.DownloadHotnessMapper;
import com.taptap.demo.service.IDownloadHotnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DownloadHotnessServiceImpl implements IDownloadHotnessService {

    @Autowired
    DownloadHotnessMapper downloadHotnessMapper;


    @Override
    public List<DownloadHotness> getDownloadHotnessList() {
        return downloadHotnessMapper.getDownloadHotnessList();
    }
}
