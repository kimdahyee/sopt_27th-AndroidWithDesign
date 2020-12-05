package com.example.androidwithdesign

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val category:TextView=itemView.findViewById(R.id.text_category)
    private val name:TextView=itemView.findViewById(R.id.text_name)
    private val writer:TextView=itemView.findViewById(R.id.text_writer)
    private val sale:TextView=itemView.findViewById(R.id.text_sale)
    private val price:TextView=itemView.findViewById(R.id.text_price)

    fun onBind(data:ProductData){
        category.text=data.category
        name.text=data.name
        writer.text=data.writer
        sale.text=data.sale
        price.text=data.price
    }
}
