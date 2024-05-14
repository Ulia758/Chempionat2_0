package com.example.chempionat2_0.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.chempionat2_0.R

class Onboard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)
        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener{
            startActivity(Intent(this@Onboard3,SignIn::class.java))
        }
    }
}