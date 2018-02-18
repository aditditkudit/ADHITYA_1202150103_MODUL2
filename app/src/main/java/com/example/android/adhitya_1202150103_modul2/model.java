package com.example.android.adhitya_1202150103_modul2;

/**
 * Created by Tavs on 18/02/2018.
 */

public class model {
    private String nama_menu;
    private int harga;
    private int gambar;
    private String deskripsi;

    public model(String nama_menu, int harga, int gambar, String deskripsi){
        this.nama_menu = nama_menu;
        this.harga = harga;
        this.gambar = gambar;
        this.deskripsi = deskripsi;
    }

    public String getNama_menu(){
        return nama_menu;
    }

    public int getHarga(){
        return harga;
    }

    public int getGambar() {
        return gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
