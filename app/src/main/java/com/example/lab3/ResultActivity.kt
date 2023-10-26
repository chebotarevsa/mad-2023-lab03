package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ResultActivityBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ResultActivityBinding

    var numTrue = 0;
    var numFalse = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ResultActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        numTrue = intent.getIntExtra(Answer.True, numTrue)
        numFalse = intent.getIntExtra(Answer.False, numFalse)

        binding.T.text = numTrue.toString()
        binding.F.text = numFalse.toString()

        binding.buttonContinue.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
            startActivity(intent)
        }
    }
}
