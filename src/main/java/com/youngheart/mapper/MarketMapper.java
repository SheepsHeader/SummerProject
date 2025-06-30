package com.youngheart.mapper;

import com.youngheart.domain.vo.market.AirlineCountVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface MarketMapper {



    List<AirlineCountVO> getAirlineCount();
    List<AirlineCountVO> getCityCount();
    List<AirlineCountVO> getAirportCount();
}
