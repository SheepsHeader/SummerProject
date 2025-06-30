package com.youngheart.domain.vo.flight;

public class FlightVO {
    private String depCity;
    private String arrCity;
    private Integer flightCount;

    public FlightVO(String depCity, String arrCity, Integer flightCount) {
        this.depCity = depCity;
        this.arrCity = arrCity;
        this.flightCount = flightCount;
    }

    public String getDepCity() {
        return depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public String getArrCity() {
        return arrCity;
    }

    public void setArrCity(String arrCity) {
        this.arrCity = arrCity;
    }

    public Integer getFlightCount() {
        return flightCount;
    }

    public void setFlightCount(Integer flightCount) {
        this.flightCount = flightCount;
    }
}
