package com.example.chempionat2_0.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.chempionat2_0.R

class Onboard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)
        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener{
            startActivity(Intent(this@Onboard2,Onboard3::class.java))
        }
    }
}