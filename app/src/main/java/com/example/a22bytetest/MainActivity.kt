package com.example.a22bytetest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a22bytetest.data.ListItem
import com.example.a22bytetest.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private lateinit var vb: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        val view = vb.root
        setContentView(view)




//        val serviceGenerator = ServiceGenerator.buildService(NewsApiService::class.java)
//        val call = serviceGenerator.getHeadLines("ru", "sports", "q", getString(R.string.api_key))
//
//        call.enqueue(object : retrofit2.Callback<MutableList<ListItem>>{
//            override fun onResponse(call: Call<MutableList<ListItem>>, response: Response<MutableList<ListItem>>) {
//                if (response.isSuccessful){
//                    vb.recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
//                    vb.recyclerView.adapter = MyAdapter(response.body()!!)
//                }
//            }
//            override fun onFailure(call: Call<MutableList<ListItem>>, t: Throwable) {
//                t.printStackTrace()
//                Log.e("error", t.message.toString())
//            }
//
//        })


    }


    fun showToast() {
        //текстовое уведомление
        val toast = Toast.makeText(
            this,
            "todo",
            Toast.LENGTH_SHORT
        )
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.show()
    }
}

