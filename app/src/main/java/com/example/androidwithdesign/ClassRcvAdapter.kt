package com.example.androidwithdesign

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ClassRcvAdapter (private val context : Context) : RecyclerView.Adapter<ClassRcvViewHolder>(){
    var data = listOf<ClassRcvData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassRcvViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.class_item_list, parent, false)

        return ClassRcvViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ClassRcvViewHolder, position: Int) {
        holder.onBind(data[position])
    }
}