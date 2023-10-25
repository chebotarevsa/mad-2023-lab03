package com.example.lab3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.Page3ActivityBinding

class PageThreeActivity : AppCompatActivity() {

    private lateinit var binding: Page3ActivityBinding

    var isTrue = 0;
    var isFalse = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = Page3ActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        isTrue = intent.getIntExtra(Answer.True, isTrue)
        isFalse = intent.getIntExtra(Answer.False, isFalse)

        binding.buttonContinue.setOnClickListener {
            checkAnswer()
            val intent = Intent(this, PageFourActivity::class.java)
            intent.putExtra(Answer.True, isTrue)
            intent.putExtra(Answer.False, isFalse)
            startActivity(intent)
        }
    }

    private fun checkAnswer(){
        val correct = binding.C2.isChecked
        if (correct) isTrue++ else isFalse++
    }
}
