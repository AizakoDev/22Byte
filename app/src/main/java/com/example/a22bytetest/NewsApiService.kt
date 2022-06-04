package com.example.a22bytetest

import retrofit2.Call
import retrofit2.http.GET

interface NewsApiService {

    @GET("top-headlines")
    fun getHeadLines(): Call<MutableList<ListItem>>

}


////    @GET("/v2/top-headlines/sources?apiKey=3bb71e0155f74c689223311ea2b68c50")
////    fun getHeadLines(): Call<MutableList<ListItem>>
//
//
//in service
////https://newsapi.org
//
//data class ListItem(
//    var status: String? = null,
//    var sources: String? = null,
//    var id: String? = null, //Название источника новостей
//    var description: String? = null, //Описание источника новостей
//    var url: String? = null, //URL домашней страницы
//    var category: String? = null, //Тип новостей, которые можно ожидать от этого источника новостей.
//    var language: String? = null, //Язык, на котором пишет этот источник новостей.
//    var country: String? = null, //Страна, в которой основан этот источник новостей
////    var sources: MutableList<String>? = null
//)
//
//// 3bb71e0155f74c689223311ea2b68c50 key api https://newsapi.org/docs/get-started - стар для этого апи