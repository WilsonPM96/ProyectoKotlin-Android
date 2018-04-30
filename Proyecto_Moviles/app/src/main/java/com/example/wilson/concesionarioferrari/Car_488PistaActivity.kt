package com.example.wilson.concesionarioferrari
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.media.MediaPlayer
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.activity_car_488_pista.*


class Car_488PistaActivity : AppCompatActivity() {

    var mp: MediaPlayer = MediaPlayer()
    val uriUrl = "https://488pista.ferrari.com/es"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_488_pista)

        button_img2.setOnClickListener{ view: View ->
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uriUrl))
            startActivity(intent)
        }
        button_sound2.setOnClickListener {view: View ->
            mp = MediaPlayer.create(this,R.raw.ferrari_488_pista)
            mp.start()
        }


}
}
