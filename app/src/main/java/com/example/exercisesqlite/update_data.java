package com.example.exercisesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class update_data extends AppCompatActivity {

    //int id_To_Update = 0;
    //private DBHelper mydb;
    //EditText eteditNama, eteditNohp, eteditEmail, eteditAlamat, etid;
    //DBHelper SQLite = new DBHelper(this);
    Button batal,update;
    //String id, name, hp, email, alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        /*eteditNama = (EditText) findViewById(R.id.Et_Editnama);
        eteditNohp = (EditText) findViewById(R.id.Et_Editnohp);
        eteditEmail = (EditText) findViewById(R.id.Et_EditEmail);
        eteditAlamat = (EditText) findViewById(R.id.Et_Alamat);
        update = (Button) findViewById(R.id.Btn_Edit);*/
        batal = findViewById(R.id.Btn_Batal);

         /*id = getIntent().getStringExtra(DBHelper.COLUMN_ID);
         name = getIntent().getStringExtra(DBHelper.COLUMN_NAMA);
         hp = getIntent().getStringExtra(DBHelper.COLUMN_PHONE);
         email = getIntent().getStringExtra(DBHelper.COLUMN_EMAIL);
         alamat = getIntent().getStringExtra(DBHelper.COLUMN_ALAMAT);

         if (id == null || id == ""){
             setTitle("Add Data");
         }else {
             setTitle("Edit Data");
             eteditNama.setText(name);
             eteditNohp.setText(hp);
             eteditEmail.setText(email);
             eteditAlamat.setText(alamat);
         }
         update.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 try {
                     if (eteditNama.getText().toString().equals("")){
                         save();
                     }else {
                         edit();
                     }
                 }catch (Exception e) {
                     Log.e("submit", e.toString());
                 }
             }
         });*/
        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
    /*private void blank(){
        eteditNama.requestFocus();
        eteditNama.setText(null);
        eteditNohp.setText(null);
        eteditEmail.setText(null);
        eteditAlamat.setText(null);
    }

    private void save() {
        if (String.valueOf(eteditNama.getText()).equals(null) || String.valueOf(eteditNama.getText()).equals("") ||
        String.valueOf(eteditNohp.getText()).equals(null) || String.valueOf(eteditNohp.getText()).equals("") ||
        String.valueOf(eteditEmail.getText()).equals(null) || String.valueOf(eteditEmail.getText()).equals("") ||
        String.valueOf(eteditAlamat.getText()).equals(null) || String.valueOf(eteditAlamat.getText()).equals("")){
            Toast.makeText(getApplicationContext(),"lelah", Toast.LENGTH_SHORT).show();
        }else {
            SQLite.insertContact(eteditNama.getText().toString().trim(), eteditNohp.getText().toString().trim(),
                    eteditEmail.getText().toString().trim(), eteditAlamat.getText().toString().trim());
            blank();
            finish();
        }
    }
    private void edit() {
        if (String.valueOf(eteditNama.getText()).equals(null) || String.valueOf(eteditNama.getText()).equals("") ||
                String.valueOf(eteditNohp.getText()).equals(null) || String.valueOf(eteditNohp.getText()).equals("") ||
                String.valueOf(eteditEmail.getText()).equals(null) || String.valueOf(eteditEmail.getText()).equals("") ||
                String.valueOf(eteditAlamat.getText()).equals(null) || String.valueOf(eteditAlamat.getText()).equals("")){
            Toast.makeText(getApplicationContext(),"huft", Toast.LENGTH_SHORT).show();
        }else {
            SQLite.insertContact(eteditNama.getText().toString().trim(), eteditNohp.getText().toString().trim(),
                    eteditEmail.getText().toString().trim(), eteditAlamat.getText().toString().trim());
            blank();
            finish();
        }
    }*/

}
