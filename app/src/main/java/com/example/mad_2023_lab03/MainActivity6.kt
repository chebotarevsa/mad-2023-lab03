package com.example.mad_2023_lab03

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_2023_lab03.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.correctAnswersTextView.text = "Верные ответы: ${AppVars.correctAnswers}"
        binding.incorrectAnswersTextView.text = "Неверные ответы: ${AppVars.incorrectAnswers}"


        binding.restartButton.setOnClickListener {

            AppVars.correctAnswers = 0
            AppVars.incorrectAnswers = 0


            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}

