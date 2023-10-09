package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editTextText)

        button.setOnClickListener {
            val answer = editText.text.toString().trim()

            val correctAnswer = answer.equals("Б", ignoreCase = true)
            if (correctAnswer) {
                AnswersTracker.incrementCorrect()
            } else {
                AnswersTracker.incrementIncorrect()
            }
            Log.d("MainActivity4", "Correct answer: $correctAnswer")

            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}
