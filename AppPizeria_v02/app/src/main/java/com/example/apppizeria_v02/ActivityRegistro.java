package com.example.apppizeria_v02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityRegistro extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //Recibe Intent de Btn REGISTRARSE en ActivityInicioKotlin
        Intent intent = getIntent();
    }
}
