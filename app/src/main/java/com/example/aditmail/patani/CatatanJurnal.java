package com.example.aditmail.patani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class CatatanJurnal extends AppCompatActivity {

    ImageView input, output;
    ListView panen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catatan_jurnal);

        input = (ImageView)findViewById(R.id.imageView_input);
        output = (ImageView)findViewById(R.id.imageView_lihat);

        output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masukkan = new Intent (CatatanJurnal.this, TampilanDataCatatan.class);
                startActivity(masukkan);
            }
        });
    }
}
