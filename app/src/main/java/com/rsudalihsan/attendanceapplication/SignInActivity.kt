package com.rsudalihsan.attendanceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initActionBar()

        btnSignIn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        btnForgotPass.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }
        tbSignIn.setNavigationOnClickListener {
            finish()
        }
    }

    private fun initActionBar() {
        setSupportActionBar(tbSingIn)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
    }
}