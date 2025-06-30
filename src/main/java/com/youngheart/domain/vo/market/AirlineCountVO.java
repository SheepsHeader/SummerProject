package com.youngheart.domain.vo.market;

import lombok.Data;

@Data
public class AirlineCountVO {
    private String airlineName;
    private Integer count;

    public AirlineCountVO(String airlineName, Integer count) {
        this.airlineName = airlineName;
        this.count = count;
    }

    public AirlineCountVO() {
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
