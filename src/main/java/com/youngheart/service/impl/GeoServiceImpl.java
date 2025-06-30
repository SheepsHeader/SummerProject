package com.youngheart.service.impl;

import com.youngheart.domain.Result;
import com.youngheart.domain.vo.flight.ArrVO;
import com.youngheart.domain.vo.flight.FlightVO;
import com.youngheart.domain.vo.flight.GeoStatsResponseVO;
import com.youngheart.domain.vo.flight.LandVO;
import com.youngheart.mapper.GeoMapper;
import com.youngheart.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GeoServiceImpl implements GeoService {
////    private static final Logger logger = LoggerFactory.getLogger(GeoServiceImpl.class);
//
//    @Autowired
//    private GeoMapper geoMapper;
//
//    public List<ArrVO> getArrCount(){
//      return geoMapper.getArrCount();
//    }
//
//    @Override
//    public List<LandVO> getLandCount() {
//        return geoMapper.getLandCount();
//    }
//
//    @Override
//    public List<FlightVO> getFlightCount() {
//        return geoMapper.getFlightCount();
//    }
private final GeoMapper geoMapper;

    @Autowired
    public GeoServiceImpl(GeoMapper geoMapper) {
        this.geoMapper = geoMapper;
    }

    @Override
    public GeoStatsResponseVO getAllGeoStats() {
        GeoStatsResponseVO response = new GeoStatsResponseVO();
        response.setDepartureStats(geoMapper.getArrCount());
        response.setLandingStats(geoMapper.getLandCount());
        response.setRouteStats(geoMapper.getFlightCount());
        return response;
    }
}