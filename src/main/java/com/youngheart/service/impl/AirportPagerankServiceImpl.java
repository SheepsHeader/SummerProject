package com.youngheart.service.impl;

import com.youngheart.domain.vo.time.AirportPagerankVO;
import com.youngheart.domain.vo.time.FlightRouteDensityStatsVO;
import com.youngheart.domain.vo.time.FlightTimeSlotStatsVO;
import com.youngheart.mapper.AirportPagerankMapper;
import com.youngheart.service.AirportPagerankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportPagerankServiceImpl implements AirportPagerankService {

    private final AirportPagerankMapper airportPagerankMapper;

    @Autowired
    public AirportPagerankServiceImpl(AirportPagerankMapper airportPagerankMapper) {
        this.airportPagerankMapper = airportPagerankMapper;
    }

    @Override
    public List<AirportPagerankVO> getAllAirportPagerank() {
        // Error handling can be added here, but for a direct return,
        // Spring's default exception handling might suffice, or you can
        // throw custom exceptions to be handled by a @ControllerAdvice.
        return airportPagerankMapper.findAllAirportPagerank();
    }

    @Override
    public List<FlightTimeSlotStatsVO> findAllFlightTimeSlotStats() {
        return airportPagerankMapper.findAllFlightTimeSlotStats();
    }
    public List<FlightRouteDensityStatsVO> findByRoute(){
        return airportPagerankMapper.findByRoute();
    }
}