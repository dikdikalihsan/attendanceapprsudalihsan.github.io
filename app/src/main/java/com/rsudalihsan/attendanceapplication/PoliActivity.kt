package com.rsudalihsan.attendanceapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout

class PoliActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poli)

        val btnPoliDokterUmum = findViewById<FrameLayout>(R.id.btnPoliDokterUmum)
        btnPoliDokterUmum.setOnClickListener {
            startActivity(Intent(
                this,
                MainActivity::class.java
            ))
        }
    }
}