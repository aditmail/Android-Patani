package com.example.aditmail.patani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class TampilanProfil extends AppCompatActivity {

    Button update;
    Spinner provinsi, DKI, JABAR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_profil);

        update = (Button)findViewById(R.id.button_Update);
        provinsi = (Spinner)findViewById(R.id.spinner_Provinsi);
        DKI = (Spinner)findViewById(R.id.spinner_DKI);
        JABAR = (Spinner)findViewById(R.id.spinner_JABAR);

        provinsi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (provinsi.getSelectedItem().equals("DKI Jakarta")) {
                    DKI.setVisibility(View.VISIBLE);
                    JABAR.setVisibility(View.GONE);
                } else {
                    JABAR.setVisibility(View.VISIBLE);
                    DKI.setVisibility(View.GONE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
