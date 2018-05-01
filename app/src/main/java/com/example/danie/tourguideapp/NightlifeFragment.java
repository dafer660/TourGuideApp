package com.example.danie.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NightlifeFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nightlife, container, false);
        ListView listNightlife = view.findViewById(R.id.n_list);

        ArrayList<Nightlife> nightlifes = new ArrayList<>();

        nightlifes.add(new Nightlife(getString(R.string.hot_club), getString(R.string.hot_club_address), R.drawable.hot_clube));
        nightlifes.add(new Nightlife(getString(R.string.pasteis_belem), getString(R.string.pasteis_belem_address), R.drawable.pastel_de_belem));

        NightlifeArrayAdapter nightlifeArrayAdapter = new NightlifeArrayAdapter(this.getContext(), nightlifes);
        listNightlife.setAdapter(nightlifeArrayAdapter);

        return view;
    }
}
