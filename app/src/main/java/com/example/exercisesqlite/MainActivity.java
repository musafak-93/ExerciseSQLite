package com.example.exercisesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    //Membuat variable button
    private FloatingActionButton klik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        klik = findViewById(R.id.fab);

        klik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pindah();
            }
        });
    }

    public void pindah() {
        Intent intent = new Intent(MainActivity.this, tambah_data.class);
        startActivity(intent);
    }
}
