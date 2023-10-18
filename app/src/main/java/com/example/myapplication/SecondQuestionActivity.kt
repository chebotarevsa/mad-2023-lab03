package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity


class SecondQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_question)

        val switch: Switch = findViewById(R.id.switch2)
        val nextButton: Button = findViewById(R.id.nextButton2)
        nextButton.setOnClickListener {
            if (switch.isChecked) {
                QuizData.correctAnswers++
                QuizData.wrongAnswers--
            }
            else{
                QuizData.wrongAnswers
            }

            val intent = Intent(this, ThirdQuestionActivity::class.java)
            startActivity(intent)
        }
    }
}


