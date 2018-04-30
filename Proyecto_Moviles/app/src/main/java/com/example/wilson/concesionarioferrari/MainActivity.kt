package com.example.wilson.concesionarioferrari

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //ir a segunda actividad por medio del boton
        button_entrar.setOnClickListener { view: View ->
                    irAActividadDos()
                }
    }
    fun irAActividadDos() {
        val intent = Intent(this, SecondaryActivity::class.java)
        startActivity(intent)
    }
}
