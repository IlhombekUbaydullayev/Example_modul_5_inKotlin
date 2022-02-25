package com.example.example_project_modul_5in_kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.example_project_modul_5in_kotlin.R
import com.example.example_project_modul_5in_kotlin.activity.fragment.PageFourFragment
import com.example.example_project_modul_5in_kotlin.activity.fragment.PageOneFragment
import com.example.example_project_modul_5in_kotlin.activity.fragment.PageThreeFragment
import com.example.example_project_modul_5in_kotlin.activity.fragment.PageTwoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class ChatActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    private var firstFragment = PageOneFragment()
    private var secondFragment = PageTwoFragment()
    private var threeFragment = PageThreeFragment()
    private var fourFragment = PageFourFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        initViews()
    }

    private fun initViews() {

        bottomNavigationView = findViewById(R.id.bottom)
        replaceFragment(firstFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home_item -> replaceFragment(firstFragment)
                R.id.setting_second -> replaceFragment(secondFragment)
                R.id.setting_three -> replaceFragment(threeFragment)
                R.id.setting_four -> replaceFragment(fourFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.viewpager,fragment)
            transaction.commit()
        }
    }
}