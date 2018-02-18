package com.example.android.adhitya_1202150103_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), OrderMethod.class));
                finish();
            }
        }, 3500); //3500 Yang dimaksud adalah 3,5 detik



    }
}
