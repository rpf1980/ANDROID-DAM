package com.example.apppizeria_v02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class ActivityRegistro extends AppCompatActivity
{
    // Variables de CLASE
    EditText edtNombreRegistro;
    EditText edtEmailRegistro;
    EditText edtPassRegistro;
    Button btnRegistro;



    String nombreFicheroSharedPreferences = "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        // Asociamos los id's
        asociaIDs();

        // Recibe Intent de Btn REGISTRARSE en ActivityInicioKotlin
        //Intent intent = getIntent();
    }

    String strNombre = edtNombreRegistro.getText().toString();
    String strEmail = edtEmailRegistro.getText().toString();
    String strPass = edtPassRegistro.getText().toString();

    // Evento btn GUARDAR
    public void onClickBtnNuevoRegistro(View v)
    {
        // ***PROBANDO***

        //saveDataPreferences();
    }

    public void msg(String str)
    {
        Toast toastMessage = Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG);
        toastMessage.show();
    }

    // Función que asocia los id's de los componentes
    public void asociaIDs()
    {
        edtNombreRegistro = findViewById(R.id.idEdtNameRegister);
        edtEmailRegistro = findViewById(R.id.idEdtEmailRegister);
        edtPassRegistro = findViewById(R.id.idEdtPassRegister);
        btnRegistro = findViewById(R.id.idBtnRegister);
    }

    // Función que comprueba si los campos están vacíos
    public boolean textIsEmpty()
    {
        boolean empty = false;

        if(strNombre.isEmpty() &&
           strEmail.isEmpty() &&
           strPass.isEmpty())
        {
            empty = true;
        }

        return empty;
    }

    // Guarda datos en SharedPreferences
    /*public void saveDataPreferences()
    {
        // Instanciamos clase SharedPreferences
        SharedPreferences sp = getSharedPreferences(nombreFicheroSharedPreferences, Context.MODE_PRIVATE);

        // Necesitamos un objeto Edit
        SharedPreferences.Editor editor = sp.edit();

        // Pasamos a escribir en el fichero ( clave: valor )
        editor.putString("Usuario: ", strNombre);
        editor.putString("Email: ", strEmail);
        editor.putString("Contraseña: ", strPass);

        // Por último debemos comitear la escritura
        editor.commit();

        // Si oK... ( mostramos Toast )
        msg(   "Hola" + strNombre + ", gracias por registrarte en la app !!!");
    }

    // Mostrar datos del SharedPreferences
    public void getDataSharedPreferences()
    {
        // Instanciamos de nuevo la Clase
        // Si el archivo no existe creará uno con ese nombre
        SharedPreferences sp = getSharedPreferences(nombreFicheroSharedPreferences, Context.MODE_PRIVATE);

        // Variables para guardar los datos leidos del SharedPreferences
        // Parámetro 1 --> clave
        // Parámetro 2 --> string que muestra si no encuentra la clave en el fichero SharedPreferences
        String usuario = sp.getString("Usuario: ", "El usuario no existe");
        String email = sp.getString("Email: ", "El email no existe");
        String pass = sp.getString("Contraseña: ", "La contraseña no existe");


        msg(usuario + " || " + email + " || " + pass);
    }*/

    // Función que comprueba si el usuario ya está registrado
    /*public boolean datosRegistrados()
    {
        boolean registrados = true;

        // Tenemos que acceder al SharedPreferences para comparar los datos
        // y ver si ya existen ( si es así, el usuario estaría registrado y no puede
        // registrarse de nuevo )

        return registrados;
    }*/

}
