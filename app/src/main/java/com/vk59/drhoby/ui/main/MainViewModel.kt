package com.vk59.drhoby.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vk59.drhoby.config.AppConfig
import com.vk59.drhoby.model.Hobby

class MainViewModel : ViewModel() {
    var hobbiesList: ArrayList<Hobby> = AppConfig.hobbiesList
    var hobbiesData = MutableLiveData<ArrayList<Hobby>>(hobbiesList)

    init {
//        hobbiesData.postValue(hobbiesList)
    }
}