package com.example.android.adhitya_1202150103_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class OrderMethod extends AppCompatActivity {

    private RadioGroup order_metod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_method);
        order_metod = (RadioGroup)findViewById(R.id.radiogrup);
    }

    public void Pesan(View view) {
    int order = order_metod.getCheckedRadioButtonId();
        switch (order){
            case R.id.dinein:
                Toast.makeText(this,"You Decide to Dine In", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, DineIn.class)); break;
            case R.id.takeaway:
                Toast.makeText(this,"Your Decide to Take Away", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, TakeAway.class)); break;
            default:break;

        }
    }
}
