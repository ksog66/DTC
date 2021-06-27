package com.example.delhitechnicalcampus.LiquidDisplay

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.delhitechnicalcampus.MainActivity
import com.example.delhitechnicalcampus.R


class OnBoardingFragment3 : Fragment() {
lateinit var button:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews(view)
        button.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                val intent = Intent(activity,MainActivity::class.java)
                startActivity(intent)
            }

        })
    }

    private fun bindViews(view: View) {
       button = view.findViewById(R.id.get_started)
    }

}