package com.example.lab3

object Model {
    private var correctAnswers = 0
    private var incorrectAnswers = 0
    fun incrementCorrectAnswer() {
        correctAnswers++
    }

    fun incrementIncorrectAnswer() {
        incorrectAnswers++
    }

    fun resetAnswer() {
        correctAnswers = 0
        incorrectAnswers = 0
    }

    fun getCorrectAnswers(): Int {
        return correctAnswers
    }

    fun getIncorrectAnswers(): Int {
        return incorrectAnswers
    }
}