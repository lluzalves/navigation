package com.daniel.navigation.iu

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.daniel.navigation.R
import com.daniel.navigation.navigators.ActivityNavigation

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.S)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navClass = Class.forName(NavActivityApp::class.java.name)
        ActivityNavigation.navigationEntryPoint(navClass).run {
            startActivity(this)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        finish()
    }
}