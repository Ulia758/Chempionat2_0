package com.example.chempionat2_0.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.chempionat2_0.R

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val emailEdit = findViewById<EditText>(R.id.editTextEmail)
        val passw = findViewById<EditText>(R.id.editPassword)
        val btn = findViewById<ImageButton>(R.id.sendBtn)
        btn.setOnClickListener {
            validateEmail(emailEdit)
            if(emailEdit.error==null && !passw.text.toString().isEmpty()){
                startActivity(Intent(this@SignIn,Verification::class.java))
            }else{
                Toast.makeText(this,"Не все поля верно заполнены", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun validateEmail( email:EditText){
        val emailInput = email.text.toString()
        if(!emailInput.isEmpty()&&Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()){
            email.error = null
        }
        else{
            email.error = "Неверный email"
        }
    }
    fun textClickCreate(view: View) {
        startActivity(Intent(this@SignIn,RegisterAccount::class.java))
    }

    fun textClickRecycle(view: View) {
        startActivity(Intent(this@SignIn,ForgotPassword::class.java))
    }
}