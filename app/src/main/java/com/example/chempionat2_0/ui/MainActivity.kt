package com.example.chempionat2_0.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chempionat2_0.R
import java.util.logging.Handler


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        android.os.Handler().postDelayed({
            startActivity(Intent(this@MainActivity,Onboard::class.java))
            finish()
        },1000)
    }
}