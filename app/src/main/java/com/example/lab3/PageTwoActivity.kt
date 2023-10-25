package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.Page2ActivityBinding

class PageTwoActivity : AppCompatActivity() {

    private lateinit var binding: Page2ActivityBinding

    var isTrue = 0;
    var isFalse = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Page2ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        isTrue = intent.getIntExtra(Answer.True, isTrue)
        isFalse = intent.getIntExtra(Answer.False, isFalse)

        binding.buttonContinue.setOnClickListener {
            checkAnswer()
            val intent = Intent(this, PageThreeActivity::class.java)
            intent.putExtra(Answer.True, isTrue)
            intent.putExtra(Answer.False, isFalse)
            startActivity(intent)
        }
    }

    private fun checkAnswer(){
        val correct = binding.R3.isChecked
        if (correct) isTrue++ else isFalse++
    }
}
