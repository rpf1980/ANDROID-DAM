package com.example.pruebasharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GUI_LOGIN extends AppCompatActivity
{
    EditText edtNombre;
    EditText edtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui__login);

        edtNombre = findViewById(R.id.idEdtNombre);
        edtPass = findViewById(R.id.idEdtPass);
        btnLogin = findViewById(R.id.idBtnLogin);



        btnLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                SharedPreferences sp = getSharedPreferences("DATA", Context.MODE_PRIVATE);
                String usu = sp.getString("nombre", "Error data");

                Toast.makeText(getApplicationContext(), usu, Toast.LENGTH_LONG).show();
            }


        });
    }
}
