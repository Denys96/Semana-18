package com.example.semana_18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nun1 = findViewById<EditText>(R.id.txtnum1)
        val num2 = findViewById<EditText>(R.id.txtnum2)
        val suma = findViewById<Button>(R.id.btnsuma)
        val resta = findViewById<Button>(R.id.btnresta)
        val division = findViewById<Button>(R.id.btndivision)
        val salir = findViewById<Button>(R.id.btnsalir)
        val multiplicacion = findViewById<Button>(R.id.btnmultiplicacion)
        val btnprimero = findViewById<ImageButton>(R.id.btnacercade)


        var resultado: Long? = null
        suma.setOnClickListener {
            if (nun1.text.isNotEmpty() && num2.text.isNotEmpty()) {
                resultado = nun1.text.toString().toLong() + num2.text.toString().toLong()

            } else {
                Toast.makeText(this, "LOS DOS CAMPOS SON OBLIGATORIOS", Toast.LENGTH_SHORT).show()
            }
            val intent = Intent(this@MainActivity, Resultado::class.java)
            var dato:String= resultado.toString()
            val b :Bundle= Bundle()
            b.putString("dt",dato)
            intent.putExtras(b)
            startActivity(intent)
        }

            resta.setOnClickListener {
                if (nun1.text.isNotEmpty() && num2.text.isNotEmpty()) {
                    resultado = nun1.text.toString().toLong() - num2.text.toString().toLong()
                } else {
                    Toast.makeText(this, "LOS DOS CAMPOS SON OBLIGATORIOS", Toast.LENGTH_SHORT)
                        .show()
                }
                val intent = Intent(this@MainActivity, Resultado::class.java)
                var dato:String= resultado.toString()
                val b :Bundle= Bundle()
                b.putString("dt",dato)
                intent.putExtras(b)
                startActivity(intent)
            }
                division.setOnClickListener {
                    if (nun1.text.isNotEmpty() && num2.text.isNotEmpty()) {
                        resultado = nun1.text.toString().toLong() / num2.text.toString().toLong()
                    } else {
                        Toast.makeText(this, "LOS DOS CAMPOS SON OBLIGATORIOS", Toast.LENGTH_SHORT)
                            .show()
                    }
                    val intent = Intent(this@MainActivity, Resultado::class.java)
                    var dato:String= resultado.toString()
                    val b :Bundle= Bundle()
                    b.putString("dt",dato)
                    intent.putExtras(b)
                    startActivity(intent)
                }
                    multiplicacion.setOnClickListener{
                        if (nun1.text.isNotEmpty() && num2.text.isNotEmpty()){
                            resultado =nun1.text.toString().toLong() * num2.text.toString().toLong()
                        }else{
                            Toast.makeText(this, "LOS DOS CAMPOS SON OBLIGATORIOS",Toast.LENGTH_SHORT).show()
                        }
                        val intent = Intent(this@MainActivity, Resultado::class.java)
                        var dato:String= resultado.toString()
                        val b :Bundle= Bundle()
                        b.putString("dt",dato)
                        intent.putExtras(b)
                        startActivity(intent)
        }
        salir.setOnClickListener{
            finish()
        }

        btnprimero.setOnClickListener{
            val acerca= Intent(this, Acercade::class.java)
            startActivity(acerca)
        }
    }
}