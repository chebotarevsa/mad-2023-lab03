package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Activity6 : AppCompatActivity() {

    private lateinit var result1: TextView
    private lateinit var result2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)


        result1 = findViewById(R.id.textViewCor)
        result2 = findViewById(R.id.textViewIncor)


        val correctAnswersText = Model.getCorrectAnswers().toString()
        val incorrectAnswersText = Model.getIncorrectAnswers().toString()

        result1.text = getString(R.string.result1, correctAnswersText)
        result2.text = getString(R.string.result2, incorrectAnswersText)

        findViewById<Button>(R.id.resetButton).setOnClickListener {
            Model.resetAnswer()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}