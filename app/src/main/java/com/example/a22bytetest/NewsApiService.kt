package com.example.a22bytetest

import com.example.a22bytetest.data.ListItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    @GET("top-headlines")
    fun getHeadLines(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("q") q: String,
        @Query("apiKey") api_key: String
    ): Call<MutableList<ListItem>>

}
