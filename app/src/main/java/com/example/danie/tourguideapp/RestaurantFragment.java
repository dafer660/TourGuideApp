package com.example.danie.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_restaurant, container, false);
        ListView listRestaurant = view.findViewById(R.id.r_list);

        ArrayList<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(getString(R.string.pateo_do_petisco), getString(R.string.pateo_address), R.drawable.pateo_do_petisco));
        restaurants.add(new Restaurant(getString(R.string.prazeres_da_carne), getString(R.string.prazeres_da_carne_address), R.drawable.os_prazeres_da_carne));

        RestaurantArrayAdapter restaurantArrayAdapter = new RestaurantArrayAdapter(this.getContext(), restaurants);
        listRestaurant.setAdapter(restaurantArrayAdapter);

        return view;
    }
}
