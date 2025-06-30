package com.youngheart.controller;

import com.youngheart.domain.vo.market.MarketResult;
import com.youngheart.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/market")
public class MarketController {
    @Autowired
    private MarketService marketService;

    @GetMapping
    public MarketResult market() {
        return marketService.getMarketResult();
    }

}
