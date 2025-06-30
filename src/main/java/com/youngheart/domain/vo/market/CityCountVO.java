package com.youngheart.domain.vo.market;

import lombok.Data;

@Data
public class CityCountVO {
    private String cityName;
    private Integer count;

    public CityCountVO(String cityName, Integer count) {
        this.cityName = cityName;
        this.count = count;
    }

    public CityCountVO() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
