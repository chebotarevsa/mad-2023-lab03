package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.Page3ActivityBinding

class PageThreeActivity : AppCompatActivity() {

    private lateinit var binding: Page3ActivityBinding

    var numTrue = 0;
    var numFalse = 0;
    var isAnswer=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Page3ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        numTrue = intent.getIntExtra(Answer.True, numTrue)
        numFalse = intent.getIntExtra(Answer.False, numFalse)

        binding.buttonContinue.setOnClickListener {
            checkAnswer()
            val intent = Intent(this, PageFourActivity::class.java)
            intent.putExtra(Answer.True, numTrue)
            intent.putExtra(Answer.False, numFalse)
            startActivity(intent)
        }
    }

    private fun checkAnswer(){
        val correct = binding.C2.isChecked
        if(isAnswer){
            if (correct) numTrue++ else numFalse++
            isAnswer = false
        }
    }
}
