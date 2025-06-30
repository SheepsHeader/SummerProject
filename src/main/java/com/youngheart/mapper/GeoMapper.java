package com.youngheart.mapper;

import com.youngheart.domain.vo.flight.ArrVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GeoMapper {
    @Select("SELECT airport_name as airportName, SUM(flight_count) as flightCount " +
            "FROM airport_dep_num " +
            "GROUP BY airport_name")
    List<ArrVO> getArrCount();
}