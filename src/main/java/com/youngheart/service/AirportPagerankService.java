package com.youngheart.service;



import com.youngheart.domain.vo.time.AirportPagerankVO;
import com.youngheart.domain.vo.time.FlightRouteDensityStatsVO;
import com.youngheart.domain.vo.time.FlightTimeSlotStatsVO;

import java.util.List;

public interface AirportPagerankService {

    /**
     * Retrieves all airport pagerank statistics.
     * @return A list of AirportPagerankVO objects.
     */
    List<AirportPagerankVO> getAllAirportPagerank();
    List<FlightTimeSlotStatsVO> findAllFlightTimeSlotStats();
    List<FlightRouteDensityStatsVO> findByRoute();
}