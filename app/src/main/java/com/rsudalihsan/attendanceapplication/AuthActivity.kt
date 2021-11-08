package com.rsudalihsan.attendanceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        btnSignInAuth.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
        btnSignUpAuth.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}