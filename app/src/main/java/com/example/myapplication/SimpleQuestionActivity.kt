package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class SimpleQuestionActivity : AppCompatActivity() {

    private var selectedRadioButtonId: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_question)

        val radioGroup = findViewById<RadioGroup>(R.id.answerRadioGroup)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            selectedRadioButtonId = checkedId
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            handleAnswer()
            val intent = Intent(this, BytecodeQuestionActivity::class.java)
            startActivity(intent)
        }
    }

    private fun handleAnswer() {
        if (selectedRadioButtonId != -1) {
            when (selectedRadioButtonId) {
                R.id.yesRadioButton -> {
                    AnswersCount.correctAnswers++
                }

                R.id.noRadioButton -> {
                    AnswersCount.incorrectAnswers++
                }
            }
        } else {
            AnswersCount.incorrectAnswers++
        }
    }
}