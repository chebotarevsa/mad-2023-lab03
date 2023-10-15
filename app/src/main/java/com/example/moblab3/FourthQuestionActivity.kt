package com.example.moblab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moblab3.databinding.ActivityFourthQuestionBinding

class FourthQuestionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFourthQuestionBinding

    var correct = 0;
    var incorrect = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFourthQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        correct = intent.getIntExtra(Answer.CORRECT, correct)
        incorrect = intent.getIntExtra(Answer.INCORRECT, incorrect)

        binding.button!!.setOnClickListener {
            checkAnswer()
            val intent = Intent(this, FinalActivity::class.java)
            intent.putExtra(Answer.CORRECT, correct)
            intent.putExtra(Answer.INCORRECT, incorrect)
            startActivity(intent)
        }
    }


    private fun checkAnswer() {
        if (binding.switch2.isChecked) {
            correct++
        } else {
            incorrect++
        }
    }

}