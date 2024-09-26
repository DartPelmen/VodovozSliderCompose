package com.ivankuznetsov.sliderforvodovoz.network.model

import com.google.gson.annotations.SerializedName

data class MorePhoto(@SerializedName("VALUE")
                     val photoUrlList: MutableList<String> = mutableListOf())