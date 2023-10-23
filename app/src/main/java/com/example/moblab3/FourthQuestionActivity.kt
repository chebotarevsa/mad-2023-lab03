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
            val isValid = checkAnswer()
            val intent = Intent(this, FinalActivity::class.java)
            intent.putExtra(Answer.CORRECT, correct + isValid.intValue)
            intent.putExtra(Answer.INCORRECT, incorrect + (!isValid).intValue)
            startActivity(intent)
        }
    }


    private fun checkAnswer(): Boolean {
        return binding.switch2.isChecked
    }

    val Boolean.intValue
        get() = if (this) 1 else 0

}