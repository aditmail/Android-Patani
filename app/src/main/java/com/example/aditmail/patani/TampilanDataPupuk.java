package com.example.aditmail.patani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class TampilanDataPupuk extends AppCompatActivity {

    ImageView input, output;
   // ListView pupuk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_data_pupuk);

        input = (ImageView)findViewById(R.id.imageView_input);
        output = (ImageView)findViewById(R.id.imageView_lihat);

      //  pupuk = (ListView) findViewById(R.id.pupuk_dynamic);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masukan = new Intent (TampilanDataPupuk.this, TampilanInputDataPupuk.class);
                startActivity(masukan);
            }
        });
/*
        pupuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent balik = new Intent (TampilanDataPupuk.this, TampilanInputDataPanen.class);
                startActivity(balik);
            }
        });
        */
    }
}
