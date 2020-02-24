package com.example.polllab.data

class FakeDataBase private constructor() {

    var questionDao = FakeQuestionDao()
        private set

    companion object{
        @Volatile private var instance: FakeDataBase? = null

        fun getInstance() =
            instance ?: synchronized(this){
                instance ?: FakeDataBase().also { instance = it}
            }
    }
}