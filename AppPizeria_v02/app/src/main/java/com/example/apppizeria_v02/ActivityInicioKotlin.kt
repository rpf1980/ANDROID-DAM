package com.example.apppizeria_v02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_inicio_kotlin.*
import java.lang.Exception

class ActivityInicioKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_kotlin)

        idBtnRegistroEnInicio.setOnClickListener {

            try
            {
                startActivity(Intent(this@ActivityInicioKotlin, ActivityRegistro::class.java))
            }
            catch (e: Exception)
            {
                Log.e("ERROR: ", e.toString())
            }
        }

        idBtnInicioSesion.setOnClickListener {
            startActivity(Intent(this@ActivityInicioKotlin, MainActivity::class.java))
        }

    }

}
