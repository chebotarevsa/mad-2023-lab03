package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity

class FirstQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_question)

        val radioGroup: RadioGroup = findViewById(R.id.radioGroup1)
        val nextButton: Button = findViewById(R.id.nextButton1)
        nextButton.setOnClickListener {
            if (radioGroup.checkedRadioButtonId == R.id.option1a) {
                QuizData.correctAnswers++
            }

            val intent = Intent(this, SecondQuestionActivity::class.java)
            startActivity(intent)
        }
    }
}


