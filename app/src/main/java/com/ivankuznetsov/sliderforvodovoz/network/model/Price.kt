package com.ivankuznetsov.sliderforvodovoz.network.model

import com.google.gson.annotations.SerializedName

data class Price(@SerializedName("PRICE") var price: Int = 0,
                 @SerializedName("OLD_PRICE") var oldPrice: Int = 0,
    @SerializedName("QUANTITY_FROM") var startQuantity: Int = 0,
                 @SerializedName("QUANTITY_TO") var finishPrice: Int = 0,
)