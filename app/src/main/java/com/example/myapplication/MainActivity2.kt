package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private lateinit var switchView: Switch
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        switchView = findViewById(R.id.switchView)
        button = findViewById(R.id.button)

        switchView.setOnCheckedChangeListener { _, isChecked ->
            handleButtonClick(isChecked)
        }

        button.setOnClickListener {
            handleButtonClick(switchView.isChecked)
        }
    }

    private fun handleButtonClick(isSwitchChecked: Boolean) {
        val intentClass = if (isSwitchChecked) MainActivity3::class.java
        else MainActivity3::class.java

        val correctAnswer = !isSwitchChecked
        Log.d("MainActivity2", "Correct answer: $correctAnswer")

        if (correctAnswer) {
            AnswersTracker.incrementCorrect()
        } else {
            AnswersTracker.incrementIncorrect()
        }

        val intent = Intent(this, intentClass)
        startActivity(intent)
    }
}
