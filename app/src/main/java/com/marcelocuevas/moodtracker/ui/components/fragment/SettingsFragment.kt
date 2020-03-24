package com.marcelocuevas.moodtracker.ui.components.fragment

import com.marcelocuevas.moodtracker.R

class SettingsFragment: GenericFragment() {

    override fun layout(): Int =
        R.layout.fragment_settings

    override fun init() {
        print("INIT")
    }
}