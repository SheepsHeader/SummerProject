package com.youngheart.controller;

import com.youngheart.domain.Result;
import com.youngheart.domain.vo.flight.GeoStatsResponseVO;
import com.youngheart.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geo")
public class GeoController {
    private final GeoService geoService;

    @Autowired
    public GeoController(GeoService geoService) {
        this.geoService = geoService;
    }

    @GetMapping
    public GeoStatsResponseVO getAllGeoStats() {
        return geoService.getAllGeoStats();
    }
}