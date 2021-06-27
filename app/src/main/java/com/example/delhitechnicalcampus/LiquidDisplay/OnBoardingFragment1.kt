package com.example.delhitechnicalcampus.LiquidDisplay

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.delhitechnicalcampus.MainActivity
import com.example.delhitechnicalcampus.R


class OnBoardingFragment1 : Fragment() {
    lateinit var skip:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_on_boarding1, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindViews(view)
        skip.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
              //  val intent = Intent(this@OnBoardingFragment1,MainActivity::class.java)
                val intent = Intent(activity, MainActivity::class.java)
                startActivity(intent)
            }

        })
    }

    private fun bindViews(view: View) {
        skip = view.findViewById(R.id.skip1)
    }
}