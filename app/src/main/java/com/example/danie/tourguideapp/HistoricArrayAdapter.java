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

public class HistoricArrayAdapter extends ArrayAdapter<Historic>{

    public HistoricArrayAdapter(@NonNull Context context, ArrayList<Historic> historic) {
        super(context, 0, historic);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        Historic historic = getItem(position);

        View ListView = convertView;
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.historic_textviews, parent, false);
        }

        TextView hName = convertView.findViewById(R.id.hName);
        TextView hAddress = convertView.findViewById(R.id.hAddress);
        ImageView hIcon = convertView.findViewById(R.id.hIcon);

        hName.setText(historic.getHistoricName());
        hAddress.setText(historic.getHistoricAddress());
        hIcon.setImageResource(historic.getHistoricImageID());

        return convertView;
    }
}
