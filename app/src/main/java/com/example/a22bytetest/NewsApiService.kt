package com.example.a22bytetest

import retrofit2.Call
import retrofit2.http.GET

interface NewsApiService {
    @GET("/posts")
    fun getHeadLines(): Call<MutableList<ListItem>>

}

