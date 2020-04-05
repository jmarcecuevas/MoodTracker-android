package com.marcelocuevas.moodtracker.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.marcelocuevas.moodtracker.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
    }

    private fun setupViews() {
        setupBottomNav()
        setupAppBar()
    }

    private fun setupBottomNav() {
        navController = findNavController(this,
            R.id.fragmentHost
        )
        bottomNav.setupWithNavController(navController)
    }

    private fun setupAppBar() {
        val appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf (
                R.id.calendarFragment,
                R.id.dashboardFragment,
                R.id.relaxFragment,
                R.id.settingsFragment
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean = NavigationUI.navigateUp(navController, null)
}
