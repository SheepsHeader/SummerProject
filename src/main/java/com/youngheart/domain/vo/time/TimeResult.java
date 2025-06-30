package com.youngheart.domain.vo.time;

import java.util.List;

public class TimeResult {
    private List<AirportPagerankVO> airportPagerankVOList;
    private List<FlightTimeSlotStatsVO> flightTimeSlotStatsVOList;
    private List<FlightRouteDensityStatsVO> flightRouteDensityStatsVOList;

    public TimeResult(List<AirportPagerankVO> airportPagerankVOList, List<FlightTimeSlotStatsVO> flightTimeSlotStatsVOList, List<FlightRouteDensityStatsVO> flightRouteDensityStatsVOList) {
        this.airportPagerankVOList = airportPagerankVOList;
        this.flightTimeSlotStatsVOList = flightTimeSlotStatsVOList;
        this.flightRouteDensityStatsVOList = flightRouteDensityStatsVOList;
    }

    public TimeResult() {
    }

    public List<AirportPagerankVO> getAirportPagerankVOList() {
        return airportPagerankVOList;
    }

    public void setAirportPagerankVOList(List<AirportPagerankVO> airportPagerankVOList) {
        this.airportPagerankVOList = airportPagerankVOList;
    }

    public List<FlightTimeSlotStatsVO> getFlightTimeSlotStatsVOList() {
        return flightTimeSlotStatsVOList;
    }

    public void setFlightTimeSlotStatsVOList(List<FlightTimeSlotStatsVO> flightTimeSlotStatsVOList) {
        this.flightTimeSlotStatsVOList = flightTimeSlotStatsVOList;
    }

    public List<FlightRouteDensityStatsVO> getFlightRouteDensityStatsVOList() {
        return flightRouteDensityStatsVOList;
    }

    public void setFlightRouteDensityStatsVOList(List<FlightRouteDensityStatsVO> flightRouteDensityStatsVOList) {
        this.flightRouteDensityStatsVOList = flightRouteDensityStatsVOList;
    }
}
