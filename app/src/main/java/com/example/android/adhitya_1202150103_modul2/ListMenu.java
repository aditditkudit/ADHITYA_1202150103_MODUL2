package com.example.android.adhitya_1202150103_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class ListMenu extends AppCompatActivity {
    private RecyclerView recycle;
    private adapter adapterlistmenu;

    public static ArrayList<model>listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        listMenu = isiMenu();
        recycle = (RecyclerView)findViewById(R.id.recyclerView);
        adapterlistmenu = new adapter(listMenu);
        recycle.setAdapter(adapterlistmenu);
        recycle.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<model> isiMenu() {
        ArrayList<model> isiListMenu = new ArrayList<>();
        isiListMenu.add(new model("Mie Rebus",10000,R.drawable.mie_rebus,"Mie Rebus Pake Toler dan Special Bahan"));
        isiListMenu.add(new model("Mie Goreng",10000,R.drawable.mie_goreng,"Mie Goreng dengan Rasa Kasih Sayang dan Keceriaan"));
        isiListMenu.add(new model("Roti Bakar", 15000, R.drawable.roti_bakar,"Roti Bakar yang siap Menyemangati hari hari mu"));
        isiListMenu.add(new model("JOSU",8000, R.drawable.josu,"Extra Joss dengan susu yang membuat kamu ingin nyusuuu"));
        isiListMenu.add(new model("Kopi Talua", 10000, R.drawable.kopi_talua,"Kopi Talua khas Sumatera Barat yang gurih nyoiii"));
        return isiListMenu;
    }


}
