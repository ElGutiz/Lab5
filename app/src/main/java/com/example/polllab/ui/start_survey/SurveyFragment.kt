package com.example.polllab.ui.start_survey

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.example.polllab.R
import kotlinx.android.synthetic.main.fragment_survey.*

class SurveyFragment : Fragment() {

    private lateinit var surveyViewModel: SurveyViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_survey, container, false)

        surveyViewModel =
            ViewModelProviders.of(this).get(SurveyViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_survey, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        surveyViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        next_question.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toRate))
    }
}