package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.ActivityFirstQuestionBinding
import com.example.lab3.databinding.ActivitySecondQuestionBinding
import com.example.lab3.databinding.ActivityStartingBinding

class SecondQuestionActivity : AppCompatActivity() {
    lateinit var binding : ActivitySecondQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_question)
        binding = ActivitySecondQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            Intent(this, ThirdQuestionActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}