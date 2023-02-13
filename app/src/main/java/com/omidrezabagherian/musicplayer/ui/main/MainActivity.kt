package com.omidrezabagherian.musicplayer.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.omidrezabagherian.musicplayer.R
import com.omidrezabagherian.musicplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        setConfigNavigation()

        setContentView(mainBinding.root)
    }

    private fun setConfigNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_main_host) as NavHostFragment
        val navController = navHostFragment.navController
    }
}