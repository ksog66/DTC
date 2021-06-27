package com.example.delhitechnicalcampus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.delhitechnicalcampus.LiquidDisplay.OnBoardingActivity
import java.util.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Timer().schedule(object : TimerTask(){
            override fun run() {
                val intent = Intent(this@SplashScreen,OnBoardingActivity::class.java)
                startActivity(intent)
                finish()
            }
        } ,2000L )
    }
}