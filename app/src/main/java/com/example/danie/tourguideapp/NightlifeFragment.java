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

        nightlifes.add(new Nightlife("Hot Club - Jazz Club", "Praça Alegria 48, 1250-004 Lisboa, Portugal", R.drawable.hot_clube));
        nightlifes.add(new Nightlife("Pastéis de Belém", "R. de Belém 84-92, 1300-085 Lisboa, Portugal", R.drawable.pastel_de_belem));

        NightlifeArrayAdapter nightlifeArrayAdapter = new NightlifeArrayAdapter(this.getContext(), nightlifes);
        listNightlife.setAdapter(nightlifeArrayAdapter);

        return view;
    }
}
