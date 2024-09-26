package com.ivankuznetsov.sliderforvodovoz.network.model

import com.google.gson.annotations.SerializedName


data class Category(
    @SerializedName("ID")
    var iD: Int = Int.MIN_VALUE,
    @SerializedName("NAME")
    var nAME: String = "",
    var data: MutableList<Good>? = null
)
