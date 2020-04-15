package com.example.exercisesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class tambah_data extends AppCompatActivity {

    int id_To_Update = 0;
    private DBHelper mydb;
    EditText etNama, etNohp, etEmail, etAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_data);

        etNama = (EditText) findViewById(R.id.Et_Nama);
        etNohp = (EditText) findViewById(R.id.Et_Nohp);
        etEmail = (EditText) findViewById(R.id.Et_Email);
        etAlamat = (EditText) findViewById(R.id.Et_Alamat);
    }
}
