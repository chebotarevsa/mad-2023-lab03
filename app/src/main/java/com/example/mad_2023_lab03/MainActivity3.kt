package com.example.mad_2023_lab03

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_2023_lab03.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            val isCorrectAnswer = binding.option3RadioButton.isChecked

            if (isCorrectAnswer) {
                AppVars.correctAnswers++
            } else {
                AppVars.incorrectAnswers++
            }

            val intent = Intent(this, MainActivity4::class.java)
            intent.putExtra("isCorrectAnswer", isCorrectAnswer)
            startActivity(intent)
        }
    }
}