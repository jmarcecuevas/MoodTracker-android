package com.marcelocuevas.moodtracker.ui.fragment

import com.marcelocuevas.moodtracker.R

class DashboardFragment: GenericFragment() {

    override fun layout(): Int =
        R.layout.fragment_dashboard

    override fun init() {
        print("INIT")
    }


}