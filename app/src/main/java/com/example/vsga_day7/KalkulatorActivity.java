package com.example.vsga_day7;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class KalkulatorActivity extends AppCompatActivity {

    private EditText etBilanganPertama;
    private EditText etBilanganKedua;
    private TextView tvHasil;
    private Double angkaSatu, angkaDua, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Aplikasi Kalkulator");

        etBilanganPertama = findViewById(R.id.etAngkaKesatu);
        etBilanganKedua = findViewById(R.id.etAngkaKedua);
        Button btnPlus = findViewById(R.id.btnTambah);
        Button btnMinus = findViewById(R.id.btnKurang);
        Button btnCross = findViewById(R.id.btnKali);
        Button btnDivider = findViewById(R.id.btnBagi);
        Button btnReset = findViewById(R.id.btnBersihkan);
        tvHasil = findViewById(R.id.tvHasilOperasi);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                int lengthAngka1 = etBilanganPertama.getText().length();
                int lengthAngka2 = etBilanganKedua.getText().length();

                if (lengthAngka1>0 && lengthAngka2>0) {
                    angkaSatu = Double.parseDouble(etBilanganPertama.getText().toString());
                    angkaDua = Double.parseDouble(etBilanganKedua.getText().toString());
                    hasil = angkaSatu + angkaDua;
                    tvHasil.setText(Double.toString(hasil));
                } else {
                    Toast.makeText(KalkulatorActivity.this, "Wajib Masukkan Angka 1 dan 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                int lengthAngka1 = etBilanganPertama.getText().length();
                int lengthAngka2 = etBilanganKedua.getText().length();

                if (lengthAngka1>0 && lengthAngka2>0) {
                    angkaSatu = Double.parseDouble(etBilanganPertama.getText().toString());
                    angkaDua = Double.parseDouble(etBilanganKedua.getText().toString());
                    hasil = angkaSatu - angkaDua;
                    tvHasil.setText(Double.toString(hasil));
                } else {
                    Toast.makeText(KalkulatorActivity.this, "Wajib Masukkan Angka 1 dan 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCross.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                int lengthAngka1 = etBilanganPertama.getText().length();
                int lengthAngka2 = etBilanganKedua.getText().length();

                if (lengthAngka1>0 && lengthAngka2>0) {
                    angkaSatu = Double.parseDouble(etBilanganPertama.getText().toString());
                    angkaDua = Double.parseDouble(etBilanganKedua.getText().toString());
                    hasil = angkaSatu * angkaDua;
                    tvHasil.setText(Double.toString(hasil));
                } else {
                    Toast.makeText(KalkulatorActivity.this, "Wajib Masukkan Angka 1 dan 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnDivider.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                int lengthAngka1 = etBilanganPertama.getText().length();
                int lengthAngka2 = etBilanganKedua.getText().length();

                if (lengthAngka1>0 && lengthAngka2>0) {
                    angkaSatu = Double.parseDouble(etBilanganPertama.getText().toString());
                    angkaDua = Double.parseDouble(etBilanganKedua.getText().toString());
                    hasil = angkaSatu / angkaDua;
                    tvHasil.setText(Double.toString(hasil));
                } else {
                    Toast.makeText(KalkulatorActivity.this, "Wajib Masukkan Angka 1 dan 2", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                etBilanganPertama.setText("");
                etBilanganKedua.setText("");
                tvHasil.setText("0");
                etBilanganPertama.requestFocus();
            }
        });
    }
}