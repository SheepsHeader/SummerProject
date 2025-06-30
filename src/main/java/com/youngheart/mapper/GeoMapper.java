package com.youngheart.mapper;

import com.youngheart.domain.vo.flight.ArrVO;
import com.youngheart.domain.vo.flight.FlightVO;
import com.youngheart.domain.vo.flight.LandVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GeoMapper {
    @Select("SELECT airport_name as airportName, SUM(flight_count) as flightCount " +
            "FROM airport_dep_num " +
            "GROUP BY airport_name")
    List<ArrVO> getArrCount();
    @Select("SELECT airport_name as airportName, SUM(flight_count) as flightCount " +
            "FROM airport_landing_num " +
            "GROUP BY airport_name")
    List<LandVO> getLandCount();
    @Select("select  dep_city as depCity,arr_city as arrCity ,flight_count as flightCount from route_flight_num order by flight_count desc ")
    List<FlightVO> getFlightCount();
}