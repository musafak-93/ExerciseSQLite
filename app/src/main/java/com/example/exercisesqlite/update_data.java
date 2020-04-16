package com.example.exercisesqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class update_data extends AppCompatActivity {

    int id_To_Update = 0;
    private DBHelper mydb;
    EditText eteditNama, eteditNohp, eteditEmail, eteditAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data);

        /*eteditNama = (EditText) findViewById(R.id.Et_Editnama);
        eteditNohp = (EditText) findViewById(R.id.Et_Editnohp);
        eteditEmail = (EditText) findViewById(R.id.Et_EditEmail);
        eteditAlamat = (EditText) findViewById(R.id.Et_EditAlamat);

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

                Button b = (Button) findViewById(R.id.Btn_Edit);
                b.setVisibility(View.INVISIBLE);

                eteditNama.setText((CharSequence)name);
                eteditNama.setFocusable(false);
                eteditNama.setClickable(false);

                eteditNohp.setText((CharSequence)phone);
                eteditNohp.setFocusable(false);
                eteditNohp.setClickable(false);

                eteditEmail.setText((CharSequence)email);
                eteditEmail.setFocusable(false);
                eteditEmail.setClickable(false);

                eteditAlamat.setText((CharSequence)alamat);
                eteditAlamat.setFocusable(false);
                eteditAlamat.setClickable(false);
            }
        }*/
    }
}
