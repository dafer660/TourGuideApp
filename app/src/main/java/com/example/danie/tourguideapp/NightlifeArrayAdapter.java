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

public class NightlifeArrayAdapter extends ArrayAdapter<Nightlife>{

    public NightlifeArrayAdapter(@NonNull Context context, ArrayList<Nightlife> nightlife) {
        super(context, 0, nightlife);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        Nightlife nightlife = getItem(position);

        View ListView = convertView;
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.nightlife_textviews, parent, false);
        }

        TextView bName = convertView.findViewById(R.id.nName);
        TextView bAddress = convertView.findViewById(R.id.nAddress);
        ImageView bIcon = convertView.findViewById(R.id.nIcon);

        bName.setText(nightlife.getBarName());
        bAddress.setText(nightlife.getBarAddress());
        bIcon.setImageResource(nightlife.getBarImageID());

        return convertView;
    }
}
