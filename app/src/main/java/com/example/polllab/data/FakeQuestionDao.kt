package com.example.polllab.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuestionDao {
    private val questionList = mutableListOf<Question>()
    private val questions = MutableLiveData<List<Question>>()

    init {
        questions.value = questionList
    }

    fun addQuestion(question: Question){
        questionList.add(question)
        questions.value = questionList
    }

    fun getQuestions() = questions as LiveData<List<Question>>
}