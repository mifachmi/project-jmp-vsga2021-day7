package com.example.vsga_day7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Objects;

public class InputNamaActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etInputNama;
    private TextView tvHasilInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Aplikasi Input Nama");

        etInputNama = findViewById(R.id.etInputNama);
        tvHasilInput = findViewById(R.id.tvHasilTampilkan);
        Button btnTampilkan = findViewById(R.id.btnTampilkan);
        btnTampilkan.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    public void tampilkanNama (View v) {
        tvHasilInput.setText("Nama Anda: " + etInputNama.getText());
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnTampilkan) {
            tampilkanNama(v);
        }
    }
}