package com.example.newsapp.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.newsapp.ui.fragment.GeneralMessageFragment
import com.example.newsapp.ui.fragment.SavedMessageFragment
/**
 * @author by Amin Majlesi
 */
class ViewPagerAdapter(fm: FragmentManager, var tabCount: Int) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> SavedMessageFragment()
            1 -> GeneralMessageFragment()
            else -> GeneralMessageFragment()
        }
    }

    override fun getCount(): Int {
        return tabCount
    }

    override fun getPageTitle(position: Int): CharSequence {
        return "Tab " + (position + 1)
    }
}
