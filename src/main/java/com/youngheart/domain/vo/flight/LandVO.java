package com.youngheart.domain.vo.flight;


public class LandVO {
    private String airportName;
    private Integer flightCount;

    public LandVO(String airportName, Integer flightCount) {
        this.airportName = airportName;
        this.flightCount = flightCount;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public Integer getFlightCount() {
        return flightCount;
    }

    public void setFlightCount(Integer flightCount) {
        this.flightCount = flightCount;
    }
}