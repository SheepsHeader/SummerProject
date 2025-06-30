package com.youngheart.domain.vo.market;

public class PosCountVO {
    private String city;
    private Float lat;
    private Float lng;
    private Integer depCount;
    private Integer arrCount;

    public PosCountVO(String city, Float lat, Float lng, Integer depCount, Integer arrCount) {
        this.city = city;
        this.lat = lat;
        this.lng = lng;
        this.depCount = depCount;
        this.arrCount = arrCount;
    }

    public PosCountVO() {
    }

    // 添加getter方法
    public String getCity() {
        return city;
    }

    public Float getLat() {
        return lat;
    }

    public Float getLng() {
        return lng;
    }

    public Integer getDepCount() {
        return depCount;
    }

    public Integer getArrCount() {
        return arrCount;
    }
}
