package com.example.aditmail.patani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TampilanKalkulasiPanen extends AppCompatActivity {

    Button lihat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_kalkulasi_panen);

        lihat = (Button)findViewById(R.id.button_lihat);

        lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cek = new Intent (TampilanKalkulasiPanen.this, TampilanHasilKalkulasi.class);
                startActivity(cek);
            }
        });
    }
}
