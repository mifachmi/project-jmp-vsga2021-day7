package com.example.vsga_day7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;

public class MahasiswaAdapter extends ArrayAdapter<Mahasiswa> {

    public MahasiswaAdapter(@NonNull Context context, ArrayList<Mahasiswa> resource) {
        super(context, 0, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Mahasiswa user = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_row_mahasiswa, parent, false);
        }

        // Lookup view for data population
        TextView tvName = convertView.findViewById(R.id.tv_item_name);
        TextView tvNrp = convertView.findViewById(R.id.tv_item_nrp);
        ImageView ivFoto = convertView.findViewById(R.id.img_item_photo);

        // Populate the data into the template view using the data object
        tvName.setText(user.getName());
        tvNrp.setText(user.getNrp());
        ivFoto.setImageResource(user.getPhoto());

        // Return the completed view to render on screen
        return convertView;
    }
}
