package com.rsudalihsan.attendanceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AuthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        val btnSignUpActivity : Button = findViewById(R.id.btnSignUpAuth)
        btnSignUpActivity.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
        fun onClick(v: SignUpActivity) {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        val btnSignInActivity : Button = findViewById(R.id.btnSignInAuth)
        btnSignInActivity.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
        }
        fun onClick(v: SignInActivity) {
            startActivity(Intent(this, SignInActivity::class.java))

        }

    }
}