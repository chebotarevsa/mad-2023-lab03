package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity


class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<Button>(R.id.button).setOnClickListener {
            val radioButton1 = findViewById<CheckBox>(R.id.radioButton1)
            val radioButton3 = findViewById<CheckBox>(R.id.radioButton3)

            val correctAnswer = radioButton1.isChecked && radioButton3.isChecked
            if (correctAnswer) {
                AnswersTracker.incrementCorrect()
            } else {
                AnswersTracker.incrementIncorrect()
            }
            Log.d("MainActivity3", "Correct answer: $correctAnswer")
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}

