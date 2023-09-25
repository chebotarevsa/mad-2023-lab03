package com.example.myapplication

object AnswersTracker {
    var correctAnswersCount = 0
    var incorrectAnswersCount = 0

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

