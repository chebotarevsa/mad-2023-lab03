package com.example.mad_2023_lab03

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mad_2023_lab03.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            val answer = if (binding.yesNoSwitch.isChecked) "Да" else "Нет"


            if (answer == "Да") {
                AppVars.correctAnswers++
            } else {
                AppVars.incorrectAnswers++
            }

            startActivity(Intent(this, MainActivity6::class.java))
        }
    }
}

