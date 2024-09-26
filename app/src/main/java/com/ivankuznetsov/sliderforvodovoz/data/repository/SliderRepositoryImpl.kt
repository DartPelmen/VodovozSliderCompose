package com.ivankuznetsov.sliderforvodovoz.data.repository

import android.util.Log
import com.ivankuznetsov.sliderforvodovoz.network.SliderAPI
import com.ivankuznetsov.sliderforvodovoz.network.model.TopGoods
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Retrofit


class SliderRepositoryImpl(private val source: Retrofit) : SliderRepository {
    override fun getSliderData(): Flow<TopGoods> {

            return flow {
                val res = source.create(SliderAPI::class.java).getTopGoods("topglav")
                Log.d("SLIDER", res.status)
                Log.d("SLIDER", res.message)
                res.categories.forEach {
                    it.data?.forEach {
                        it.eXTENDED_PRICE.forEach {
                            Log.d("SLODER", "PRICE")
                            Log.d("SLIDER", it.price.toString())
                        }
                    }
                }
                Log.d("SLIDER", res.categories.size.toString())

                emit(res)
            }
    }

}