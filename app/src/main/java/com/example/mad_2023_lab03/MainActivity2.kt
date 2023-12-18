package com.example.mad_2023_lab03

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_2023_lab03.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            val userAnswer = binding.answerEditText.text.toString()
            val correctAnswer = "3"

            val isCorrectAnswer = userAnswer == correctAnswer

            if (isCorrectAnswer) {
                AppVars.correctAnswers++
            } else {
                AppVars.incorrectAnswers++
            }

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("isCorrectAnswer", isCorrectAnswer)
            startActivity(intent)
        }
    }
}