package com.ivankuznetsov.sliderforvodovoz.network.model

import com.google.gson.annotations.SerializedName

data class Availability(
    @SerializedName("NAME")
    var name: String = "",
    @SerializedName("CVET")
    var color: String = "",
    @SerializedName("X")
    var x: String = "",
    @SerializedName("Y")
    var y: String = "",
    @SerializedName("Z")
    var z: String = ""
)