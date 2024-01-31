package uz.ibrokhimov.quizislamic.ui.main

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.ibrokhimov.quizislamic.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        systemMusic = MediaPlayer.create(this, R.raw.system_music)
        systemMusic!!.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        systemMusic!!.stop()
    }


    companion object {
        private var systemMusic: MediaPlayer? = null

        fun turnOffMusic() {
            systemMusic!!.pause()
        }

        fun turnOnMusic() {
            systemMusic!!.start()
        }

    }

    override fun onPause() {
        super.onPause()
        systemMusic!!.pause()
    }

}