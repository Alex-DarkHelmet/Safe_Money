package com.example.safe_money.domain

import android.media.Image

data class CategoryItem(
    val id: Int,
    val name: String,
    val sumOfSpend: Int,
    val image: Image
)
