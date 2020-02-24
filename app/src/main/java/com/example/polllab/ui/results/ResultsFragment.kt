package com.example.polllab.ui.results

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
import kotlinx.android.synthetic.main.fragment_results.*


class ResultsFragment : Fragment() {

    private lateinit var resultsViewModel: ResultsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args = arguments
        if (args != null) {
            final_rate.setText("The final rating is " + (args.getString("message")))
        }
        return inflater.inflate(R.layout.fragment_results, container, false)

            resultsViewModel =
            ViewModelProviders.of(this).get(ResultsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_results, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        resultsViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        restart_survey.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.restartSurvey))
    }
}