package com.ivankuznetsov.sliderforvodovoz.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
* Одиночка для сетевого взаимодействия
 * */
object NetworkObject {
    @Volatile
    var retrofit = Retrofit.Builder()
        .baseUrl("https://szorin.vodovoz.ru")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}