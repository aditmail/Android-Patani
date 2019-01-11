package com.example.aditmail.patani;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class TampilanTanamApa extends AppCompatActivity {

    Button btnTanamApa;
    TextView txt_Status;
    ListView listView_tanamApa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_tanam_apa);

        btnTanamApa = (Button)findViewById(R.id.button_CekTanamApa);
        txt_Status = (TextView)findViewById(R.id.textView_Keterangan);
        listView_tanamApa = (ListView)findViewById(R.id.tanam_apa_dynamic);

        btnTanamApa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_Status.setVisibility(View.VISIBLE);
                listView_tanamApa.setVisibility(View.VISIBLE);
            }
        });
    }
}
