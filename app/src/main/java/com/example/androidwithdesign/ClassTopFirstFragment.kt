package com.example.androidwithdesign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_class_top_first.*

class ClassTopFirstFragment : Fragment() {
    private lateinit var btmviewpagerAdapter: ClassBtmViewpagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_class_top_first, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btmviewpagerAdapter = ClassBtmViewpagerAdapter(childFragmentManager)
        btmviewpagerAdapter.fragments = listOf(
            ClassBtmFirstFragment(),
            ClassBtmSecondFragment(),
            ClassBtmThirdFragment(),
            ClassBtmFourthFragment()
        )

        class_btm_tab_viewpager.adapter = btmviewpagerAdapter

        class_btm_tab.setupWithViewPager(class_btm_tab_viewpager)
        class_btm_tab.apply{
            getTabAt(0)?.text = "인기 작품"
            getTabAt(1)?.text = "최신 작품"
            getTabAt(2)?.text = "인기 후기"
            getTabAt(3)?.text = "작가 추천"
        }

        for (i in 0 until class_btm_tab.getTabCount()) {
            val tab = (class_btm_tab.getChildAt(0) as ViewGroup).getChildAt(i)
            val p = tab.layoutParams as MarginLayoutParams
            p.setMargins(4, 0, 4, 0)
            tab.requestLayout()
        }
    }
}