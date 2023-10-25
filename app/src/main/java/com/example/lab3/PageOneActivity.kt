package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.Page1ActivityBinding

class PageOneActivity : AppCompatActivity() {

    private lateinit var binding: Page1ActivityBinding

    var isTrue = 0;
    var isFalse = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Page1ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        isTrue = intent.getIntExtra(Answer.True, isTrue)
        isFalse = intent.getIntExtra(Answer.False, isFalse)

        binding.buttonContinue.setOnClickListener {
            checkAnswer()
            val intent = Intent(this, PageTwoActivity::class.java)
            intent.putExtra(Answer.True, isTrue)
            intent.putExtra(Answer.False, isFalse)
            startActivity(intent)
        }
    }

    private fun checkAnswer(){
        val text = binding.editText.text.toString()
        val correct = resources.getString(R.string.answer02)
        if (text == correct) isTrue++ else isFalse++
    }
}