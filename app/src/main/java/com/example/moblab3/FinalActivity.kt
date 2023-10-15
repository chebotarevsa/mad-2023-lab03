package com.example.moblab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moblab3.databinding.ActivityFinalBinding

class FinalActivity : AppCompatActivity() {

    var correct = 0;
    var incorrect = 0;

    private lateinit var binding: ActivityFinalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        correct = intent.getIntExtra(Answer.CORRECT, correct)
        incorrect = intent.getIntExtra(Answer.INCORRECT,incorrect)


        binding.True.text = correct.toString()
        binding.False.text = incorrect.toString()


        binding.button.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }
    }
}