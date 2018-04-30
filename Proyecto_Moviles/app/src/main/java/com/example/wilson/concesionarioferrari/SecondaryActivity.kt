package com.example.wilson.concesionarioferrari

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_secondary.*

class SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        imageButton_gtb.setOnClickListener{view: View ->
            irGtb()
        }

        imageButton_pista.setOnClickListener{view: View ->
            irPista()
        }

        imageButton_812super.setOnClickListener{view: View ->
            ir812()
        }

        imageButton_laferrari.setOnClickListener{view: View ->
            irlaferrari()
        }

        imageButton_gtc4lusso.setOnClickListener{view: View ->
            irgtc4lusso()
        }

        imageButton_gtc4lussot.setOnClickListener{view: View ->
            irgtc4lussot()
        }

        imageButton_spider.setOnClickListener{view: View ->
            irSpider()
        }
    }

    fun irGtb() {
        val intent = Intent(this, Car_488GTBActivity::class.java)
        startActivity(intent)
    }
    fun irPista(){
        val intent = Intent(this, Car_488PistaActivity::class.java)
        startActivity(intent)
    }

    fun ir812(){
        val intent = Intent(this, Car_812SuperFastActivity::class.java)
        startActivity(intent)
    }

    fun irlaferrari(){
        val intent = Intent(this, Car_Laferrari_ApertaActivity::class.java)
        startActivity(intent)
    }

    fun irgtc4lusso(){
        val intent = Intent(this, Car_gtc4lussoActivity::class.java)
        startActivity(intent)
    }

    fun irgtc4lussot(){
        val intent = Intent(this, Car_gtc4lusso_tActivity::class.java)
        startActivity(intent)
    }

    fun irSpider(){
        val intent = Intent(this, Car_488SpiderActivity::class.java)
        startActivity(intent)
    }
}
