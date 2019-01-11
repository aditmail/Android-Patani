package com.example.aditmail.patani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class TampilanDataPanen extends AppCompatActivity {

    ImageView input, output;
    ListView panen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_data_panen);

        input = (ImageView)findViewById(R.id.imageView_input);
        output = (ImageView)findViewById(R.id.imageView_lihat);

      //  panen = (ListView) findViewById(R.id.panen_dynamic);

        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masukkan = new Intent (TampilanDataPanen.this, TampilanInputDataPanen.class);
                startActivity(masukkan);
            }
        });
/*
        panen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent input = new Intent (TampilanDataPanen.this, TampilanInputDataPanen.class);
                startActivity(input);
            }
        });
        */
    }
}
