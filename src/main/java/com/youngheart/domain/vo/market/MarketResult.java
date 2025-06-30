package com.youngheart.domain.vo.market;

import lombok.Data;

import java.util.List;

@Data
public class MarketResult {
    private List<AirlineCountVO> airlineVO;
    private List<CityCountVO> cityCountVO;
    private List<AirportCountVO> airportCountVO;
}
