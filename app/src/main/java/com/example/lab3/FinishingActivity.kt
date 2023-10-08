package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityFinishingBinding
import com.example.lab3.databinding.ActivityFirstQuestionBinding

class FinishingActivity : AppCompatActivity() {
    lateinit var binding: ActivityFinishingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.againButton.setOnClickListener {
            Intent(this, StartingActivity::class.java).also {
                startActivity(it)
            }
        }

    }
}