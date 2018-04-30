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

        historics.add(new Historic("Almeida", "R. do Arco 13, 6350-106 Almeida, Portugal", R.drawable.almeida));
        historics.add(new Historic("Bairro Alto", "Bairro Alto de São Roque, Lisboa, Portugal", R.drawable.bairro_alto));
        historics.add(new Historic("Sé de Lisboa", "Largo da Sé, 1100-585 Lisboa, Portugal", R.drawable.se_lisboa));

        HistoricArrayAdapter historicArrayAdapter = new HistoricArrayAdapter(this.getContext(), historics);
        listHistoric.setAdapter(historicArrayAdapter);

        return view;
    }
}
