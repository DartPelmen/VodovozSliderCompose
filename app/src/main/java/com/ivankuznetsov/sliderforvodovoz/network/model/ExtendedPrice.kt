package com.ivankuznetsov.sliderforvodovoz.network.model

import com.google.gson.annotations.SerializedName

data class ExtendedPrice (
    @SerializedName("PRICE")
    var price: Int = 0,
    @SerializedName("OLD_PRICE")
    var oldPrice: Int = 0,
    @SerializedName("QUANTITY_FROM")
    var quantityFrom: Int = 0,
    @SerializedName("QUANTITY_TO")
    var quantityTo: Int = 0)
