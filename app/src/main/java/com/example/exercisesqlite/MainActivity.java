package com.example.exercisesqlite;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.security.Key;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

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




        //Database SQLite
        mydb = new DBHelper(this);
        ArrayList arrayList = mydb.getAllContacts();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);

        listView = (ListView) findViewById(R.id.LV);
        registerForContextMenu(listView);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int id_To_Search = arg2 + 1;

                Bundle dataBundle = new Bundle();
                dataBundle.putInt("id", id_To_Search);

                Intent intent = new Intent(getApplicationContext(), tambah_data.class);
                intent.putExtras(dataBundle);
                startActivity(intent);
            }
        });
    }


   public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.popup, menu);
    }

    //Event jika pilihan dalam menu diklik
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Edit:
                next();
                return true;
            case R.id.Hapus:
                showDialog();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

    private void showDialog() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);

        // set pesan dari dialog
        alertDialogBuilder
                .setMessage("Apakah Anda Yakin Ingin Menghapus Data?")
                .setCancelable(false)
                .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        Toast.makeText(MainActivity.this, "Data Berhasil Terhapus", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // jika tombol ini diklik, akan menutup dialog
                        // dan tidak terjadi apa2
                        dialog.cancel();
                    }
                });
        // membuat alert dialog dari builder
        AlertDialog alertDialog = alertDialogBuilder.create();
        // menampilkan alert dialog
        alertDialog.show();
    }

    public boolean onKeyDown(int keycode, KeyEvent event) {
        if (keycode == KeyEvent.KEYCODE_BACK){
            moveTaskToBack(true);
        }
        return super.onKeyDown(keycode, event);
    }



    public void pindah() {
        Intent intent = new Intent(MainActivity.this, tambah_data.class);
        startActivity(intent);
    }

    public void next() {
        Intent intent = new Intent(MainActivity.this, update_data.class);
        startActivity(intent);
    }
}
