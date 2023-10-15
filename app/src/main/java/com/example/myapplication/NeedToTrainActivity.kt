package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class NeedToTrainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_need_to_train)

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            handleAnswer()
            val intent = Intent(this, ApproveActivity::class.java)
            startActivity(intent)
        }
    }

    private fun handleAnswer() {
        val answer1CheckBox = findViewById<CheckBox>(R.id.answer1CheckBox)
        val answer2CheckBox = findViewById<CheckBox>(R.id.answer2CheckBox)
        val answer3CheckBox = findViewById<CheckBox>(R.id.answer3CheckBox)
        val answer4CheckBox = findViewById<CheckBox>(R.id.answer4CheckBox)
        if (answer1CheckBox.isChecked && answer2CheckBox.isChecked
            && answer3CheckBox.isChecked && answer4CheckBox.isChecked
        ) {
            AnswersCount.correctAnswers++
        } else {
            AnswersCount.incorrectAnswers++
        }
    }
}