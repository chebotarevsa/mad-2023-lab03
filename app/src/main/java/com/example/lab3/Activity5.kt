package com.example.lab3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.Switch

class Activity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var hasCorrectAnswer = false

        val switch1 = findViewById<Switch>(R.id.switch1)
        val startButton = findViewById<Button>(R.id.startButton)

        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            hasCorrectAnswer = isChecked
        }

        startButton.setOnClickListener {
            if (hasCorrectAnswer) {
                Model.incrementCorrectAnswer()
            } else {
                Model.incrementIncorrectAnswer()
            }
            val i = Intent(this, Activity6::class.java)
            startActivity(i)
        }
    }
}