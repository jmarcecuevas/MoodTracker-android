package com.marcelocuevas.moodtracker.ui.components.fragment

import com.marcelocuevas.moodtracker.R

class MoodTrackerFragment: GenericFragment() {

    override fun layout(): Int =
        R.layout.fragment_moodtracker

    override fun init() {
        print("INIT")
    }


}