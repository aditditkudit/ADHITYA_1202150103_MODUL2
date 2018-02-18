package com.example.android.adhitya_1202150103_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DineIn extends AppCompatActivity  {
    private Spinner no_meja;
    private TextView nama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);
        nama = (TextView) findViewById(R.id.field_name);
        //Create Spinner
        no_meja = (Spinner)findViewById(R.id.label_spinner);
        ArrayList<String> list = datameja();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,list);
        no_meja.setAdapter(adapter);

    }

    public ArrayList<String> datameja() {
        ArrayList<String>no = new ArrayList<>();
            for (int i=1;i<6;i++){
            no.add("Meja "+i);
        }
        return no;

    }


    public void pesanDinein(View view) {
        String no_mejaa = String.valueOf(no_meja.getSelectedItem());
        Toast.makeText(getApplicationContext(),no_mejaa+" "+
                "Atas Nama "+nama.getText().toString(),Toast.LENGTH_SHORT).show();
        startActivity(new Intent(DineIn.this,ListMenu.class));
    }
}
