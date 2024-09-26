package com.ivankuznetsov.sliderforvodovoz.data.repository

import com.ivankuznetsov.sliderforvodovoz.network.model.TopGoods
import kotlinx.coroutines.flow.Flow

interface SliderRepository {
    fun getSliderData(): Flow<TopGoods>
}