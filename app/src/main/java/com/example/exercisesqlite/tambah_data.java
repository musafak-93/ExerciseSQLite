package com.example.exercisesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        mydb = new DBHelper(this);
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            int Value = extras.getInt("id");

            if (Value>0){
                Cursor rs = mydb.getData(Value);
                id_To_Update = Value;
                rs.moveToFirst();

                String name = rs.getString(rs.getColumnIndex(DBHelper.COLUMN_NAMA));
                String phone = rs.getString(rs.getColumnIndex(DBHelper.COLUMN_PHONE));
                String email = rs.getString(rs.getColumnIndex(DBHelper.COLUMN_EMAIL));
                String alamat = rs.getString(rs.getColumnIndex(DBHelper.COLUMN_ALAMAT));

                if (!rs.isClosed()) {
                    rs.close();
                }

                Button b = (Button) findViewById(R.id.Btn_Save);
                b.setVisibility(View.INVISIBLE);

                etNama.setText((CharSequence)name);
                etNama.setFocusable(false);
                etNama.setClickable(false);

                etNohp.setText((CharSequence)phone);
                etNohp.setFocusable(false);
                etNohp.setClickable(false);

                etEmail.setText((CharSequence)email);
                etEmail.setFocusable(false);
                etEmail.setClickable(false);

                etAlamat.setText((CharSequence)alamat);
                etAlamat.setFocusable(false);
                etAlamat.setClickable(false);
            }
        }
    }
}
