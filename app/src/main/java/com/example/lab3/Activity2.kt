package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton

class Activity2 : AppCompatActivity() {
    private lateinit var radioButton1: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        radioButton1 = findViewById(R.id.radioButton1)
        findViewById<Button>(R.id.startButton).setOnClickListener {
            val correctAnswer = radioButton1.isChecked
            if (correctAnswer) {
                Model.incrementCorrectAnswer()
            } else {
                Model.incrementIncorrectAnswer()
            }
            val i = Intent(this, Activity3::class.java)
            startActivity(i)
        }
    }
}