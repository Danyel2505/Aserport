package com.example.aserport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var tituloText = "Este es el titulo del documento"
    var descripcionText = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnGenerarPdf = findViewById<Button>(R.id.btnCrearPdf)
    }
}