package edu.uksw.fti.pam.pam_activity_intent.datastore

import android.icu.text.CaseMap.Title

data class Puppy(
    val id: Int,
    val title: String,
    val sex:String,
    val age: Int,
    val description: String,
    val puppyImageId: Int = 0


)
