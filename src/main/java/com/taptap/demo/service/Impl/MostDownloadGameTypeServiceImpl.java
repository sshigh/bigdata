package com.taptap.demo.service.Impl;

        import com.taptap.demo.entity.MostDownloadGameType;
        import com.taptap.demo.mapper.MostDownloadGameTypeMapper;
        import com.taptap.demo.service.IMostDownloadGameTypeService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class MostDownloadGameTypeServiceImpl implements IMostDownloadGameTypeService {

    @Autowired
    MostDownloadGameTypeMapper mostDownloadGameTypeMapper;

    @Override
    public List<MostDownloadGameType> getMostDownloadGameTypeList() {
        return mostDownloadGameTypeMapper.getMostDownloadGameType();
    }
}
