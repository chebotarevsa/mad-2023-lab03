package com.example.moblab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moblab3.databinding.ActivityThirdQuestionBinding

class ThirdQuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdQuestionBinding

    var correct = 0;
    var incorrect = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        correct = intent.getIntExtra(Answer.CORRECT, correct)
        incorrect = intent.getIntExtra(Answer.INCORRECT, incorrect)
        setContentView(binding.root)

        binding.button!!.setOnClickListener {
            checkAnswer()
            val intent = Intent(this, FourthQuestionActivity::class.java)
            intent.putExtra(Answer.CORRECT, correct)
            intent.putExtra(Answer.INCORRECT, incorrect)
            startActivity(intent)
        }
    }


    private fun checkAnswer() {
        if (binding.firstCheckBox.isChecked && binding.secondCheckBox.isChecked && !binding.thirdCheckBox.isChecked) {
            correct++
        } else {
            incorrect++
        }
    }
}