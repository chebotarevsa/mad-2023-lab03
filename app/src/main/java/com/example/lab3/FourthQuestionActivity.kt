package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityFirstQuestionBinding
import com.example.lab3.databinding.ActivityFourthQuestionBinding

class FourthQuestionActivity : AppCompatActivity() {
    lateinit var binding : ActivityFourthQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            Intent(this, FinishingActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}