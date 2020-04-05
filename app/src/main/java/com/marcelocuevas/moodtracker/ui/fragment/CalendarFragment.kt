package com.marcelocuevas.moodtracker.ui.fragment

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.marcelocuevas.moodtracker.R
import com.shrikanthravi.collapsiblecalendarview.widget.CollapsibleCalendar
import kotlinx.android.synthetic.main.fragment_calendar.*

class CalendarFragment: GenericFragment() {

    override fun layout(): Int =
        R.layout.fragment_calendar

    override fun init() {
        setupCalendarView()
        setupRecyclerView()
    }

    private fun setupCalendarView() {
        calendarView.setCalendarListener(object: CollapsibleCalendar.CalendarListener {
            override fun onDayChanged() {

            }

            override fun onClickListener() {

            }

            override fun onDaySelect() {
                if (calendarView.expanded) {
                    calendarView.collapse(400)
                }
            }

            override fun onItemClick(v: View) {

            }

            override fun onDataUpdate() {

            }

            override fun onMonthChange() {

            }

            override fun onWeekChange(position: Int) {

            }
        })
    }

    private fun setupRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.VERTICAL, false)
    }
}