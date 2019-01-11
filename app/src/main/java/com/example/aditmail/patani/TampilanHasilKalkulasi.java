package com.example.aditmail.patani;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class TampilanHasilKalkulasi extends AppCompatActivity {

    ImageView pupuk_close, pupuk_open, panen_close, panen_open;
    ListView pupuk, panen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_hasil_kalkulasi);

        pupuk_close = (ImageView)findViewById(R.id.imageView_pupuk_close);
        panen_close = (ImageView)findViewById(R.id.imageView_panen_close);
        pupuk_open = (ImageView)findViewById(R.id.imageView_pupuk_open);
        panen_open = (ImageView)findViewById(R.id.imageView_panen_open);
        pupuk = (ListView)findViewById(R.id.pupuk_dynamic);
        panen= (ListView) findViewById(R.id.panen_dynamic);

        pupuk_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pupuk_close.setVisibility(View.GONE);
                pupuk_open.setVisibility(View.VISIBLE);
                pupuk.setVisibility(View.VISIBLE);
            }
        });

        panen_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panen_close.setVisibility(View.GONE);
                panen_open.setVisibility(View.VISIBLE);
                panen.setVisibility(View.VISIBLE);
            }
        });

        pupuk_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pupuk_open.setVisibility(View.GONE);
                pupuk_close.setVisibility(View.VISIBLE);
                pupuk.setVisibility(View.GONE);
            }
        });

        panen_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panen_open.setVisibility(View.GONE);
                panen_close.setVisibility(View.VISIBLE);
                panen.setVisibility(View.GONE);
            }
        });
    }
}
