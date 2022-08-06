package com.example.tictactoe


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


class SplashScrean : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screan)

        Handler(Looper.getMainLooper()).postDelayed({

               val intent = Intent(this,MainActivity::class.java)
               startActivity(intent)
               finish()

        },3000)
    }
}