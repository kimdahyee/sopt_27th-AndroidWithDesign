package com.example.androidwithdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_viewPager.adapter = MainPagerAdapter(supportFragmentManager)
        main_viewPager.offscreenPageLimit = 2
        main_viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                //navigation 메뉴 아이템 체크
                bottom_navigation.menu.getItem(position).isChecked = true
            }

        })

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_product -> main_viewPager.currentItem = 0
                R.id.nav_class -> main_viewPager.currentItem = 1
                R.id.nav_search -> main_viewPager.currentItem = 2
                R.id.nav_category -> main_viewPager.currentItem = 3
                R.id.nav_my -> main_viewPager.currentItem = 4
            }
            true
        }
    }
}