package com.youngheart.controller;

import com.youngheart.domain.Result;
import com.youngheart.domain.vo.flight.ArrVO;
import com.youngheart.service.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/geo")
public class GeoController {
    @Autowired
    private GeoService geoService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<List<ArrVO>> getArrCount(){
        List<ArrVO> data = geoService.getArrCount();
        return Result.ok(data);
    }
}