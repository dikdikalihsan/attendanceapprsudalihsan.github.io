package com.rsudalihsan.attendanceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val btnForgotPassword : TextView = findViewById(R.id.btnForgotPassword)
        btnForgotPassword.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        val btnSignIn : Button = findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }


    }
}