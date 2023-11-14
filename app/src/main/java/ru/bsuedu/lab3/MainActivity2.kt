package ru.bsuedu.lab3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private var selectedAnswer: Int? = null // Сохраняем выбранный ответ
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            val editText = findViewById<EditText>(R.id.editText2)
            selectedAnswer = if (editText.text.contains("тот сам так и называется")) 1 else 0
            intent.putExtra("correctAnswers", (if (selectedAnswer == 1) 1 else 0))
            startActivity(intent)
        }
    }
}