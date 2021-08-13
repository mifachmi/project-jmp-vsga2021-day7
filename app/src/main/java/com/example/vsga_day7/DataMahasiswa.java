package com.example.vsga_day7;

import java.util.ArrayList;

public class DataMahasiswa {
    public static String[] namaMhs = {
        "Florean Haya Soraya Azalia Erda",
        "Muhammad Irsyadul Ibad",
        "Muhammad Yusuf Baharsyah",
        "Faza Ghulam Ahmad",
        "Mahira Ardelia Reswari",
        "Nurhidayah",
        "Muhammad Ridlo",
        "Fatih Khoiri",
        "Fachmi Dimas Ardhana",
        "Galih Tegar Febrianto",
        "Rheza Dewangga Rendragraha",
        "Caesar Jalu Ananta",
        "Wahyu Primayasa",
        "Rafi Denandra",
        "Himma Filangga Sutopo",
        "Muhammad Rifki Yuda Pratama",
        "Muhammad Oktavian Fajar Rojaby",
        "Aisyah Maulidiyah",
        "Ketut Gede Bagus Putra Wirawan",
        "Muhammad Iqbal",
        "Ardy Putra Utama",
        "Evita Dwi Octaviani Putri",
        "Muhammad Bima Aria Laksana",
        "Erlangga Aditya"
    };

    public static String[] nrpMhs = {
        "2110191031",
        "2110191032",
        "2110191034",
        "2110191035",
        "2110191036",
        "2110191037",
        "2110191040",
        "2110191041",
        "2110191042",
        "2110191043",
        "2110191044",
        "2110191045",
        "2110191046",
        "2110191048",
        "2110191049",
        "2110191050",
        "2110191051",
        "2110191052",
        "2110191054",
        "2110191055",
        "2110191056",
        "2110191057",
        "2110191059",
        "2110191060",
    };

    public static int[] fotoMhs = {
        R.drawable.flo,
        R.drawable.irsyad,
        R.drawable.yusuf,
        R.drawable.faza,
        R.drawable.mahira,
        R.drawable.nurhidayah,
        R.drawable.ridlo,
        R.drawable.fatih,
        R.drawable.fachmi,
        R.drawable.galih,
        R.drawable.rheza,
        R.drawable.caesar,
        R.drawable.wahyu,
        R.drawable.rafi,
        R.drawable.himma,
        R.drawable.rifki,
        R.drawable.aby,
        R.drawable.aisyah,
        R.drawable.bagus,
        R.drawable.iqbal,
        R.drawable.ardy,
        R.drawable.evita,
        R.drawable.bima,
        R.drawable.erlangga
    };

    static ArrayList<Mahasiswa> getListData() {
        ArrayList<Mahasiswa> list = new ArrayList<>();
        for (int position = 0; position < namaMhs.length; position++) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setName(namaMhs[position]);
            mhs.setNrp(nrpMhs[position]);
            mhs.setPhoto(fotoMhs[position]);
            list.add(mhs);
        }
        return list;
    }
}
