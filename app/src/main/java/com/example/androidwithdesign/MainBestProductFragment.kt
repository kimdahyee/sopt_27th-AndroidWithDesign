package com.example.androidwithdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainBestProductFragment : Fragment() {

    private lateinit var productAdapter:ProductAdapter
    lateinit var rcv_view:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_main_best_product, null)

        productAdapter= ProductAdapter(requireContext())
        rcv_view=view.findViewById(R.id.rcv_product!!)as RecyclerView
        rcv_view.adapter=productAdapter
        rcv_view.layoutManager=GridLayoutManager(context,2)

        productAdapter.data=mutableListOf(
            ProductData("디저트","시즌 할인 무화과 무화과 왕큰 컵케이크","홍길동","58%", "5000원"),
            ProductData("디저트","시즌 할인 무화과 무화과 왕큰 컵케이크","홍길동","58%", "5000원"),
            ProductData("디저트","시즌 할인 무화과 무화과 왕큰 컵케이크","홍길동","58%", "5000원"),
            ProductData("디저트","시즌 할인 무화과 무화과 왕큰 컵케이크","홍길동","58%", "5000원"),
            ProductData("디저트","시즌 할인 무화과 무화과 왕큰 컵케이크","홍길동","58%", "5000원"),
            ProductData("디저트","시즌 할인 무화과 무화과 왕큰 컵케이크","홍길동","58%", "5000원")
        )

        productAdapter.notifyDataSetChanged()

        return view
    }
}