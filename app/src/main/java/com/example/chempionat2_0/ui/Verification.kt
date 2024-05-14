package com.example.chempionat2_0.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chempionat2_0.R

class Verification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)
        android.os.Handler().postDelayed({
            startActivity(Intent(this@Verification,Onboard::class.java))
            finish()
        },1000)
    }
}