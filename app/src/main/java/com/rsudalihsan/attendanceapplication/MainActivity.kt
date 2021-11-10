package com.rsudalihsan.attendanceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLetGetStarted : Button = findViewById(R.id.btnLetGetStarted);
        btnLetGetStarted.setOnClickListener {
            startActivity(Intent(this, DasboardActivity::class.java))
        }
    }
}