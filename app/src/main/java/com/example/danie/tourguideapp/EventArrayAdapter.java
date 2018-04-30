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

public class EventArrayAdapter extends ArrayAdapter<Event>{

    public EventArrayAdapter(@NonNull Context context, ArrayList<Event> event) {
        super(context, 0, event);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        Event event = getItem(position);

        View ListView = convertView;
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.event_textviews, parent, false);
        }

        TextView eName = convertView.findViewById(R.id.eName);
        TextView eAddress = convertView.findViewById(R.id.eAddress);
        ImageView eIcon = convertView.findViewById(R.id.eIcon);
//
        eName.setText(event.getEventName());
        eAddress.setText(event.getEventAddress());
        eIcon.setImageResource(event.getEventImageID());

        return convertView;
    }
}
