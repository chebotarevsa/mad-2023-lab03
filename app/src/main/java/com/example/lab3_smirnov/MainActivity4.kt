package com.example.lab3_smirnov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_smirnov.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding

    var correct = 0;
    var incorrect = 0;
    var answerEntered = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        correct = intent.getIntExtra(Const.CORRECT, correct)
        incorrect = intent.getIntExtra(Const.INCORRECT,incorrect)
        setContentView(binding.root)

        binding.button!!.setOnClickListener {
            if (!answerEntered) {
                checkAnswer()
                answerEntered = true
            }
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra(Const.CORRECT,correct)
            intent.putExtra(Const.INCORRECT,incorrect)
            startActivity(intent)
        }
    }

    private fun checkAnswer(){
        val correctAnswer = binding.checkBox?.isChecked == true && binding.checkBox2?.isChecked == true && binding.checkBox3?.isChecked == true && binding.checkBox4?.isChecked == true
        if (correctAnswer) correct++ else incorrect++
    }
}