package com.daniel.navigation

import com.daniel.navigation.data.NavExtras

interface NavFeature<N> {
    fun navigationEntryPoint(navClass: Class<*>): N?
    val navigationExtras: NavExtras?
}