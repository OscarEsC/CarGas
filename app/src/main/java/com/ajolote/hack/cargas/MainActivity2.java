package com.ajolote.hack.cargas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView tv2 = (TextView) findViewById(R.id.tView2);

        final EditText mnt = (EditText) findViewById(R.id.editText22);
        final Button bt = findViewById(R.id.buttonM2);

        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                //-----Obtener datos del servidor para mostrar mensaje
                tv2.setText("Tu codigo para canjear es: (codigo)");
                Intent intent = new Intent(view.getContext(), FullSplash.class);
                intent.putExtra("variable_string", mnt.getText().toString());
                startActivity(intent);
            }
        });
    }
}