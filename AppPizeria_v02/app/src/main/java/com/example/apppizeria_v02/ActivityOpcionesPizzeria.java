package com.example.apppizeria_v02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityOpcionesPizzeria extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones_pizzeria);

        //Recibimos el intent del ActivityLogin
        Intent intent = getIntent();
    }
}
