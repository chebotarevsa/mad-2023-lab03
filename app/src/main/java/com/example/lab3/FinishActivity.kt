package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.ActivityFinishBinding

class FinishActivity : AppCompatActivity() {

    var correct = 0;
    var incorrect = 0;

    private lateinit var binding: ActivityFinishBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)

        correct = intent.getIntExtra("correct", correct)
        incorrect = intent.getIntExtra("incorrect", incorrect)


        binding.correctAnswersAmount.text = correct.toString()
        binding.incorrectAnswersAmount.text = incorrect.toString()


        binding.retryButton.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }
    }
}