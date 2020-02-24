package com.example.polllab.data

data class Question(val questionText: String) {

    override fun toString(): String {
        return "$questionText"
    }
}