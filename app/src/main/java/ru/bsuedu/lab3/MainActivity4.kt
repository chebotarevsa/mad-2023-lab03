package ru.bsuedu.lab3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton

class MainActivity4 : AppCompatActivity() {
    private var selectedAnswer: Int? = null // Сохраняем выбранный ответ
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val correctAnswers = intent.getIntExtra("correctAnswers", 0)
            val intent = Intent(this, MainActivity5::class.java)
            val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
            val checkBox2 = findViewById<CheckBox>(R.id.checkBox2) // верный
            val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
            val checkBox4 = findViewById<CheckBox>(R.id.checkBox4) // верный

            selectedAnswer = if (!checkBox1.isChecked && checkBox2.isChecked && !checkBox3.isChecked && checkBox4.isChecked) 1 else 0
            intent.putExtra("correctAnswers", correctAnswers + (if (selectedAnswer == 1) 1 else 0))
            startActivity(intent)
        }
    }
}