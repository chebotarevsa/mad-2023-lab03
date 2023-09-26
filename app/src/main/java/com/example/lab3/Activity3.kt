package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class Activity3 : AppCompatActivity() {
    companion object {
        private const val CORRECT_ANSWER = "1"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val startButton = findViewById<Button>(R.id.startButton)
        val editText = findViewById<EditText>(R.id.editText)

        startButton.setOnClickListener {
            val answer = editText?.text?.toString()?.trim()
            if (answer == CORRECT_ANSWER) {
                Controller.incrementCorrectAnswer()
            } else {
                Controller.incrementIncorrectAnswer()
            }
            val i = Intent(this, Activity4::class.java)
            startActivity(i)
        }
    }
}