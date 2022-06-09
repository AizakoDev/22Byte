package com.example.a22bytetest.data

data class ListItem(
    val source: Source? = null,
    var author: String,
    var title: String,
    var description: String,
    var url: String,
    var urlToImage: String,
    var publishedAt: String,
    var content: String
)