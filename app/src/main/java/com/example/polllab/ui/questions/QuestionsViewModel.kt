package com.example.polllab.ui.questions

import androidx.lifecycle.ViewModel
import com.example.polllab.data.Question
import com.example.polllab.data.QuestionsRepository

class QuestionsViewModel(private val questionsRepository: QuestionsRepository) :ViewModel(){
    fun getQuestions() = questionsRepository.getQuestions()

    fun addQuestion(question: Question) = questionsRepository.addQuestion(question)
}