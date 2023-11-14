package ru.bsuedu.lab3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Switch

class MainActivity5 : AppCompatActivity() {
    private var selectedAnswer: Int? = null // Сохраняем выбранный ответ
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val correctAnswers = intent.getIntExtra("correctAnswers", 0)
            val intent = Intent(this, ResultActivity::class.java)
            val switch1 = findViewById<Switch>(R.id.switch1)
            selectedAnswer = if (switch1.isChecked) 1 else 0
            intent.putExtra("correctAnswers", correctAnswers + (if (selectedAnswer == 1) 1 else 0))

            startActivity(intent)
        }
    }
}