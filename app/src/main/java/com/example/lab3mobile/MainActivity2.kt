package com.example.lab3mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3mobile.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    var correct = 0;
    var incorrect = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        correct = intent.getIntExtra(Const.CORRECT, correct)
        incorrect = intent.getIntExtra(Const.INCORRECT,incorrect)

        binding.button.setOnClickListener {
            checkAnswer()
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra(Const.CORRECT,correct)
            intent.putExtra(Const.INCORRECT,incorrect)
            startActivity(intent)
        }
    }
    private fun checkAnswer() {

        val textInput =  binding.editTextText.text.toString()
        val correctAnswer = resources.getString(R.string.correctAnswer1)
        if (textInput == correctAnswer) correct++ else incorrect++
    }
}

