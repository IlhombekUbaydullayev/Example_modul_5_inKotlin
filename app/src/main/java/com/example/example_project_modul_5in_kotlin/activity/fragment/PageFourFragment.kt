package com.example.example_project_modul_5in_kotlin.activity.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.example_project_modul_5in_kotlin.R

class PageFourFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view : View = inflater.inflate(R.layout.fragment_four, container, false)
        initViews(view)
        return view
    }

    private fun initViews(view: View) {

    }
}