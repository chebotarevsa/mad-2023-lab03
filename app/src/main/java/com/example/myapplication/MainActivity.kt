package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.start_button)
        startButton.setOnClickListener {
            QuizData.reset()
            val intent = Intent(this, FirstQuestionActivity::class.java)
            startActivity(intent)
        }
    }
}

