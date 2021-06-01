package com.vk59.drhoby.ui.main

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.viewpager2.widget.ViewPager2
import com.vk59.drhoby.config.AppConfig
import com.vk59.drhoby.model.Hobby

class MainViewModel : ViewModel() {
    private var hobbiesList: ArrayList<Hobby> = AppConfig.hobbiesList

    fun showHobbyPager(context: Context?, hobbyPager: ViewPager2) {
        hobbyPager.adapter = HobbyPagerAdapter(context!!, hobbiesList)
        hobbyPager.orientation = ViewPager2.ORIENTATION_VERTICAL
    }
}