package com.example.practice_thirtydayapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Haiku (
    val title: String,
    @DrawableRes val image: Int,
    val text: String
)
