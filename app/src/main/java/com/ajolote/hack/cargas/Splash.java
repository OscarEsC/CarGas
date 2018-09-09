package com.ajolote.hack.cargas;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //-------Para ver cual layout vamos a mostrar al usuario, la de imagen o la de codigo
        final int checkCode = 0;

        final boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (checkCode == 0) {
                    final Intent intent = new Intent(Splash.this, ProfilActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    //final Intent intentI = new Intent(Splash.this, MainActivity2.class);
                    //startActivity(new Intent(Splash.this, MainActivity2.class));
                    //finish();
                }
                //startActivity(intentI);
                //finish();
            }
        }, 2000);
    }
}
