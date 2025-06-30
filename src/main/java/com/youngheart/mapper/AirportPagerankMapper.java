package com.youngheart.mapper;

import com.youngheart.domain.vo.time.AirportPagerankVO;
import com.youngheart.domain.vo.time.FlightRouteDensityStatsVO;
import com.youngheart.domain.vo.time.FlightTimeSlotStatsVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AirportPagerankMapper {

    /**
     * Retrieves all airport pagerank statistics, ordered by pagerank in descending order.
     * @return A list of AirportPagerankVO objects.
     */
    @Select("SELECT airport, pagerank FROM airport_pagerank_stats_native ORDER BY pagerank DESC")
    List<AirportPagerankVO> findAllAirportPagerank();
    @Select("SELECT time_slot AS timeSlot, airline, COUNT(*) AS flightCount " +
            "FROM flight_time_slot_stats " +
            "GROUP BY time_slot, airline")
    List<FlightTimeSlotStatsVO> findAllFlightTimeSlotStats();
    // No need for count here if not using pagination wrapper
    @Select("SELECT route, dep_city AS depCity, arr_city AS arrCity, " +
            "flight_density_daily AS flightDensityDaily, " +
            "airline_count AS airlineCount, total_flights AS totalFlights, " +
            "covered_days AS coveredDays " +
            "FROM flight_route_density_stats " )
    List<FlightRouteDensityStatsVO> findByRoute();
}