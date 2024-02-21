package com.example.dailyquotesapp.data

import com.example.dailyquotesapp.R
import com.example.dailyquotesapp.model.Quote

class DataSource
{
    fun loadQuotes(): List<Quote>
    {
        return listOf<Quote>(
            Quote(R.string.author1, R.string.quotes1, R.drawable.image1),
            Quote(R.string.author2, R.string.quotes2, R.drawable.image2),
            Quote(R.string.author3, R.string.quotes3, R.drawable.image3),
            Quote(R.string.author4, R.string.quotes4, R.drawable.image4),
            Quote(R.string.author5, R.string.quotes5, R.drawable.image5),
            Quote(R.string.author6, R.string.quotes6, R.drawable.image6),
            Quote(R.string.author7, R.string.quotes7, R.drawable.image7),
            Quote(R.string.author8, R.string.quotes8, R.drawable.image8),
            Quote(R.string.author9, R.string.quotes9, R.drawable.image9),
            Quote(R.string.author10, R.string.quotes10, R.drawable.image10),

        )
    }
}