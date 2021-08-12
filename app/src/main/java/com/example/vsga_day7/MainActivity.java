package com.example.vsga_day7;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAppKalkulator;
    private Button btnAppInputNama;
    private Button btnListView;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        btnAppKalkulator = findViewById(R.id.btnKalkuApp);
        btnAppKalkulator.setOnClickListener(this);

        btnAppInputNama = findViewById(R.id.btnInputApp);
        btnAppInputNama.setOnClickListener(this);

        btnListView = findViewById(R.id.btnListApp);
        btnListView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnKalkuApp) {
            Toast.makeText(this, "Menuju Halaman Kalkulator", Toast.LENGTH_SHORT).show();
            Intent kalkuIntent = new Intent(MainActivity.this, KalkulatorActivity.class);
            startActivity(kalkuIntent);
        }

        if (v.getId() == R.id.btnInputApp) {
            Toast.makeText(this, "Menuju Halaman Input Nama", Toast.LENGTH_SHORT).show();
            Intent inputnameIntent = new Intent(MainActivity.this, InputNamaActivity.class);
            startActivity(inputnameIntent);
        }

        if (v.getId() == R.id.btnListApp) {
            Toast.makeText(this, "Menuju Halaman List View", Toast.LENGTH_SHORT).show();
            Intent listViewIntent = new Intent(MainActivity.this, ListViewActivity.class);
            startActivity(listViewIntent);
        }
    }
}