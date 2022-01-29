package com.example.exam

import androidx.annotation.DrawableRes

data class Person(
    @DrawableRes val pictureRes: Int,
    val name: String,
    val surname: String,
    val minimalInfo: String,
    val details: DetailsData
) {

    data class DetailsData(
        val birthday: String,
        val country: String,
        val achievements: List<String>,
    )
}