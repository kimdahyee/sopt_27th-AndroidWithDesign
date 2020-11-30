package com.example.androidwithdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_class.*

class ClassFragment : Fragment() {
    private lateinit var topviewpagerAdapter: ClassTopViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_class, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        topviewpagerAdapter = ClassTopViewPagerAdapter(childFragmentManager)
        topviewpagerAdapter.fragments = listOf(
            ClassTopFirstFragment(),
            ClassTopSecondFragment(),
            ClassTopThirdFragment(),
            ClassTopFourthFragment()
        )

        class_top_tab_viewpager.adapter = topviewpagerAdapter

        class_top_tab.setupWithViewPager(class_top_tab_viewpager)
        class_top_tab.apply{
            getTabAt(0)?.text = "홈"
            getTabAt(1)?.text = "스토리"
            getTabAt(2)?.text = "동영상"
            getTabAt(3)?.text = "인기 작가"
        }
    }
}
