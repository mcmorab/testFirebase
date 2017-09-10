package com.example.usuario.testfirebase;

/**
 * Created by usuario on 09/09/2017.
 */
public class Locations {

    public String name;
    public Double lat;
    public Double lon;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Locations() {
    }

    public Locations(String name, Double lat, Double lon) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
