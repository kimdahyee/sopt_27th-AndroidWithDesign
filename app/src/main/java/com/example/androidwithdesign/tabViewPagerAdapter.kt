package com.example.androidwithdesign

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class tabViewPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    var fragments = listOf<Fragment>()
    override fun getItem(position: Int): Fragment = when(position){
        0->MainBestProductFragment()
        1->NewProductFragment()
        2->BestReviewFragment()
        3->WriterRecommendFragment()
        else->throw IllegalStateException("Unexpected position $position")
    }
    override fun getCount(): Int = fragments.size
}
