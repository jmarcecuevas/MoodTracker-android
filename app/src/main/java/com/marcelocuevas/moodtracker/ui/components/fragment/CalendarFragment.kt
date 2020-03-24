package com.marcelocuevas.moodtracker.ui.components.fragment

import com.marcelocuevas.moodtracker.R

class CalendarFragment: GenericFragment() {

    override fun layout(): Int =
        R.layout.fragment_calendar

    override fun init() {
        print("INIT")
    }


}