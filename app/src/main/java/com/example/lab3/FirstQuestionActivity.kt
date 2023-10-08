package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityFirstQuestionBinding
import java.util.Locale

class FirstQuestionActivity : AppCompatActivity() {
    lateinit var binding: ActivityFirstQuestionBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            if (binding.textField
                    .text
                    .toString()
                    .trim()
                    .lowercase(Locale.ROOT)
                    .contentEquals("кеша")
            ) {
                AppVars.correctAnswers++
            } else {
                AppVars.incorrectAnswers++;
            }

            Intent(this, SecondQuestionActivity::class.java).also {
                startActivity(it)
            }

        }
    }
}