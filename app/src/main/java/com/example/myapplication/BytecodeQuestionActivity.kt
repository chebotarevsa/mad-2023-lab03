package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class BytecodeQuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bytecode_question)

        val editText = findViewById<EditText>(R.id.editTextText)
        val nextButton = findViewById<Button>(R.id.nextButton)

        nextButton.setOnClickListener {
            handleAnswer(editText.text.toString())
            val intent = Intent(this, NeedToTrainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun handleAnswer(answer: String) {
        if (answer.length > 300) {
            AnswersCount.correctAnswers++
        } else {
            AnswersCount.incorrectAnswers++
        }
    }
}