package com.example.vsga_day7;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        Button btnAppKalkulator = findViewById(R.id.btnKalkuApp);
        btnAppKalkulator.setOnClickListener(this);

        Button btnAppInputNama = findViewById(R.id.btnInputApp);
        btnAppInputNama.setOnClickListener(this);

        Button btnListView = findViewById(R.id.btnListApp);
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