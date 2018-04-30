package com.example.danie.tourguideapp;

public class Event {

    private String eventName;
    private String eventAddress;
    private int eventImageID;

    public String getEventName() {
        return eventName;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public int getEventImageID() {
        return eventImageID;
    }

    public Event(String eventName, String eventAddress, int eventImageID) {

        this.eventName = eventName;
        this.eventAddress = eventAddress;
        this.eventImageID = eventImageID;
    }
}
