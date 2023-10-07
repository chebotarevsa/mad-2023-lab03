package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.CheckBox
import android.content.Intent
import android.widget.Button

class Activity4 : AppCompatActivity() {
    private lateinit var check1: CheckBox
    private lateinit var check2: CheckBox
    private lateinit var check3: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        check1 = findViewById(R.id.checkBox1)
        check2 = findViewById(R.id.checkBox2)
        check3 = findViewById(R.id.checkBox3)

        findViewById<Button>(R.id.startButton).setOnClickListener {
            val correctAnswer =
                check1.isChecked && check2.isChecked && !check3.isChecked
            if (correctAnswer) {
                Model.incrementCorrectAnswer()
            } else {
                Model.incrementIncorrectAnswer()
            }
            val i = Intent(this, Activity5::class.java)
            startActivity(i)
        }
    }
}