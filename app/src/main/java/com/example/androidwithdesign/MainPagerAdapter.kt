package com.example.androidwithdesign

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

/**
 * Created By kimdahyee
 * on 11월 15일, 2020
 */
 
class MainPagerAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> ProductFragment()
            1 -> ClassFragment()
            2 -> SearchFragment()
            3 -> CategoryFragment()
            else -> MyFragment()
        }
    }

    override fun getCount() = 5
}