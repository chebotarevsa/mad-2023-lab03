package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RestartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restart)
        setUpAnswersCount()
        val restartButton = findViewById<Button>(R.id.restartButton)
        restartButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            resetAnswersCount()
            startActivity(intent)
        }
    }

    private fun resetAnswersCount() {
        AnswersCount.correctAnswers = 0
        AnswersCount.incorrectAnswers = 0
    }

    private fun setUpAnswersCount() {
        val correctAnswersCountText = findViewById<TextView>(R.id.correctCountTextView)
        val incorrectAnswersCountText = findViewById<TextView>(R.id.incorrectCountTextView)
        correctAnswersCountText.text = AnswersCount.correctAnswers.toString()
        incorrectAnswersCountText.text = AnswersCount.incorrectAnswers.toString()
    }
}