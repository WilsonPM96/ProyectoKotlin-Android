package com.example.wilson.concesionarioferrari
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_car_488_gtb.*
import android.media.MediaPlayer
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.activity_car_812_superfast.*


class Car_812SuperFastActivity : AppCompatActivity() {

    var mp: MediaPlayer = MediaPlayer()
    val uriUrl = "https://auto.ferrari.com/es_ES/automoviles/gama/812-superfast/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_812_superfast)

        button_img4.setOnClickListener{ view: View ->
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uriUrl))
            startActivity(intent)
        }
        button_sound4.setOnClickListener {view: View ->
            mp = MediaPlayer.create(this,R.raw.ferrari_812)
            mp.start()
        }


}
}
