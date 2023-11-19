package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_activity)

        val button = findViewById<Button>(R.id.buttonStart)
        button.setOnClickListener {
            val intent = Intent(this, PageOneActivity::class.java)
            startActivity(intent)
        }
    }
}