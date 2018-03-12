package com.capgemini.AirlineXYZ.Data;

public class AirplaneModel {

    private String name;
    private String type;
    private long airport_id;

    public AirplaneModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getAirport_id() {
        return airport_id;
    }

    public void setAirport_id(long airport_id) {
        this.airport_id = airport_id;
    }
}
