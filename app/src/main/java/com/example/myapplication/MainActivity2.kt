package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val switchView = findViewById<Switch>(R.id.switchView)
        switchView.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                AnswersTracker.incrementIncorrect()
            } else {
                AnswersTracker.incrementCorrect()
            }
        }

        findViewById<Button>(R.id.button).setOnClickListener {
            handleButtonClick()
        }
    }

    private fun handleButtonClick() {
        val intentClass = if (findViewById<Switch>(R.id.switchView).isChecked) MainActivity3::class.java
        else MainActivity3::class.java

        val correctAnswer = !findViewById<Switch>(R.id.switchView).isChecked

        Log.d("MainActivity2", "Correct answer: $correctAnswer")

        val intent = Intent(this, intentClass)
        startActivity(intent)
    }

}


