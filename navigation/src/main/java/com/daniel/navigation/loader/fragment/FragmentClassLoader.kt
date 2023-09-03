package com.daniel.navigation.loader.fragment

import androidx.fragment.app.Fragment
import com.daniel.navigation.exception.NavigatorException
import com.daniel.navigation.loader.loadClassOrNull

internal fun String.loadFragment(): Fragment? =
    try {
        this.loadClassOrNull<Fragment>()?.newInstance()
    } catch (exception: ClassNotFoundException) {
        throw NavigatorException("Fragment does not exist: ${exception.localizedMessage}",Throwable(exception.exception))
    }