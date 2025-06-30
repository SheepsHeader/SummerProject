package com.youngheart.domain.vo.market;

import lombok.Data;

import java.util.List;

@Data
public class MarketResult {
    private List<AirlineCountVO> airlineCountVO;
    private List<CityCountVO> cityCountVO;
    private List<AirportCountVO> airportCountVO;

    public MarketResult(List<AirlineCountVO> airlineVO, List<CityCountVO> cityCountVO, List<AirportCountVO> airportCountVO) {
        this.airlineCountVO = airlineVO;
        this.cityCountVO = cityCountVO;
        this.airportCountVO = airportCountVO;
    }

    public MarketResult() {
    }

    public List<AirlineCountVO> getAirlineVO() {
        return airlineCountVO;
    }

    public void setAirlineVO(List<AirlineCountVO> airlineVO) {
        this.airlineCountVO = airlineVO;
    }

    public List<CityCountVO> getCityCountVO() {
        return cityCountVO;
    }

    public void setCityCountVO(List<CityCountVO> cityCountVO) {
        this.cityCountVO = cityCountVO;
    }

    public List<AirportCountVO> getAirportCountVO() {
        return airportCountVO;
    }

    public void setAirportCountVO(List<AirportCountVO> airportCountVO) {
        this.airportCountVO = airportCountVO;
    }
}
