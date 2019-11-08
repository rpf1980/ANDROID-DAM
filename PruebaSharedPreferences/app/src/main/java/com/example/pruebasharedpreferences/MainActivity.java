package com.example.pruebasharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    EditText edtUsuario;
    EditText edtPass;
    Button btnGo;
    Button btnToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUsuario = findViewById(R.id.idEdtNombre);
        edtPass = findViewById(R.id.idEdtPass);
        btnGo = findViewById(R.id.idBtnRegistro);
        btnToLogin = findViewById(R.id.idBtnToLogin);

        btnGo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                SharedPreferences sp = getSharedPreferences("DATA", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("nombre", edtUsuario.getText().toString());
                editor.putString("pass", edtPass.getText().toString());
                editor.commit();
            }
        });

        btnToLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), GUI_LOGIN.class);
                startActivity(i);
            }
        });
    }
}
