package com.example.apppizeria_v02;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText edtNameLogin;
    EditText edtNamePass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociamos los id de los componentes
        edtNameLogin = findViewById(R.id.idEdtNameLogin);
        edtNamePass = findViewById(R.id.idEdtPassLogin);
        btnLogin = findViewById(R.id.idBtnLogin);
    }

    public void onClickBtnLogin(View v)
    {
        //Condiciones del texto introducido en los EditText
        //Nombre de usuario ( ejemplo para el ejercicio ) --> usuario
        //Contraseña----------------------------------------> usuario

        if(edtNameLogin.getText().toString().equalsIgnoreCase("usuario") &&
           edtNamePass.getText().toString().equalsIgnoreCase("usuario"))
        {
            Intent intent = new Intent(getApplicationContext(), ActivityOpcionesPizzeria.class);
            startActivity(intent);
        }
    }
}
