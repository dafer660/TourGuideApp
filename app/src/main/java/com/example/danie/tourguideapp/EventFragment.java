package com.example.danie.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_event, container, false);
        ListView listEvent = view.findViewById(R.id.e_list);

        ArrayList<Event> events = new ArrayList<>();

        events.add(new Event("Mercado da Ribeira", "481, Av. 24 de Julho, Lisboa, Portugal", R.drawable.mercado_ribeira));
        events.add(new Event("Santo António", "Anywhere in Lisbon!!", R.drawable.st_antonio_lisboa));

        EventArrayAdapter eventArrayAdapter = new EventArrayAdapter(this.getContext(), events);
        listEvent.setAdapter(eventArrayAdapter);

        return view;
    }
}
