package com.example.polllab.data

class QuestionsRepository private constructor(private val questionDao: FakeQuestionDao){

    fun addQuestion(question: Question){
        questionDao.addQuestion(question)
    }

    fun getQuestions() = questionDao.getQuestions()

    companion object{
        @Volatile private var instance: QuestionsRepository? = null

        fun getInstance(questionDao: FakeQuestionDao) =
            instance ?: synchronized(this){
                instance ?: QuestionsRepository(questionDao).also { instance = it}
            }
    }
}