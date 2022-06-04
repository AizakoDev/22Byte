package com.example.a22bytetest.data

data class NewsApiResponse(
    var status: String,
    var totalResults: Int,
    var articles: List<ListItem>
)
