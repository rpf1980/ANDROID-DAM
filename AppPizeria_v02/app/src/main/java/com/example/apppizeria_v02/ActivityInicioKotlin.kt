package com.example.apppizeria_v02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_inicio_kotlin.*

class ActivityInicioKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_kotlin)

        //Btn INICIAR SESIÓN
        idBtnSesionInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        //Btn REGISTRARSE
        idBtnRegistrarInicio.setOnClickListener {
            val intent = Intent(this, ActivityRegistro::class.java)
            startActivity(intent)
        }
    }
}
