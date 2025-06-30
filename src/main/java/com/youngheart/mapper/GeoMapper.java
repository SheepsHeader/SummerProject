package com.youngheart.mapper;

import com.youngheart.domain.vo.geo.FlightCountVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface GeoMapper {
    @Select("SELECT dep_city as depCity, COUNT(flight_no) as flightCount " +
            "FROM flight_data " +
            "GROUP BY dep_city")
    List<FlightCountVO> countFlightsByDepartureCity();
}