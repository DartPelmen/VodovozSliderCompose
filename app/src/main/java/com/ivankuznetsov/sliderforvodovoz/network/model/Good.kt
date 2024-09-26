package com.ivankuznetsov.sliderforvodovoz.network.model

import com.google.gson.annotations.SerializedName


data class Good (
    @SerializedName("ID")
    var id: String = "",
    @SerializedName("IBLOCK_ID")
    var iblockId: String = "",
    @SerializedName("NAME")
    var name: String = "",
    @SerializedName("DATE_ACTIVE_FROM")
    var dateActiveFrom: String = "",
    @SerializedName("DETAIL_PICTURE")
    var detailPicture: String= "",

    @SerializedName("PROPERTY_NEWPRODUCT_VALUE")
    var propertyNewProductValue: String = "",
    @SerializedName("PROPERTY_NEWPRODUCT_ENUM_ID")
    var propertyNewProductEnumId: String = "",
    @SerializedName("PROPERTY_NEWPRODUCT_VALUE_ID")
    var propertyNewProductValueId: String = "",

    @SerializedName("PROPERTY_PODAROK_VALUE")
    var propertyGiftValue: String = "",
    @SerializedName("PROPERTY_PODAROK_ENUM_ID")
    var propertyGiftEnumId: String = "",
    @SerializedName("PROPERTY_PODAROK_VALUE_ID")
    var propertyGiftValueId: String = "",

    @SerializedName("PROPERTY_SALELEADER_VALUE")
    var propertySaleLeaderValue: String =  "",
    @SerializedName("PROPERTY_SALELEADER_ENUM_ID")
    var propertySaleLeaderEnumId: String =  "",
    @SerializedName("PROPERTY_SALELEADER_VALUE_ID")
    var propertySaleLeaderValueId: String =  "",

    @SerializedName("PROPERTY_TSENA_ZA_EDINITSU_TOVARA_VALUE")
    var oneUnitCostValue: Int = -1,
    @SerializedName("PROPERTY_TSENA_ZA_EDINITSU_TOVARA_VALUE_ID")
    var oneUnitCostValueId: String = "",

    @SerializedName("PROPERTY_RATING_VALUE")
    var ratingValue: Double = Double.NEGATIVE_INFINITY,
    @SerializedName("PROPERTY_RATING_VALUE_ID")
    var pROPERTY_RATING_VALUE_ID: String = "",

    @SerializedName("CATALOG_QUANTITY")
    var catalogQuantity: Int = -1,
    @SerializedName("CATALOG_QUANTITY_TRACE")
    var catalogQuantityTrace: String = "",
    @SerializedName("CATALOG_QUANTITY_TRACE_ORIG")
    var catalogQuantityTraceOrig: String = "",

    @SerializedName("CATALOG_WEIGHT")
    var catalogWeight: String = "",

    @SerializedName("CATALOG_VAT_ID")
    var catalogVatId: String = "",
    @SerializedName("CATALOG_VAT_INCLUDED")
    var catalogVatIncluded: String = "",
    @SerializedName("CATALOG_CAN_BUY_ZERO")
    var catalogCanBuyZero: String = "",
    @SerializedName("CATALOG_CAN_BUY_ZERO_ORIG")
    var catalogCanBuyZeroOrig: String = "",

    @SerializedName("CATALOG_PURCHASING_PRICE")
    var catalogPushcatingPrice: String = "",
    @SerializedName("CATALOG_PURCHASING_CURRENCY")
    var catalogPushcatingCurrency: String = "",

    @SerializedName("CATALOG_QUANTITY_RESERVED")
    var catalogQuantityReserved: String = "",

    @SerializedName("CATALOG_SUBSCRIBE")
    var catalogSubscribe: String = "",
    @SerializedName("CATALOG_SUBSCRIBE_ORIG")
    var catalogSubscribeOrig: String = "",

    @SerializedName("CATALOG_WIDTH")
    var catalogWidth: String = "",
    @SerializedName("CATALOG_LENGTH")
    var catalogLength: String = "",
    @SerializedName("CATALOG_HEIGHT")
    var catalogHeight: String = "",
    @SerializedName("CATALOG_MEASURE")
    var catalogMeasure: String = "",

    @SerializedName("CATALOG_TYPE")
    var catalogType: String = "",
    @SerializedName("CATALOG_AVAILABLE")
    var catalogAvailable: String = "",
    @SerializedName("CATALOG_BUNDLE")
    var catalogBundle: String = "",

    @SerializedName("CATALOG_PRICE_TYPE")
    var catalogPriceType: String = "",
    @SerializedName("CATALOG_RECUR_SCHEME_LENGTH")
    var catalogRecurSchemeLength: String = "",
    @SerializedName("CATALOG_RECUR_SCHEME_TYPE")
    var catalogRecurSchemeType: String = "",

    @SerializedName("CATALOG_TRIAL_PRICE_ID")
    var catalogTrialPriceId: String = "",

    @SerializedName("CATALOG_WITHOUT_ORDER")
    var catalogWithoutOrder: String = "",

    @SerializedName("CATALOG_SELECT_BEST_PRICE")
    var catalogSelectbestPrice: String = "",

    @SerializedName("CATALOG_NEGATIVE_AMOUNT_TRACE")
    var catalogNegativeAmountTrace: String = "",
    @SerializedName("CATALOG_NEGATIVE_AMOUNT_TRACE_ORIG")
    var catalogNegativeAmountTraceOrig: String = "",

    @SerializedName("CATALOG_VAT")
    var catalogWhat: String = "",

    @SerializedName("EXTENDED_PRICE")
    var eXTENDED_PRICE: MutableList<Price> = mutableListOf(),

    @SerializedName("COUTCOMMENTS")
    var commentCount: String = "",

    @SerializedName("PROPERTY_ZALOG_VALUE")
    var zalogValue: Int = -1,

    @SerializedName("FAVORITE")
    var favorite: Boolean = false,

    @SerializedName("KOFFICIENT")
    var coefficient: Int = -1,

    @SerializedName("NALICHIE")
    var nALICHIE: Availability? = null,

    @SerializedName("EDINICAIZMERENIYA")
    var measurenemt: String = "",

    @SerializedName("MORE_PHOTO")
    var morePhoto: MorePhoto? = null,

    @SerializedName("NewPrice")
    var newPrice: NewPrice? = null
)