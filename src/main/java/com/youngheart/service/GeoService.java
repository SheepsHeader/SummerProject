package com.youngheart.service;

import com.youngheart.domain.vo.flight.ArrVO;
import com.youngheart.domain.vo.flight.LandVO;

import java.util.List;

public interface GeoService {
    List<ArrVO> getArrCount();

    List<LandVO> getLandCount();
}
