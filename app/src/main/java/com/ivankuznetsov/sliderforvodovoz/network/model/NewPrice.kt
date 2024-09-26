package com.ivankuznetsov.sliderforvodovoz.network.model

import com.google.gson.annotations.SerializedName

data class NewPrice (
    @SerializedName("Price")
    var price: String = "",
    @SerializedName("DescPrice")
    var descPrice: String? = "",
)