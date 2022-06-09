package com.example.a22bytetest

import android.content.Context
import android.provider.Settings.Global.getString
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a22bytetest.data.ListItem
import com.example.a22bytetest.data.NewsApiResponse
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

class ServiceGenerator(context: Context) {
//        private val client = OkHttpClient.Builder().build()
    val contex = context
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://newsapi.org/v2/")
        .addConverterFactory(GsonConverterFactory.create())
//        .client(client)
        .build()

    fun getListItem(listener: onFetchDataListner, category: String, q: String) {
        val newsApiService: NewsApiService = retrofit.create(NewsApiService::class.java)
        var call: Call<NewsApiResponse>
//        call = newsApiService.getHeadLines()


//
//        /**   ListItem = NewsHeadlines */
//        //https://newsapi.org/docs/endpoints/top-headlines
//        call.enqueue(object : retrofit2.Callback<MutableList<ListItem>>{
//            override fun onResponse(call: Call<MutableList<ListItem>>, response: Response<MutableList<ListItem>>) {
//                if (!response.isSuccessful){
//                    Toast.makeText(contex, "error", Toast.LENGTH_LONG).show()
//                }
//
//            }
//
//            override fun onFailure(call: Call<MutableList<ListItem>>, t: Throwable) {
//                TODO("Not yet implemented")
//            }
//
//        })
//
//    }


    fun <T> buildService(service: Class<T>): T {
        return retrofit.create(service)
    }

}

interface onFetchDataListner{
    fun onFetchData(list: List<ListItem>, message: String)
    fun onError(message: String)
}

interface NewsApiService {

    @GET("top-headlines")
    fun getHeadLines(
        @Query("country") country: String,
        @Query("category") category: String,
        @Query("q") q: String,
        @Query("apiKey") api_key: String
    ): Call<MutableList<ListItem>>

}}