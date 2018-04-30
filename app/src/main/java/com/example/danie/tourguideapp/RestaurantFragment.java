package com.example.danie.tourguideapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        ListView listRestaurant = view.findViewById(R.id.r_list);

        ArrayList<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant("Pateo do Petisco", "Tv. Amoreiras 5, 2750-392 Cascais, Portugal", R.drawable.pateo_do_petisco));
        restaurants.add(new Restaurant("Os Prazeres da Carne", "Avenida Nossa Senhora Cabo Quinta 101, 2750-374 Cascais, Portugal", R.drawable.os_prazeres_da_carne));

        RestaurantArrayAdapter restaurantArrayAdapter = new RestaurantArrayAdapter(this.getContext(), restaurants);
        listRestaurant.setAdapter(restaurantArrayAdapter);

        return view;
    }
}
