package com.ivankuznetsov.sliderforvodovoz.network.model

import com.google.gson.annotations.SerializedName


data class TopGoods(
    var status: String = "",
    var message: String = "",
    @SerializedName("TOVARY")
    var categories: MutableList<Category> = mutableListOf())

