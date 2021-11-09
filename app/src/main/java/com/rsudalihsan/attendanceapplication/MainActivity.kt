package com.rsudalihsan.attendanceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogout : Button = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener {
            startActivity(Intent(this, AuthActivity::class.java))
        }
    }
}