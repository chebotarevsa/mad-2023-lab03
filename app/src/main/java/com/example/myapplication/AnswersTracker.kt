package com.example.myapplication

object AnswersTracker {
    private var correctAnswersCount = 0
    private var incorrectAnswersCount = 0

    @JvmName("getCorrectAnswers")
    fun getCorrectAnswersCount(): Int {
        return correctAnswersCount
    }

    @JvmName("getIncorrectAnswers")
    fun getIncorrectAnswersCount(): Int {
        return incorrectAnswersCount
    }

    fun incrementCorrect() {
        correctAnswersCount++
    }

    fun incrementIncorrect() {
        incorrectAnswersCount++
    }

    fun reset() {
        correctAnswersCount = 0
        incorrectAnswersCount = 0
    }
}
