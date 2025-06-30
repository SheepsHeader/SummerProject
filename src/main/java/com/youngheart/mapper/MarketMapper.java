package com.youngheart.mapper;

import com.youngheart.domain.vo.market.AirlineCountVO;
import com.youngheart.domain.vo.market.AirportCountVO;
import com.youngheart.domain.vo.market.CityCountVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface MarketMapper {

    @Select("select * from airline_cnt_info")
    List<AirlineCountVO> getAirlineCount();

    @Select("select * from city_cnt_info")
    List<CityCountVO> getCityCount();

    @Select("select * from airport_cnt_info")
    List<AirportCountVO> getAirportCount();
}
