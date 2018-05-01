package com.example.danie.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_historical, container, false);
        ListView listHistoric = view.findViewById(R.id.h_list);

        ArrayList<Historic> historics = new ArrayList<>();

        historics.add(new Historic(getString(R.string.almeida), getString(R.string.almeida_address), R.drawable.almeida));
        historics.add(new Historic(getString(R.string.bairro_alto), getString(R.string.bairro_alto_address), R.drawable.bairro_alto));
        historics.add(new Historic(getString(R.string.se_lisboa), getString(R.string.se_lisboa_address), R.drawable.se_lisboa));

        HistoricArrayAdapter historicArrayAdapter = new HistoricArrayAdapter(this.getContext(), historics);
        listHistoric.setAdapter(historicArrayAdapter);

        return view;
    }
}
