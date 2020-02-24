package com.example.polllab.ui.questions

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.polllab.data.QuestionsRepository

class QuestionsViewModelFactory(private val questionsRepository: QuestionsRepository)
    : ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuestionsViewModel(questionsRepository) as T
    }
}