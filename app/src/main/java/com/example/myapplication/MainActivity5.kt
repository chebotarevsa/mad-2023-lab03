package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity5 : AppCompatActivity() {

    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val correctAnswers = AnswersTracker.getCorrectAnswersCount()
        val incorrectAnswers = AnswersTracker.getIncorrectAnswersCount()

        val resultsTextView = findViewById<TextView>(R.id.textViewResults)
        val resultsString = getString(R.string.results_format, correctAnswers, incorrectAnswers)

        resultsTextView.text = formatColoredText(resultsString, correctAnswers, incorrectAnswers)

        findViewById<Button>(R.id.buttonRestart).setOnClickListener {
            AnswersTracker.reset()
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }
    }

    private fun formatColoredText(baseText: String, correctCount: Int, incorrectCount: Int): SpannableString {
        val spannableString = SpannableString(baseText)

        val correctColor = ContextCompat.getColor(this, R.color.green)
        val correctStart = baseText.indexOf(correctCount.toString())
        val correctEnd = correctStart + correctCount.toString().length
        spannableString.setSpan(ForegroundColorSpan(correctColor), correctStart, correctEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        val incorrectColor = ContextCompat.getColor(this, R.color.red)
        val incorrectStart = baseText.indexOf(incorrectCount.toString(), correctEnd)
        val incorrectEnd = incorrectStart + incorrectCount.toString().length
        spannableString.setSpan(ForegroundColorSpan(incorrectColor), incorrectStart, incorrectEnd, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        return spannableString
    }
}
