package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyBikeData[] myBikeData = new MyBikeData[]{
                new MyBikeData("Honda ADV", "30.000.000",R.drawable.honda_adv),
                new MyBikeData("Honda Astrea", "8.000.000",R.drawable.honda_astrea),
                new MyBikeData("Honda Beat", "12.000.000",R.drawable.honda_beat),
                new MyBikeData("Honda CB250 R", "35.000.000",R.drawable.honda_cb250r),
                new MyBikeData("Honda CBR 250RR", "55.000.000",R.drawable.honda_cbr250rr),
                new MyBikeData("Honda CRF 250", "39.000.000",R.drawable.honda_crf250),
                new MyBikeData("Honda PCX", "32.000.000",R.drawable.honda_pcx),
                new MyBikeData("Honda Scoopy", "18.000.000",R.drawable.honda_scoopy),
                new MyBikeData("Honda Sonic", "21.000.000",R.drawable.honda_sonic),
                new MyBikeData("Honda Vario", "18.000.000",R.drawable.honda_vario),


        };

        MyBikeAdapter myBikeAdapter = new MyBikeAdapter(myBikeData, MainActivity.this);
        recyclerView.setAdapter(myBikeAdapter);

    }

}