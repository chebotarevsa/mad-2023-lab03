package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val correctAnswersTextView: TextView = findViewById(R.id.correctAnswersText)
        val wrongAnswersTextView: TextView = findViewById(R.id.wrongAnswersText)

        correctAnswersTextView.text = "Правильные ответы: ${QuizData.correctAnswers}"
        wrongAnswersTextView.text = "Неправильные ответы: ${QuizData.wrongAnswers}"

        val restartButton: Button = findViewById(R.id.restartButton)
        restartButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}


