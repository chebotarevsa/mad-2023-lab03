package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ResultActivityBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ResultActivityBinding

    var isTrue = 0;
    var isFalse = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ResultActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        isTrue = intent.getIntExtra(Answer.True, isTrue)
        isFalse = intent.getIntExtra(Answer.False, isFalse)

        binding.T.text = isTrue.toString()
        binding.F.text = isFalse.toString()

        binding.buttonContinue.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
