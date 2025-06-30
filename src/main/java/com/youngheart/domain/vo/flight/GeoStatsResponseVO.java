package com.youngheart.domain.vo.flight;

import lombok.Data;
import java.util.List;

@Data
public class GeoStatsResponseVO {
    private List<ArrVO> departureStats;    // 起飞航班统计
    private List<LandVO> landingStats;    // 降落航班统计
    private List<FlightVO> routeStats;    // 航线航班统计

    public GeoStatsResponseVO(List<ArrVO> departureStats, List<LandVO> landingStats, List<FlightVO> routeStats) {
        this.departureStats = departureStats;
        this.landingStats = landingStats;
        this.routeStats = routeStats;
    }
    public GeoStatsResponseVO() {}


    public List<ArrVO> getDepartureStats() {
        return departureStats;
    }

    public void setDepartureStats(List<ArrVO> departureStats) {
        this.departureStats = departureStats;
    }

    public List<LandVO> getLandingStats() {
        return landingStats;
    }

    public void setLandingStats(List<LandVO> landingStats) {
        this.landingStats = landingStats;
    }

    public List<FlightVO> getRouteStats() {
        return routeStats;
    }

    public void setRouteStats(List<FlightVO> routeStats) {
        this.routeStats = routeStats;
    }
}