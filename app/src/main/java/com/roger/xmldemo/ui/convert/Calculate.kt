package com.roger.xmldemo.ui.convert

import java.math.RoundingMode
import java.text.DecimalFormat

fun convertValue(standard: Boolean, value: Double): String {
    var total = 0.0
    return if(standard) {
        total = (value / .39370)
        refineValue(total)
    } else {
        total =(value * .39370)
        refineValue(total)
    }
}

fun convertTemp(standard: Boolean, value: Double): String {
    var total = 0.0
    return if(standard) {
        total = ((value - 32) * 5 / 9)
        refineValue(total)
    } else {
        total = ((value * 9 / 5) + 32)
        refineValue(total)
    }
}

fun refineValue(value: Double): String {
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.CEILING
    return df.format(value)
}