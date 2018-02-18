package com.example.android.adhitya_1202150103_modul2;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/**
 * Created by Tavs on 18/02/2018.
 */

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nama_menu,harga,no_id;
        private ImageView gambar;

        public ViewHolder(View itemView) {
            super(itemView);
            no_id = (TextView)itemView.findViewById(R.id.no_id);
            nama_menu = (TextView)itemView.findViewById(R.id.nama_menu);
            harga = (TextView)itemView.findViewById(R.id.harga);
            gambar = (ImageView)itemView.findViewById(R.id.gambar);
        }
    }
    private ArrayList<model> listData;
    public adapter(ArrayList<model>list){
        this.listData = list;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.nama_menu.setText(listData.get(position).getNama_menu());
        holder.no_id.setText(""+position);
        holder.harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in","ID")).format(listData.get(position).getHarga()));

        //holder.no_id.setText(""+position);
        //holder.harga.setText(""+ NumberFormat.getCurrencyInstance(new Locale("in","ID")).format(listData.get(position).getHarga()));
        holder.gambar.setImageResource(listData.get(position).getGambar());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String index = holder.no_id.getText().toString();
                Toast.makeText(v.getContext(), "Menu Anda yang dipilih "+listData.get(Integer.parseInt(index)).getNama_menu()+"",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext().getApplicationContext(),DetailMenu.class);
                intent.putExtra("MenuID",index);
                v.getContext().startActivity(intent);

            }

        });
    }

    @Override
    public int getItemCount() {
        return (listData != null) ? listData.size() : 0;
    }


}
