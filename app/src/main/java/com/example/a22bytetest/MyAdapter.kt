package com.example.a22bytetest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a22bytetest.databinding.RecyclerItemBinding

class MyAdapter(val listItems: MutableList<ListItem>) : RecyclerView.Adapter<MyAdapter.MyHolder>() {
//    val listItems = ArrayList<ListItem>()

    class MyHolder(item: View) : RecyclerView.ViewHolder(item) {
        val vb = RecyclerItemBinding.bind(item)

        fun bind(listItem: ListItem) = with(vb) {
            textViewTitle.text = listItem.id
            textViewDescription.text = listItem.body

            itemView.setOnClickListener{
                //todo
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(listItems[position])
    }

    override fun getItemCount(): Int {
        return listItems.size
    }



}