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



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText mnt = (EditText) findViewById(R.id.editText2);
        final Button bt = findViewById(R.id.buttonM);

        bt.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){

                Intent intent = new Intent(view.getContext(), FullSplash.class);
                intent.putExtra("variable_string", mnt.getText().toString());
                startActivity(intent);
            }
        });
    }
}
