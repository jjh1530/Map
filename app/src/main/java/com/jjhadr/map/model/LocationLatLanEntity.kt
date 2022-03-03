package com.jjhadr.map.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LocationLatLanEntity(
    val latitude: Float,
    val longitude: Float
):Parcelable