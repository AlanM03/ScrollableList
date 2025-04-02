package com.example.scrollableproject.data

import com.example.scrollableproject.R
import com.example.scrollableproject.model.Food

class Datasource {
    fun loadFoods(): List<Food> {
        return listOf(
            Food(R.string.caption1, R.drawable.image1),
            Food(R.string.caption2, R.drawable.image2),
            Food(R.string.caption3, R.drawable.image3),
            Food(R.string.caption4, R.drawable.image4),
            Food(R.string.caption5, R.drawable.image5),
            Food(R.string.caption6, R.drawable.image6),
            Food(R.string.caption7, R.drawable.image7),
            Food(R.string.caption8, R.drawable.image8),
            Food(R.string.caption9, R.drawable.image9),
            Food(R.string.caption10, R.drawable.image10)
        )
    }
}