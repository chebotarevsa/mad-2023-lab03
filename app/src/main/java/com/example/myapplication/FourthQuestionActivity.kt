package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class FourthQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_question)


        val answerEditText: EditText = findViewById(R.id.answerEditText)
        val nextButton: Button = findViewById(R.id.nextButton4)
        nextButton.setOnClickListener {
            val answer = answerEditText.text.toString().trim()
            if (answer.equals("yes", ignoreCase = true)) {
                QuizData.correctAnswers++
                QuizData.wrongAnswers--
            } else {
                QuizData.wrongAnswers

            }



            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }
    }
}

