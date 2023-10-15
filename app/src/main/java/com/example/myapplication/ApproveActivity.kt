package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class ApproveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_approve)

        val nextQuestionButton = findViewById<Button>(R.id.nextButton)
        nextQuestionButton.setOnClickListener {
            handleAnswer()
            val intent = Intent(this, RestartActivity::class.java)
            startActivity(intent)
        }
    }

    private fun handleAnswer() {
        val switch = findViewById<Switch>(R.id.switchButton)
        if (switch.isChecked) {
            AnswersCount.correctAnswers++
        } else {
            AnswersCount.incorrectAnswers++
        }
    }
}