package com.example.apppizzeria_v03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class GUI_Login extends AppCompatActivity
{
    EditText edtUsuarioLogin;
    EditText edtPassLogin;
    Button btnLogin;
    CheckBox checkLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui__login);

        edtUsuarioLogin = findViewById(R.id.idEdtUsuarioLogin);
        edtPassLogin = findViewById(R.id.idEdtPassLogin);
        btnLogin = findViewById(R.id.idBtnLogin);
        checkLogin = findViewById(R.id.idCheckBoxLogin);


    }

    public void onClicBtnLogin(View v)
    {
        String usuario = edtUsuarioLogin.getText().toString();
        String pass = edtPassLogin.getText().toString();

        // **AQUÍ**... estoy probando si accedo a los datos registrados en SharedPrefernces
        SharedPreferences sp = getSharedPreferences("Rodrigo.RegisterData", Context.MODE_PRIVATE);
        getToast(sp.getString("Usuario:", "El dato está vacío"));

        //Comprobamos que el usuario y contraseña estén registrados
        //en File Explorer Device ( data/ data/ .... LOS REGISTROS DE
        //SharedPreferences


    }

    public void getToast(String msg)
    {
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
    }
}
