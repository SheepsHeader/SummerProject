package com.youngheart.mapper;

import com.youngheart.domain.vo.market.*;
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

    @Select("SELECT\n" +
            "    airline,\n" +
            "    ROUND((COUNT(DISTINCT route) / (SELECT COUNT(DISTINCT route) FROM line_airline_info)) * 100,2) AS coverage_rate\n" +
            "FROM\n" +
            "    line_airline_info\n" +
            "GROUP BY\n" +
            "    airline\n" +
            "ORDER BY\n" +
            "    coverage_rate DESC\n" +
            "LIMIT 0,5;")
    List<Top5VO> getTop5();

    List<PosCountVO> getPosCount();

}
