package com.youngheart.domain.vo.market;

import lombok.Data;

@Data
public class AirportCountVO {
    private String airportName;
    private String count;

    public AirportCountVO(String count, String airportName) {
        this.count = count;
        this.airportName = airportName;
    }

    public AirportCountVO() {
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }
}
