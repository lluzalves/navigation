package com.daniel.navigation.navigators

import android.content.Intent
import com.daniel.navigation.NavFeature
import com.daniel.navigation.data.NavExtras
import com.daniel.navigation.loader.activity.loadIntentOrThrowException


private const val PACKAGE = "com.daniel.navigation"

object ActivityNavigation : NavFeature<Intent> {
    override fun navigationEntryPoint(navClass: Class<*>): Intent? {
        val classPath = navClass.name
        val navActivityIntent = Intent(Intent.ACTION_VIEW).setClassName(PACKAGE, classPath)
        return classPath.run {
            loadIntentOrThrowException(
                intent = navActivityIntent,
                className = this,
                packageName = PACKAGE
            )
        }
    }

    override var navigationExtras: NavExtras?
        get() = this.navigationExtras
        set(value) {}

}