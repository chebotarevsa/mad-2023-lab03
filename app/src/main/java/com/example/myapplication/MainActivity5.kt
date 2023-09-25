package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val correctAnswers = AnswersTracker.correctAnswersCount
        val incorrectAnswers = AnswersTracker.incorrectAnswersCount

        val resultsTextView = findViewById<TextView>(R.id.textViewResults)
        resultsTextView.text = "Correct answers: $correctAnswers\nIncorrect answers: $incorrectAnswers"

        findViewById<Button>(R.id.buttonRestart).setOnClickListener {
            AnswersTracker.reset()
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }
}
