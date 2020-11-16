package com.example.androidwithdesign

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ProductPagerAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){

    var fragments=listOf<Fragment>()

    override fun getItem(position: Int): Fragment =when(position){
        0 -> HomeFragment()
        1 -> StoryFragment()
        2 -> VideoFragment()
        3->PopularWriterFragment()
        else -> ProductFragment()
    }

    override fun getCount() : Int=fragments.size
}