package com.example.aditmail.patani;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TampilanLogin extends AppCompatActivity {

    Button btn_login;
    TextView txt_registrasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_login);

        btn_login = (Button)findViewById(R.id.button_masuk);
        txt_registrasi = (TextView)findViewById(R.id.textView_registrasi);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(TampilanLogin.this, TampilanMenuUtama.class);
                startActivity(login);
                finish();
            }
        });

        txt_registrasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registrasi = new Intent (TampilanLogin.this, TampilanRegistrasi.class);
                startActivity(registrasi);
            }
        });
    }
}
