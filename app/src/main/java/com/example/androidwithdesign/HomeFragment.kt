package com.example.androidwithdesign

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    private lateinit var viewpagerAdapter: tabViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_home, container, false)

        viewpagerAdapter= tabViewPagerAdapter(childFragmentManager)
        viewpagerAdapter.fragments=listOf(
            MainBestProductFragment(),
            NewProductFragment(),
            BestReviewFragment(),
            WriterRecommendFragment()
        )

        view.product_viewpager.adapter=viewpagerAdapter

        view.tabLayout.setupWithViewPager(view.product_viewpager)

        for (i in 0 until view.tabLayout.tabCount) {
            val tab = (view.tabLayout.getChildAt(0) as ViewGroup).getChildAt(i)
            val p = tab.layoutParams as ViewGroup.MarginLayoutParams
            p.setMargins(Utils.dpToPx(9), 0, 0, 0)
        }

        view.tabLayout.apply{
            getTabAt(0)?.text="인기작품"
            getTabAt(1)?.text="최신작품"
            getTabAt(2)?.text="인기후기"
            getTabAt(3)?.text="작가추천"
        }

        return view
    }
}