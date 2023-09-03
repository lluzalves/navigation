package com.daniel.navigation

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.daniel.navigation.iu.NavActivityApp
import com.daniel.navigation.navigators.NavActivityNavigation

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navClass = Class.forName(NavActivityApp::class.java.name)
        NavActivityNavigation.navigationEntryPoint(navClass)
    }
}