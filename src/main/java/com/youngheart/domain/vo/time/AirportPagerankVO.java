package  com.youngheart.domain.vo.time;

import java.io.Serializable; // Often good practice for VOs

public class AirportPagerankVO implements Serializable {
    private String airport;
    private Double pagerank;

    public AirportPagerankVO() {
        // No-argument constructor is crucial for Jackson
    }

    public AirportPagerankVO(String airport, Double pagerank) {
        this.airport = airport;
        this.pagerank = pagerank;
    }

    // Getters are REQUIRED for serialization
    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public Double getPagerank() {
        return pagerank;
    }

    public void setPagerank(Double pagerank) {
        this.pagerank = pagerank;
    }

    // You might also want to override toString, equals, hashCode
}