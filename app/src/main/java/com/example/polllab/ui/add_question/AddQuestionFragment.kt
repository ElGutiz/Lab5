package com.example.polllab.ui.add_question

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.polllab.R
import com.example.polllab.ui.questions.QuestionsViewModel
import com.example.polllab.utilities.injectorUtils

class AddQuestionFragment : Fragment() {

    private lateinit var addQuestionViewModel: AddQuestionViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_question, container, false)
        addQuestionViewModel =
            ViewModelProviders.of(this).get(AddQuestionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_add_question, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        addQuestionViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}