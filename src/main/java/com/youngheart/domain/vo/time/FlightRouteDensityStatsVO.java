package com.youngheart.domain.vo.time; // Adjust package as needed

import java.io.Serializable; // Good practice for VO classes

public class FlightRouteDensityStatsVO implements Serializable {

    private String route;              // e.g., "齐齐哈尔 -> 青岛"
    private String depCity;            // Departure city
    private String arrCity;            // Arrival city
    private Double flightDensityDaily; // Daily flight density (assuming double for decimal values)
    private Integer airlineCount;      // Number of unique airlines on the route
    private Integer totalFlights;      // Total number of flights on the route
    private Integer coveredDays;       // Number of days covered in the statistics

    // Default constructor (important for many frameworks, e.g., MyBatis, Spring)
    public FlightRouteDensityStatsVO() {
    }

    // All-arguments constructor (optional, but convenient for creating objects)
    public FlightRouteDensityStatsVO(String route, String depCity, String arrCity,
                                     Double flightDensityDaily, Integer airlineCount,
                                     Integer totalFlights, Integer coveredDays) {
        this.route = route;
        this.depCity = depCity;
        this.arrCity = arrCity;
        this.flightDensityDaily = flightDensityDaily;
        this.airlineCount = airlineCount;
        this.totalFlights = totalFlights;
        this.coveredDays = coveredDays;
    }

    // --- Getters and Setters ---

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDepCity() {
        return depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public String getArrCity() {
        return arrCity;
    }

    public void setArrCity(String arrCity) {
        this.arrCity = arrCity;
    }

    public Double getFlightDensityDaily() {
        return flightDensityDaily;
    }

    public void setFlightDensityDaily(Double flightDensityDaily) {
        this.flightDensityDaily = flightDensityDaily;
    }

    public Integer getAirlineCount() {
        return airlineCount;
    }

    public void setAirlineCount(Integer airlineCount) {
        this.airlineCount = airlineCount;
    }

    public Integer getTotalFlights() {
        return totalFlights;
    }

    public void setTotalFlights(Integer totalFlights) {
        this.totalFlights = totalFlights;
    }

    public Integer getCoveredDays() {
        return coveredDays;
    }

    public void setCoveredDays(Integer coveredDays) {
        this.coveredDays = coveredDays;
    }

    @Override
    public String toString() {
        return "FlightRouteDensityStatsVO{" +
                "route='" + route + '\'' +
                ", depCity='" + depCity + '\'' +
                ", arrCity='" + arrCity + '\'' +
                ", flightDensityDaily=" + flightDensityDaily +
                ", airlineCount=" + airlineCount +
                ", totalFlights=" + totalFlights +
                ", coveredDays=" + coveredDays +
                '}';
    }
}