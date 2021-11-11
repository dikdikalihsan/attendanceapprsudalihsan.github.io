package com.rsudalihsan.attendanceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnDoctor : Button = findViewById(R.id.btnDoctor)
        btnDoctor.setOnClickListener {
            startActivity(Intent(this, PoliActivity::class.java))
        }
        val btnCall : Button = findViewById(R.id.btnCall)
        btnCall.setOnClickListener {
            startActivity(Intent(this, CallActivity::class.java))
        }
    }
}