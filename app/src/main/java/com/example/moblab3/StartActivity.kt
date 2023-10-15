package com.example.moblab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, FirstQuestionActivity::class.java)
            startActivity(intent)
        }
    }
}