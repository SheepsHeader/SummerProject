package com.youngheart.mapper;

import com.youngheart.domain.vo.core.DelayVO;
import com.youngheart.domain.vo.core.PrateVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CoreMapper {

    //获取航司的最大和最小的延误信息
    @Select("SELECT name, avg_delay\n" +
            "FROM airline_delay_info\n" +
            "WHERE avg_delay = (SELECT MAX(avg_delay) FROM airline_delay_info)\n" +
            "UNION ALL\n" +
            "SELECT name, avg_delay\n" +
            "FROM airline_delay_info\n" +
            "WHERE avg_delay = (SELECT MIN(avg_delay) FROM airline_delay_info);")
    List<DelayVO> getAirlineDelay();

    //获取机场的最大和最小延误信息
    @Select("SELECT name, avg_delay\n" +
            "FROM airport_delay_info\n" +
            "WHERE avg_delay = (SELECT MAX(avg_delay) FROM airport_delay_info)\n" +
            "UNION ALL\n" +
            "SELECT name, avg_delay\n" +
            "FROM airport_delay_info\n" +
            "WHERE avg_delay = (SELECT MIN(avg_delay) FROM airport_delay_info);")
    List<DelayVO> getAirportDelay();

    //获取线路的最大和最小的延误信息
    @Select("SELECT name, avg_delay\n" +
            "FROM line_delay_info\n" +
            "WHERE avg_delay = (SELECT MAX(avg_delay) FROM line_delay_info)" +
            "UNION ALL\n" +
            "SELECT name, avg_delay\n" +
            "FROM line_delay_info\n" +
            "WHERE avg_delay = (SELECT MIN(avg_delay) FROM line_delay_info)" +
            "Limit 0,2;")
    List<DelayVO> getLineDelay();

    @Select("(SELECT airline AS name, ROUND(AVG(punctuality), 2) AS punctuality\n" +
            " FROM flight_data\n" +
            " GROUP BY airline\n" +
            " ORDER BY punctuality DESC\n" +
            " LIMIT 2)\n" +
            "UNION ALL\n" +
            "(SELECT airline AS name, ROUND(AVG(punctuality), 2) AS punctuality\n" +
            " FROM flight_data\n" +
            " GROUP BY airline\n" +
            " ORDER BY punctuality ASC\n" +
            " LIMIT 2);\n")
    List<PrateVO> getPrate();

}
