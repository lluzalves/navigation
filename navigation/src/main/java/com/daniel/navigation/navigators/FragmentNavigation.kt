package com.daniel.navigation.navigators

import androidx.fragment.app.Fragment
import com.daniel.navigation.NavFeature
import com.daniel.navigation.data.NavExtras
import com.daniel.navigation.loader.fragment.loadFragment

object FragmentNavigation : NavFeature<Fragment> {
    override fun navigationEntryPoint(navClass: Class<*>): Fragment? {
        val classPath = navClass.name
        return classPath.run {
            loadFragment()
        }
    }

    override var navigationExtras: NavExtras? = null
        get() = NavExtras()

}