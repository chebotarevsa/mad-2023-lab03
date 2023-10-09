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
            val checkBox1 = findViewById<CheckBox>(R.id.checkbox1)
            val checkBox3 = findViewById<CheckBox>(R.id.checkbox3)

            val correctAnswer = checkBox1.isChecked && checkBox3.isChecked

            when (correctAnswer) {
                true -> AnswersTracker.incrementIncorrect()
                false -> AnswersTracker.incrementCorrect()
            }
            Log.d("MainActivity3", "Correct answer: $correctAnswer")
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}

