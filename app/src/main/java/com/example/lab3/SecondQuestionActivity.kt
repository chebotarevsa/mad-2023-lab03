package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.ActivitySecondQuestionBinding

class SecondQuestionActivity : AppCompatActivity() {
    lateinit var binding : ActivitySecondQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            if (binding.correctRadioButton.isChecked) {
                AppVars.correctAnswers++
            } else {
                AppVars.incorrectAnswers++
            }

            Intent(this, ThirdQuestionActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}