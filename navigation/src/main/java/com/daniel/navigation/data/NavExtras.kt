package com.daniel.navigation.data

import android.os.Bundle
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NavExtras(
    val navExtra : Parcelable = Bundle.EMPTY
) : Parcelable{

}