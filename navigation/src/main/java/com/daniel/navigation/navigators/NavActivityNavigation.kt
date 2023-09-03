package com.daniel.navigation.navigators

import android.content.Intent
import com.daniel.navigation.NavFeature
import com.daniel.navigation.data.NavExtras
import com.daniel.navigation.loader.activity.loadIntentOrNull

object NavActivityNavigation : NavFeature<Intent> {
    override fun navigationEntryPoint(navClass: Class<*>): Intent? {
        val packageName = navClass.`package`.name
        val classPath = navClass.name
        val navActivityIntent = Intent(Intent.ACTION_VIEW).setClassName(packageName, classPath)
        return classPath.run {
            loadIntentOrNull(
                intent = navActivityIntent,
                className = this,
                packageName = packageName
            )
        }
    }

    override val navigationExtras: NavExtras?
        get() = NavExtras()

}