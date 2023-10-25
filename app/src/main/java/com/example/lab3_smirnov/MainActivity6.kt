package com.example.lab3_smirnov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_smirnov.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {

    var correct = 0;
    var incorrect = 0;

    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        correct = intent.getIntExtra(Const.CORRECT, correct)
        incorrect = intent.getIntExtra(Const.INCORRECT,incorrect)

        correct = intent.getIntExtra(Const.CORRECT,correct)
        incorrect = intent.getIntExtra(Const.INCORRECT,incorrect)

        binding.textView7?.text = correct.toString()
        binding.textView8?.text  = incorrect.toString()


        binding.button!!.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}