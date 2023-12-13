package com.example.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    var correct = 0;
    var incorrect = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        correct = intent.getIntExtra("correct", correct)
        incorrect = intent.getIntExtra("incorrect", incorrect)

        binding.nextButton.setOnClickListener {
            val isValid = checkAnswer()
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("correct", correct + isValid.intValue)
            intent.putExtra("incorrect", incorrect + (!isValid).intValue)
            startActivity(intent)
        }
    }

    private fun checkAnswer(): Boolean
        = binding.firstRadioButton.isChecked


    val Boolean.intValue
        get() = if (this) 1 else 0

}