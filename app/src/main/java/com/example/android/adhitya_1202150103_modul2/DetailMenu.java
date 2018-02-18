package com.example.android.adhitya_1202150103_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class DetailMenu extends AppCompatActivity {

    private ArrayList<model>menu;
    private String menu_id;
    private TextView nama_menu, harga, deskripsi;
    private ImageView gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        nama_menu = (TextView)findViewById(R.id.lbldetailnamaMenu);
        harga = (TextView)findViewById(R.id.lbldetailHarga);
        deskripsi = (TextView)findViewById(R.id.lbldetailDeskripsi);
        gambar = (ImageView) findViewById(R.id.lbldetailGambar);

        menu = ListMenu.listMenu;
        Intent intent = getIntent();
        menu_id = intent.getStringExtra("MenuID");
        model makanan = menu.get(Integer.parseInt(menu_id));
        nama_menu.setText(makanan.getNama_menu());
        setTitle(makanan.getNama_menu());
        harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in","ID")).format(makanan.getHarga()));
        deskripsi.setText(makanan.getDeskripsi());
        gambar.setImageResource(makanan.getGambar());
    }
}
