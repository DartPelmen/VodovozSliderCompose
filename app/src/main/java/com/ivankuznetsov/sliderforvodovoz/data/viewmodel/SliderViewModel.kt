package com.ivankuznetsov.sliderforvodovoz.data.viewmodel

import androidx.lifecycle.ViewModel
import com.ivankuznetsov.sliderforvodovoz.data.repository.SliderRepository
import com.ivankuznetsov.sliderforvodovoz.network.model.TopGoods
import kotlinx.coroutines.flow.Flow

class SliderViewModel(private val sliderRepository: SliderRepository): ViewModel() {
    private val data = sliderRepository.getSliderData()
    fun getSliderData(): Flow<TopGoods>{
         return data
    }
}