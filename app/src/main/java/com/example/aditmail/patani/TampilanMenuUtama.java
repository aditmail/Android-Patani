package com.example.aditmail.patani;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;

public class TampilanMenuUtama extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ImageView data_lahan, data_panen, data_pupuk, kalkulasi_panen, bantuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_menu_utama);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        data_lahan = (ImageView)findViewById(R.id.imageView_dataLahan);
        data_panen = (ImageView)findViewById(R.id.imageView_dataPanen);
        data_pupuk = (ImageView)findViewById(R.id.imageView_dataPupuk);
        kalkulasi_panen = (ImageView)findViewById(R.id.imageView_kalkulasiPanen);
        bantuan = (ImageView)findViewById(R.id.imageView_help);

        data_lahan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent view_data_lahan = new Intent (TampilanMenuUtama.this, TampilanDataLahan.class);
                startActivity(view_data_lahan);
            }
        });

        data_panen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent view_data_panen = new Intent (TampilanMenuUtama.this, TampilanInputDataPanen.class);
                startActivity(view_data_panen);
            }
        });

        data_pupuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent view_data_pupuk = new Intent (TampilanMenuUtama.this, TampilanInputDataPupuk.class);
                startActivity(view_data_pupuk);
            }
        });

        kalkulasi_panen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent view_kalkulasi_panen = new Intent (TampilanMenuUtama.this, TampilanKalkulasiPanen.class);
                startActivity(view_kalkulasi_panen);
            }
        });

        bantuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent help = new Intent (TampilanMenuUtama.this, TampilanBantuan.class);
                startActivity(help);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if (id == R.id.nav_profil) {
            Intent view_profil = new Intent (TampilanMenuUtama.this, TampilanProfil.class);
            startActivity(view_profil);
        } else if (id == R.id.nav_catatan) {
            Intent catetan = new Intent(TampilanMenuUtama.this, CatatanJurnal.class);
            startActivity(catetan);
        } else if (id == R.id.nav_tanam_apa) {
            Intent tutorial = new Intent(TampilanMenuUtama.this, TampilanTanamApa.class);
            startActivity(tutorial);
        } else if (id == R.id.nav_tutorial) {
            Intent tutorial = new Intent(TampilanMenuUtama.this, TampilanTutorial.class);
            startActivity(tutorial);
        } else if (id == R.id.nav_kritik_saran) {
            Intent view_kritik_saran = new Intent(TampilanMenuUtama.this, TampilanKritikSaran.class);
            startActivity(view_kritik_saran);
        } else if (id == R.id.nav_keluar) {
            Intent log_keluar = new Intent (TampilanMenuUtama.this, TampilanLogin.class);
            startActivity(log_keluar);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
