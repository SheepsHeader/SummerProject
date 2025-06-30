package com.youngheart.service.impl;

import com.youngheart.domain.vo.market.MarketResult;
import com.youngheart.mapper.MarketMapper;
import com.youngheart.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketServiceImpl implements MarketService {
    @Autowired
    private MarketMapper marketMapper;


    @Override
    public MarketResult getMarketResult() {
        MarketResult marketResult = new MarketResult();
        marketResult.setAirlineVO(marketMapper.getAirlineCount());
        marketResult.setCityCountVO(marketMapper.getCityCount());
        marketResult.setAirportCountVO(marketMapper.getAirportCount());
        return marketResult;
    }
}
