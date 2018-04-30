package com.example.danie.tourguideapp;

public class Restaurant {

    private String restaurantName;
    private String restaurantAddress;
    private int restaurantImageID;

    public Restaurant(String restaurantName, String restaurantAddress, int restaurantImageID) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantImageID = restaurantImageID;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public int getRestaurantImageID() {
        return restaurantImageID;
    }
}
