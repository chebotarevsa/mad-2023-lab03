package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityFirstQuestionBinding
import com.example.lab3.databinding.ActivityThirdQuestionBinding

class ThirdQuestionActivity : AppCompatActivity() {
    lateinit var binding : ActivityThirdQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            if (binding.firstCB.isChecked && binding.secondCB.isChecked) {
                AppVars.correctAnswers++
            } else {
                AppVars.incorrectAnswers++
            }

            Intent(this, FourthQuestionActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}