package com.marcelocuevas.moodtracker.domain

import com.google.gson.annotations.SerializedName
import java.util.*

data class ReportDTO (
    val date: Date,
    val status: String,
    @SerializedName("status_percentage")
    val statusPercentage: Int,
    val description: String,
    val activities: List<ActivityDTO> = emptyList()
): GenericDTO

data class ActivityDTO(
    val title: String,
    @SerializedName("text_color")
    val textColor: String,
    @SerializedName("background_color")
    val backgroundColor: String
): GenericDTO