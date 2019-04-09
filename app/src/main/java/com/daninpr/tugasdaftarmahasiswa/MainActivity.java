package com.daninpr.tugasdaftarmahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{

    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> dataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataSet = new ArrayList<>();
        initDataset();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rvView.setLayoutManager(layoutManager);

        adapter = new RecyclerViewAdapter(this, dataSet);
        rvView.setAdapter(adapter);
    }

    private void initDataset() {
        dataSet.add("Ramdaning Puri P.");
        dataSet.add("Ezar Rachman");
        dataSet.add("Tunjung Senja");
        dataSet.add("Maysa Belinda");
        dataSet.add("Rozak Puri A.");
        dataSet.add("Ferina Bayu");
        dataSet.add("Reza Ananta");
        dataSet.add("Rifky Tuswandi");
        dataSet.add("Eko Patrio");
        dataSet.add("Susilo");
        dataSet.add("Rian Wahyu");
        dataSet.add("Ruba Buntang");
        dataSet.add("Bima Aji");
        dataSet.add("Sela Fitria");
        dataSet.add("Eirda Kurnia");
        dataSet.add("Reksa Agusti");
        dataSet.add("Roilando Ferda");
        dataSet.add("Hayan Ayu");
    }
}
