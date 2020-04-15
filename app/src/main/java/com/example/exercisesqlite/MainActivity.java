package com.example.exercisesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "MESSAGE";
    private ListView listView;
    DBHelper mydb;
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

        mydb = new DBHelper(this);
        ArrayList arrayList = mydb.getAllContacts();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView = (ListView) findViewById(R.id.LV);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View arg1, int arg2, long arg3) {
                int id_To_Search = arg2 + 1;

                Bundle dataBundle = new Bundle();
                dataBundle.putInt("id", id_To_Search);

                Intent intent = new Intent(getApplicationContext(), tambah_data.class);
                intent.putExtras(dataBundle);
                startActivity(intent);
            }
        });
    }

    public void pindah() {
        Intent intent = new Intent(MainActivity.this, tambah_data.class);
        startActivity(intent);
    }
}
