package com.example.aditmail.patani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TampilanInputDataPanen extends AppCompatActivity {

    ImageView input, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_input_data_panen);

        input = (ImageView)findViewById(R.id.imageView_input);
        output = (ImageView)findViewById(R.id.imageView_lihat);

        output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lihat = new Intent (TampilanInputDataPanen.this, TampilanDataPanen.class);
                startActivity(lihat);
            }
        });
    }
}
