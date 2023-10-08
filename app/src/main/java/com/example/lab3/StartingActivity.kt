package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.ActivityStartingBinding

class StartingActivity : AppCompatActivity() {
    lateinit var binding: ActivityStartingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener {
            Intent(this, FirstQuestionActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}