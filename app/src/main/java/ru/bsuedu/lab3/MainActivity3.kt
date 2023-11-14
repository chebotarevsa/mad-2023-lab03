package ru.bsuedu.lab3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    private var selectedAnswer: Int? = null // Сохраняем выбранный ответ
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val correctAnswers = intent.getIntExtra("correctAnswers", 0)
            val intent = Intent(this, MainActivity4::class.java)
            val radioButton = findViewById<RadioButton>(R.id.radioButton2)
            selectedAnswer = if (radioButton.isChecked) 1 else 0
            intent.putExtra("correctAnswers", correctAnswers + (if (selectedAnswer == 1) 1 else 0))
            startActivity(intent)
        }
    }
}