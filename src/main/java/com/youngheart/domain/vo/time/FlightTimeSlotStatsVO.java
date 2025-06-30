package com.youngheart.domain.vo.time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; // Good practice to include for deserialization

// Lombok annotation to generate a no-argument constructor
public class FlightTimeSlotStatsVO {
    private String timeSlot;    // Corresponds to the 'time_slot' column (e.g., "00:00 - 01:59")
    private String airline;     // Corresponds to the 'airline' column
    private Integer flightCount; // Corresponds to the 'flight_count' column

    public FlightTimeSlotStatsVO(String timeSlot, String airline, Integer flightCount) {
        this.timeSlot = timeSlot;
        this.airline = airline;
        this.flightCount = flightCount;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Integer getFlightCount() {
        return flightCount;
    }

    public void setFlightCount(Integer flightCount) {
        this.flightCount = flightCount;
    }
}
