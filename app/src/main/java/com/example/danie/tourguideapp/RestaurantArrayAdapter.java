package com.example.danie.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantArrayAdapter extends ArrayAdapter<Restaurant>{

    public RestaurantArrayAdapter(@NonNull Context context, ArrayList<Restaurant> restaurant) {
        super(context, 0, restaurant);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        Restaurant restaurant = getItem(position);

        View ListView = convertView;
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.restaurant_textviews, parent, false);
        }

        TextView rName = convertView.findViewById(R.id.rName);
        TextView rAddress = convertView.findViewById(R.id.rAddress);
        ImageView rIcon = convertView.findViewById(R.id.rIcon);

        rName.setText(restaurant.getRestaurantName());
        rAddress.setText(restaurant.getRestaurantAddress());
        rIcon.setImageResource(restaurant.getRestaurantImageID());

        return convertView;
    }
}
