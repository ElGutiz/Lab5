package com.example.polllab.ui.rate

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
import com.example.polllab.ui.results.ResultsFragment
import kotlinx.android.synthetic.main.fragment_rating.*


class RateFragment : Fragment() {

    private lateinit var ratingViewModel: RatingViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_rating, container, false)
        ratingViewModel =
            ViewModelProviders.of(this).get(ratingViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_rating, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        ratingViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val calification = calification.rating.toString()
        val bundle = Bundle()
        bundle.putString("message", calification)
        val fragobj = ResultsFragment()
        fragobj.setArguments(bundle)
        finish_survey.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.toResults))
    }
}