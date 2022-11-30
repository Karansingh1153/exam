package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn = findViewById<Button>(R.id.btn)
        val background = findViewById<LinearLayout>(R.id.backColor)
        btn.setOnClickListener {
            background.setBackgroundResource(R.drawable.background)
        }
    }

}