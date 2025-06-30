package com.youngheart.service.impl;

import com.youngheart.domain.Result;
import com.youngheart.domain.vo.geo.FlightCountVO;
import com.youngheart.mapper.GeoMapper;
import com.youngheart.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GeoServiceImpl implements GeoService {
    @Autowired
    private GeoMapper geoMapper;

    @Override
    public Result depCount() {
        try {
            List<FlightCountVO> flightCounts = geoMapper.countFlightsByDepartureCity();
            return Result.success(flightCounts);
        } catch (Exception e) {
            return Result.error(e.getMessage());
        }
    }
}