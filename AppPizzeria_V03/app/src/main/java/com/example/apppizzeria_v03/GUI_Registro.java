package com.example.apppizzeria_v03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class GUI_Registro extends AppCompatActivity
{

    // Componentes de la GUI
    EditText edtUsuarioGuiRegistro;
    EditText edtEmailGuiRegistro;
    EditText edtPassGuiRegistro;
    Button btnGuiRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gui__registro);
        //Relacionamos los id's con los componentes de la GUI
        edtUsuarioGuiRegistro = findViewById(R.id.idEdtUsuarioGuiRegistro);
        edtEmailGuiRegistro = findViewById(R.id.idEdtEmailGuiRegistro);
        edtPassGuiRegistro = findViewById(R.id.idEdtPassGuiRegistro);
        btnGuiRegistro = findViewById(R.id.idBtnGuiRegistro);
    }

    // Btn GUARDAR
    public void onClickGuardaRegistro(View v)
    {
        //getToast("Entramos !!!");

        String usuario = edtUsuarioGuiRegistro.getText().toString();
        String email = edtEmailGuiRegistro.getText().toString();
        String pass = edtPassGuiRegistro.getText().toString();

        if(camposIsEmpty(usuario, email, pass) &&
                validarEmail(email) && validarPwd(pass))
        {
            // Guardamos los datos en xml SharedPreferences
            SharedPreferences sp = getSharedPreferences(usuario+".RegisterDATA", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("Usuario:", usuario);
            editor.putString("Email:", email);
            editor.putString("Pass:", pass);
            editor.commit();
        }
        else
        {
            getToast("Por favor, compruebe que los campos no estén vacíos.\n" +
                    "Compruebe que su emali y contraseña sean válidos");
        }
    }

    // Método valida campos vacíos
    public boolean camposIsEmpty(String usuario, String email, String pass)
    {
        boolean isEmptyOk = false;

        if(!usuario.equals("") && !email.equals("") && !pass.equals(""))
        {
            isEmptyOk = true;
        }

        return isEmptyOk;
    }

    // Método valid EMAIL
    public boolean validarEmail(String email) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        return pattern.matcher(email).matches();
    }

    // Método para validar CONTRASEÑA
    public boolean validarPwd(String pwd){
        boolean rtn = true;
        int seguidos = 0;
        char ultimo = 0xFF;

        int minuscula = 0;
        int mayuscula = 0;
        int numero = 0;
        int especial = 0;
        boolean espacio = false;
        if(pwd.length() < 8 || pwd.length() > 16) return false; // tamaño
        for(int i=0;i<pwd.length(); i++){
            char c = pwd.charAt(i);
            if(c <= ' ' || c > '~' ){
                rtn = false; //Espacio o fuera de rango
                break;
            }
            if( (c > ' ' && c < '0') || (c >= ':' && c < 'A') || (c >= '[' && c < 'a') || (c >= '{' && c < 127) ){
                especial++;
            }
            if(c >= '0' && c < ':') numero++;
            if(c >= 'A' && c < '[') mayuscula++;
            if(c >= 'a' && c < '{') minuscula++;

            seguidos = (c==ultimo) ? seguidos + 1 : 0;
            if(seguidos >= 2){
                rtn = false; // 3 seguidos
                break;
            }
            ultimo = c;
        }
        rtn = rtn && especial > 0 && numero > 0 && minuscula > 0 && mayuscula > 0;
        return rtn;
    }

    // Método TOAST
    public void getToast(String str)
    {
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
    }
}
