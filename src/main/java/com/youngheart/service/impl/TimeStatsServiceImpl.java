package com.youngheart.service.impl;

import com.youngheart.domain.vo.time.*;
import com.youngheart.mapper.TimeStatsMapper;
import com.youngheart.service.TimeStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeStatsServiceImpl implements TimeStatsService {

    private final TimeStatsMapper timeStatsMapper;

    @Autowired
    public TimeStatsServiceImpl(TimeStatsMapper timeStatsMapper) {
        this.timeStatsMapper = timeStatsMapper;
    }

    @Override
    public TimeStatsResponseVO getAllTimeStats() {
        return new TimeStatsResponseVO(
                timeStatsMapper.findAllAirportPagerank(),
                timeStatsMapper.findAllFlightTimeSlotStats(),
                timeStatsMapper.findByRoute()
        );
    }
}