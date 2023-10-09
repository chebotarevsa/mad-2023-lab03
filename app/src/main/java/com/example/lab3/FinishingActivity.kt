package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityFinishingBinding

class FinishingActivity : AppCompatActivity() {
    lateinit var binding: ActivityFinishingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.correctAnswersAmount.text = getString(R.string.correct, AppVars.correctAnswers)
        binding.incorrectAnswersAmount.text = getString(R.string.incorrect, AppVars.incorrectAnswers)


        binding.againButton.setOnClickListener {
            AppVars.correctAnswers = 0
            AppVars.incorrectAnswers = 0

            Intent(this, StartingActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}