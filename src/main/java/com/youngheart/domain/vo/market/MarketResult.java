package com.youngheart.domain.vo.market;

import lombok.Data;

import java.util.List;

@Data
public class MarketResult {
    private List<AirlineCountVO> airlineCountVO;
    private List<CityCountVO> cityCountVO;
    private List<AirportCountVO> airportCountVO;

    private List<Top5VO> top5VO;
    private List<PosCountVO> posCountVO;


    public MarketResult(List<AirlineCountVO> airlineCountVO, List<CityCountVO> cityCountVO, List<AirportCountVO> airportCountVO, List<Top5VO> top5VO, List<PosCountVO> posCountVO) {
        this.airlineCountVO = airlineCountVO;
        this.cityCountVO = cityCountVO;
        this.airportCountVO = airportCountVO;
        this.top5VO = top5VO;
        this.posCountVO = posCountVO;
    }

    public MarketResult() {
    }

    public MarketResult(List<AirlineCountVO> airlineCountVO, List<CityCountVO> cityCountVO, List<AirportCountVO> airportCountVO, List<Top5VO> top5VO) {
        this.airlineCountVO = airlineCountVO;
        this.cityCountVO = cityCountVO;
        this.airportCountVO = airportCountVO;
        this.top5VO = top5VO;
    }

    public List<AirlineCountVO> getAirlineCountVO() {
        return airlineCountVO;
    }

    public void setAirlineCountVO(List<AirlineCountVO> airlineCountVO) {
        this.airlineCountVO = airlineCountVO;
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

    public List<Top5VO> getTop5VO() {
        return top5VO;
    }

    public void setTop5VO(List<Top5VO> top5VO) {
        this.top5VO = top5VO;
    }

    public List<PosCountVO> getPosCountVO() {
        return posCountVO;
    }

    public void setPosCountVO(List<PosCountVO> posCountVO) {
        this.posCountVO = posCountVO;
    }
}
