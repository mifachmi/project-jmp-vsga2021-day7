package com.example.vsga_day7;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Aplikasi List View");

        // Construct the data source
        ArrayList<Mahasiswa> arrayOfUsers = new ArrayList<>(DataMahasiswa.getListData());

        // Create the adapter to convert the array to views
        MahasiswaAdapter adapter = new MahasiswaAdapter(this, arrayOfUsers);

        // Attach the adapter to a ListView
        ListView listView = findViewById(R.id.lvListApp);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, "Data dari " + DataMahasiswa.namaMhs[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}