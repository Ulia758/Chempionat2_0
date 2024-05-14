package com.example.chempionat2_0.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.chempionat2_0.R

class Onboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener{
            startActivity(Intent(this@Onboard,Onboard2::class.java))
        }
    }
}