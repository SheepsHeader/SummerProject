package com.youngheart.domain.vo.flight;

import lombok.Data;


public class ArrVO {
    private String airportName;
    private Integer flightCount;

    public ArrVO(String airportName, Integer flightCount) {
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