package com.youngheart.controller;

import com.youngheart.domain.vo.time.AirportPagerankVO;
import com.youngheart.domain.vo.time.FlightRouteDensityStatsVO;
import com.youngheart.domain.vo.time.FlightTimeSlotStatsVO;
import com.youngheart.service.AirportPagerankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // This annotation combines @Controller and @ResponseBody
@RequestMapping("/airport-importance") // Changed path for clarity
public class AirportPagerankController {

    private final AirportPagerankService airportPagerankService;

    @Autowired
    public AirportPagerankController(AirportPagerankService airportPagerankService) {
        this.airportPagerankService = airportPagerankService;
    }

    /**
     * Retrieves all airport pagerank statistics.
     * The returned List<AirportPagerankVO> will be automatically converted to JSON array.
     * Endpoint: GET /airport-importance/all
     * Example JSON response:
     * [
     * {
     * "airport": "JFK",
     * "pagerank": 0.12345
     * },
     * {
     * "airport": "LAX",
     * "pagerank": 0.09876
     * }
     * ]
     */
    @GetMapping("/vital")
    public List<AirportPagerankVO> getAllAirportPagerank() {
        return airportPagerankService.getAllAirportPagerank();
    }
    @GetMapping("/trend")
    public List<FlightTimeSlotStatsVO> findAllFlightTimeSlotStats(){
        return airportPagerankService.findAllFlightTimeSlotStats();
    }
    @GetMapping("/compet")
    public List<FlightRouteDensityStatsVO> findAllFlightRouteDensityStats(String route){
        return airportPagerankService.findByRoute();
    }

}