package com.example.androidwithdesign

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ClassBtmViewpagerAdapter (fm : FragmentManager)
    : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    var fragments = listOf<Fragment>()

    override fun getItem(position: Int): Fragment = when(position){
        0 -> ClassBtmFirstFragment()
        1 -> ClassBtmSecondFragment()
        2 -> ClassBtmThirdFragment()
        3 -> ClassBtmFourthFragment()
        else -> throw IllegalStateException("Unexpected position $position")
    }

    override fun getCount(): Int = fragments.size
}