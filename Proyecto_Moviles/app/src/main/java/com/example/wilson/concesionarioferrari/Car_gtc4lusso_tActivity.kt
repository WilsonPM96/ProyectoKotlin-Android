package com.example.wilson.concesionarioferrari
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_car_488_gtb.*
import android.media.MediaPlayer
import android.content.Intent
import android.net.Uri
import kotlinx.android.synthetic.main.activity_gtc4lusso_t.*


class Car_gtc4lusso_tActivity : AppCompatActivity() {

    var mp: MediaPlayer = MediaPlayer()
    val uriUrl = "http://gtc4lussot.ferrari.com/es/comfort/the-other-side-of-lusso"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gtc4lusso_t)

        button_img6.setOnClickListener{ view: View ->
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(uriUrl))
            startActivity(intent)
        }
        button_sound6.setOnClickListener {view: View ->
            mp = MediaPlayer.create(this,R.raw.ferrari_gtc4_lusso_t)
            mp.start()
        }


}
}
