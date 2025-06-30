package com.youngheart.controller;

import com.youngheart.domain.Result;
import com.youngheart.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/geo")
public class GeoController {
    @Autowired
    private GeoService geoService;

    @GetMapping("/depcount")
    public Result depCount() {
        return geoService.depCount();
    }
}
