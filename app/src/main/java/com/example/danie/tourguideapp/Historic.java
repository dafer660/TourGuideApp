package com.example.danie.tourguideapp;

public class Historic {

    private String historicName;
    private String historicAddress;

    public String getHistoricName() {
        return historicName;
    }

    public String getHistoricAddress() {
        return historicAddress;
    }

    public int getHistoricImageID() {
        return historicImageID;
    }

    public Historic(String historicName, String historicAddress, int historicImageID) {

        this.historicName = historicName;
        this.historicAddress = historicAddress;
        this.historicImageID = historicImageID;
    }

    private int historicImageID;


}
