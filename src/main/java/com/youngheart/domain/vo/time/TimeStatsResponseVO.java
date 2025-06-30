package com.youngheart.domain.vo.time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data

@NoArgsConstructor
public class TimeStatsResponseVO {
    private List<AirportPagerankVO> airportPageranks;
    private List<FlightTimeSlotStatsVO> timeSlotStats;
    private List<FlightRouteDensityStatsVO> routeDensityStats;





    public TimeStatsResponseVO(List<AirportPagerankVO> allAirportPagerank, List<FlightTimeSlotStatsVO> allFlightTimeSlotStats, List<FlightRouteDensityStatsVO> byRoute) {
    }

    public List<AirportPagerankVO> getAirportPageranks() {
        return airportPageranks;
    }

    public void setAirportPageranks(List<AirportPagerankVO> airportPageranks) {
        this.airportPageranks = airportPageranks;
    }

    public List<FlightTimeSlotStatsVO> getTimeSlotStats() {
        return timeSlotStats;
    }

    public void setTimeSlotStats(List<FlightTimeSlotStatsVO> timeSlotStats) {
        this.timeSlotStats = timeSlotStats;
    }

    public List<FlightRouteDensityStatsVO> getRouteDensityStats() {
        return routeDensityStats;
    }

    public void setRouteDensityStats(List<FlightRouteDensityStatsVO> routeDensityStats) {
        this.routeDensityStats = routeDensityStats;
    }
}