package com.example.apppizeria_v02;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
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
        String dataPreferencesLogin = ""; // Nombre del fichero para almacenar datos SharedPreferences



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
            SharedPreferences sp = getSharedPreferences( dataPreferencesLogin, Context.MODE_PRIVATE);

            // Declaramos un editor ( Objeto Editor )
            SharedPreferences.Editor editor = sp.edit();

            // ***Validamos los campos ( no pueden estar vacíos )***

            // Guardamos los datos
            editor.putString("Usuario: ", usuario);
            editor.putString("Contraseña: ", pass);

            // Debemos hacer un commit y listo
            editor.commit();

            // ***Mostrar con Toast la inserción correcta de los datos***
        }
    }
}
