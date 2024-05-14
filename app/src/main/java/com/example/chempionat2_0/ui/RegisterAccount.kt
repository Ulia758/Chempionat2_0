package com.example.chempionat2_0.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.view.isVisible
import com.example.chempionat2_0.R

class RegisterAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_account)
        val btn = findViewById<ImageView>(R.id.eyeButton8)
        val passw = findViewById<EditText>(R.id.editPassword)
        btn.isActivated=false
        btn.setOnClickListener{
            if(btn.isActivated==false){
                passw.inputType=1
                btn.isActivated=true
            } else{
                passw.inputType=InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                btn.isActivated=false
            }
        }
    }
}