package edu.uksw.fti.pam.pam_activity_intent.models

import edu.uksw.fti.pam.pam_activity_intent.R

data class FiturData (

        val title :String,
        val reting : Float,
        val desc : String,
        val imgUri :Int
)

val FiturList = listOf(
    FiturData(
        "Nakes",
        4.0f,
        "Nakes...",
        R.drawable.fitur1
    ),
    FiturData(
        "Nakes",
        4.0f,
        "Nakes...",
        R.drawable.fitur2
    ),
    FiturData(
        "Nakes",
        4.0f,
        "Nakes...",
        R.drawable.fitur3
    ),
    FiturData(
        "Nakes",
        4.0f,
        "Nakes...",
        R.drawable.fitur4
    ),
    FiturData(
        "Nakes",
        4.0f,
        "Nakes...",
        R.drawable.fitur5
    ),
    FiturData(
        "Nakes",
        4.0f,
        "Nakes...",
        R.drawable.fitur6
    ),
)
