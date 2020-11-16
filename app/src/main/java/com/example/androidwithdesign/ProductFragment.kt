package com.example.androidwithdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_product.view.*

class ProductFragment : Fragment() {
    private lateinit var viewpagerAdapter:ProductPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_product, container, false)

        viewpagerAdapter=ProductPagerAdapter(childFragmentManager)
        viewpagerAdapter.fragments=listOf(
            HomeFragment(),
            StoryFragment(),
            VideoFragment(),
            PopularWriterFragment()
        )

        view.tab_viewpager.adapter=viewpagerAdapter

        view.main_nav.setupWithViewPager(view.tab_viewpager)
        view.main_nav.apply{
            getTabAt(0)?.text="홈"
            getTabAt(1)?.text="스토리"
            getTabAt(2)?.text="동영상"
            getTabAt(3)?.text="인기 작가"
        }

        return view
    }
}