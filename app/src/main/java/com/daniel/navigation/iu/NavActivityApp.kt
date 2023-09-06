package com.daniel.navigation.iu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.daniel.navigation.R
import com.daniel.navigation.data.NavExtras
import com.daniel.navigation.navigators.FragmentNavigation

class NavActivityApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_app)
        FragmentNavigation.navigationExtras = NavExtras(Bundle())
        FragmentNavigation.navigationEntryPoint(NavFragment::class.java)
    }
}