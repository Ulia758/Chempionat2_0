package com.example.chempionat2_0.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.chempionat2_0.R

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        val emailEdit = findViewById<EditText>(R.id.editEmail)
        val btn = findViewById<ImageButton>(R.id.sendBtn)
        btn.setOnClickListener {
            validateEmail(emailEdit)
            if(emailEdit.error==null ){
                startActivity(Intent(this@ForgotPassword,Verification::class.java))
            }else{
                Toast.makeText(this,"Неверный email", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun validateEmail( email: EditText){
        val emailInput = email.text.toString()
        if(!emailInput.isEmpty()&& Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            email.error = null
        }
        else{
            email.error = "Неверный email"
        }
    }
}