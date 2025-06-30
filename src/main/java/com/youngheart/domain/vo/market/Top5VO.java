package com.youngheart.domain.vo.market;


public class Top5VO {
    private String airline;
    private String coverageRate;

    public Top5VO(String airline, String coverage_rate) {
        this.airline = airline;
        this.coverageRate = coverage_rate;
    }

    public Top5VO() {
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getCoverage_rate() {
        return coverageRate;
    }

    public void setCoverage_rate(String coverage_rate) {
        this.coverageRate = coverage_rate;
    }
}
