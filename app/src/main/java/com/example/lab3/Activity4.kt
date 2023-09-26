package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox
import android.content.Intent
import android.widget.Button

class Activity4 : AppCompatActivity() {
    private lateinit var radioButton1: CheckBox
    private lateinit var radioButton2: CheckBox
    private lateinit var radioButton3: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        radioButton1 = findViewById(R.id.checkBox1)
        radioButton2 = findViewById(R.id.checkBox2)
        radioButton3 = findViewById(R.id.checkBox3)

        findViewById<Button>(R.id.startButton).setOnClickListener {
            val correctAnswer =
                (radioButton1.isChecked && radioButton2.isChecked) && !radioButton3.isChecked
            if (correctAnswer) {
                Controller.incrementCorrectAnswer()
            } else {
                Controller.incrementIncorrectAnswer()
            }
            val i = Intent(this, Activity5::class.java)
            startActivity(i)
        }
    }
}