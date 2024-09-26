package com.ivankuznetsov.sliderforvodovoz.network

import com.ivankuznetsov.sliderforvodovoz.network.model.TopGoods
import retrofit2.http.GET
import retrofit2.http.Query


interface SliderAPI {
    @GET("/newmobile/glavnaya/super_top.php")
    suspend fun getTopGoods(@Query("action") action: String): TopGoods
}