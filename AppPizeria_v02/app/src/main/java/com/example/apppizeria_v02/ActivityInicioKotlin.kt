package com.example.apppizeria_v02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import kotlinx.android.synthetic.main.activity_inicio_kotlin.*

class ActivityInicioKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_kotlin)

        idBtnRegistroEnInicio.setOnClickListener {
            startActivity(Intent(this@ActivityInicioKotlin, ActivityRegistro::class.java))
        }

    }

}
