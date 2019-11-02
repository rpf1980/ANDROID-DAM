package com.example.apppizeria_v02;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText edtNameLogin;
    EditText edtNamePass;
    Button btnLogin;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociamos los id de los componentes
        edtNameLogin = findViewById(R.id.idEdtNameLogin);
        edtNamePass = findViewById(R.id.idEdtPassLogin);
        btnLogin = findViewById(R.id.idBtnLogin);
        checkBox = findViewById(R.id.idCheckBox);
    }

    // LOGIN
    public void onClickBtnLogin(View v)
    {
        //Condiciones del texto introducido en los EditText
        //Nombre de usuario ( ejemplo para el ejercicio ) --> usuario
        //Contraseña----------------------------------------> usuario
        String usuario = edtNameLogin.getText().toString();
        String pass = edtNamePass.getText().toString();

        // Recibimos el Intent de Inicio (Kotlin)
        Intent initIntent = getIntent();

        if(usuario.equalsIgnoreCase("1") &&
                pass.equalsIgnoreCase("1"))
        {
            Intent intent = new Intent(getApplicationContext(), ActivityOpcionesPizzeria.class);
            startActivity(intent);
        }

        // CheckBox
        if(checkBox.isChecked())
        {
            // SharePreferences
            SharedPreferences sp = getSharedPreferences( usuario + pass, MODE_PRIVATE);

            SharedPreferences.Editor editor = sp.edit();
            //editor.putString( usuario + pass, e)
        }
    }
}
