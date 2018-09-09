package com.ajolote.hack.cargas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;

import com.craftman.cardform.Card;
import com.craftman.cardform.CardForm;
import com.craftman.cardform.OnPayBtnClickListner;
//import com.braintreepayments.cardform.view.CardForm;

public class FullSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_splash);

        CardForm cardFrom= (CardForm)findViewById(R.id.card_form);
        TextView txtDes=(TextView)findViewById(R.id.payment_amount);
        Button btnPay = (Button)findViewById(R.id.btn_pay);

        String valor = getIntent().getExtras().getString("variable_string");

        txtDes.setText(valor);
        btnPay.setText(String.format("Pagar $%s", txtDes.getText()));

        cardFrom.setPayBtnClickListner(new OnPayBtnClickListner() {
            @Override
            public void onClick(Card card) {
                Toast.makeText(FullSplash.this,"Tarjeta valida, Pago realizado",Toast.LENGTH_SHORT).show();


            }

        })


        ;

        /*
        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("Venta");
        dialogo1.setMessage("Se ha invertido %s pesos de gasolina", valor);
        dialogo1.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                aceptar();
            }
        }); */

    }
}