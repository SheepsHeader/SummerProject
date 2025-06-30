package com.youngheart.service.impl;

import com.youngheart.domain.Result;
import com.youngheart.domain.vo.flight.ArrVO;
import com.youngheart.domain.vo.flight.LandVO;
import com.youngheart.mapper.GeoMapper;
import com.youngheart.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GeoServiceImpl implements GeoService {
//    private static final Logger logger = LoggerFactory.getLogger(GeoServiceImpl.class);

    @Autowired
    private GeoMapper geoMapper;

    public List<ArrVO> getArrCount(){
      return geoMapper.getArrCount();
    }

    @Override
    public List<LandVO> getLandCount() {
        return geoMapper.getLandCount();
    }
}