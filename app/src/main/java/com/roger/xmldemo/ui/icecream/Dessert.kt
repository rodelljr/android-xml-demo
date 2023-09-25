package com.roger.xmldemo.ui.icecream

import com.roger.xmldemo.R
data class Dessert(val icon: Int, val name: String,
                   val desertType: String)

val getDesserts = listOf(
    Dessert(R.drawable.baseline_face_24, "Chocolate Chip", "Cookie"),
    Dessert(R.drawable.baseline_check_24, "Oatmeal Raisin", "Cookie"),
    Dessert(R.drawable.baseline_arrow_back_24, "Rocky Road", "Ice Cream"),
    Dessert(R.drawable.baseline_favorite_24, "Bunny Tracks", "Ice Cream"),
    Dessert(R.drawable.baseline_email_24, "Apple Crisp", "Pie"),
    Dessert(R.drawable.baseline_home_24, "Banana Cream", "Pie"),
    Dessert(R.drawable.baseline_create_24, "Snicker Doodle", "Cookie"),
    Dessert(R.drawable.baseline_info_24, "German Chocolate", "Cake"),
    Dessert(R.drawable.baseline_location_on_24, "Red Velvet", "Cake"),
    Dessert(R.drawable.baseline_done_24, "Vanilla", "Ice Cream"),

)