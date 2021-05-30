package com.example.semana_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Acercade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acercade)

        val btnregresar=findViewById<Button>(R.id.btnregresar2)
        btnregresar.setOnClickListener {
            val principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
        }
    }
}