package com.example.mad_2023_lab03

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_2023_lab03.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {

    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            val isOption1Checked = binding.option1CheckBox.isChecked
            val isOption2Checked = binding.option2CheckBox.isChecked
            val isOption3Checked = binding.option3CheckBox.isChecked

            val isCorrectAnswer = isOption1Checked && !isOption2Checked && isOption3Checked

            if (isCorrectAnswer) {
                AppVars.correctAnswers++
            } else {
                AppVars.incorrectAnswers++
            }

            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtra("isCorrectAnswer", isCorrectAnswer)
            startActivity(intent)
        }
    }
}
