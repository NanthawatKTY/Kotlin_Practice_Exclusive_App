package com.example.kotlinpracticeexclusiveapp.data

import android.widget.Spinner
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import org.w3c.dom.Text

data class ConduitInfo(
    val cableType: String,
    val cableSize: Double,
    val cableAmount: Int
) {
}