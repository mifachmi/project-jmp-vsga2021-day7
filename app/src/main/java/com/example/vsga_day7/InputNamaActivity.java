package com.example.vsga_day7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class InputNamaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_nama);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Aplikasi Input Nama");
    }
}