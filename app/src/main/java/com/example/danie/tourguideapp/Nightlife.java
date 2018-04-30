package com.example.danie.tourguideapp;

public class Nightlife {

    private String barName;
    private String barAddress;
    private int barImageID;

    public String getBarName() {
        return barName;
    }

    public String getBarAddress() {
        return barAddress;
    }

    public int getBarImageID() {
        return barImageID;
    }

    public Nightlife(String barName, String barAddress, int barImageID) {

        this.barName = barName;
        this.barAddress = barAddress;
        this.barImageID = barImageID;
    }
}
