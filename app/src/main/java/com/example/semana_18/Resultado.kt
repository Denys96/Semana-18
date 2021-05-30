package com.example.semana_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val mensaje = findViewById<TextView>(R.id.txtresultado1)

        var bundle =intent.extras
        if (bundle != null) {
            mensaje.text = bundle.getString("dt")
        }
        val btnregresar=findViewById<Button>(R.id.btnregresar)
        btnregresar.setOnClickListener {
            val principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
        }
    }
}