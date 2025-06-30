package com.youngheart.controller;

import com.youngheart.domain.vo.time.TimeStatsResponseVO;
import com.youngheart.service.TimeStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeStatsController {

    private final TimeStatsService timeStatsService;

    @Autowired
    public TimeStatsController(TimeStatsService timeStatsService) {
        this.timeStatsService = timeStatsService;
    }

    @GetMapping
    public TimeStatsResponseVO getAllTimeStats() {
        return timeStatsService.getAllTimeStats();
    }
}