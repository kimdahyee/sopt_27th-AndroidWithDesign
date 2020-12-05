package com.example.androidwithdesign

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClassRcvViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView){
    private val category : TextView = itemView.findViewById(R.id.class_rcv_category)
    private val title : TextView = itemView.findViewById(R.id.class_rcv_product_name)
    private val writer : TextView = itemView.findViewById(R.id.class_rcv_writer)
    private val discount : TextView = itemView.findViewById(R.id.class_rcv_dc_rate)
    private val price : TextView = itemView.findViewById(R.id.class_rcv_price)

    fun onBind(data: ClassRcvData){
        category.text = data.category
        title.text = data.title
        writer.text = data.writer
        discount.text = data.discount
        price.text = data.price
    }

}