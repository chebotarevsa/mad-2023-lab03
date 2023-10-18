package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity


class ThirdQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_question)

        val optionA: CheckBox = findViewById(R.id.option3a)
        val optionB: CheckBox = findViewById(R.id.option3b)
        val optionC: CheckBox = findViewById(R.id.option3c)
        val optionD: CheckBox = findViewById(R.id.option3d)
        val nextButton: Button = findViewById(R.id.nextButton3)
        nextButton.setOnClickListener {
            if (optionA.isChecked && !optionB.isChecked && optionC.isChecked && !optionD.isChecked) {
                QuizData.correctAnswers++
                QuizData.wrongAnswers--
            } else {
                QuizData.wrongAnswers
            }

            val intent = Intent(this, FourthQuestionActivity::class.java)
            startActivity(intent)
        }
    }
}

