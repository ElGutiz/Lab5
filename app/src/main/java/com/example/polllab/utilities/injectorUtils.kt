package com.example.polllab.utilities

import com.example.polllab.data.FakeDataBase
import com.example.polllab.data.QuestionsRepository
import com.example.polllab.ui.questions.QuestionsViewModelFactory

object injectorUtils {

    fun provideQuestionsViewModelFactory(): QuestionsViewModelFactory{
        val questionsRepository = QuestionsRepository.getInstance(FakeDataBase.getInstance().questionDao)
        return  QuestionsViewModelFactory(questionsRepository)
    }
}