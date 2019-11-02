package com.example.apppizeria_v02;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityOpcionesPizzeria extends AppCompatActivity
{
    Button btnWeb;
    Button btnPedido;
    Button btnConfiguracion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_pizzeria);

        //Instanciamos los componentes
        btnWeb = findViewById(R.id.idBtnWeb);
        btnPedido = findViewById(R.id.idBtnPedido);
        btnConfiguracion = findViewById(R.id.idBtnConfiguracion);

        //Lógica para el botón de ir hacia atrás del nav superior
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Recibimos el intent del ActivityLogin
        Intent intent = getIntent();
    }

    //Evento btn WEB
    public void onClickWeb(View v)
    {
        Uri uri= Uri.parse("https://www.telepizza.es");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    //Evento btn PEDIDO
    public void onClickPedido(View v)
    {

    }
}
