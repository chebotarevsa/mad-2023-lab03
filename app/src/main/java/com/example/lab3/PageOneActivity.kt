package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.Page1ActivityBinding

class PageOneActivity : AppCompatActivity() {

    private lateinit var binding: Page1ActivityBinding

    var numTrue = 0;
    var numFalse = 0;
    var isAnswer=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Page1ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        numTrue = intent.getIntExtra(Answer.True, numTrue)
        numFalse = intent.getIntExtra(Answer.False, numFalse)

        binding.buttonContinue.setOnClickListener {
            checkAnswer()
            val intent = Intent(this, PageTwoActivity::class.java)
            intent.putExtra(Answer.True, numTrue)
            intent.putExtra(Answer.False, numFalse)
            startActivity(intent)
            finish() // prevent user from going back to this page
        }
    }

    private fun checkAnswer(){
        val text = binding.editText.text.toString()
        val correct = resources.getString(R.string.answer02)
        if(isAnswer){
            if (text == correct) numTrue++ else numFalse++
            isAnswer = false
        }
    }
}