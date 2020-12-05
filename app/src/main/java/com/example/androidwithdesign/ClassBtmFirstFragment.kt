package com.example.androidwithdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_class_btm_first.*

class ClassBtmFirstFragment : Fragment() {

    private lateinit var classAdapter : ClassRcvAdapter
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_class_btm_first, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView(view)

    }

    fun initView(view:View){
        classAdapter = ClassRcvAdapter(view.context)
        recyclerView = view.findViewById(R.id.class_rcv)
        class_rcv.layoutManager = GridLayoutManager(activity, 2)
        class_rcv.adapter = classAdapter

        classAdapter.data = mutableListOf(
            ClassRcvData("디저트","시즌 할인 무화과 무화과 왕 큰 컵케이크","홍길동","58%","5000원"),
            ClassRcvData("핸드폰 케이스","시즌 할인 무화과 무화과 왕 큰 컵케이크","홍길동","58%","5000원"),
            ClassRcvData("비누","시즌 할인 무화과 무화과 왕 큰 컵케이크","홍길동","58%","5000원"),
            ClassRcvData("핸드폰 케이스","시즌 할인 무화과 무화과 왕 큰 컵케이크","홍길동","58%","5000원"),
            ClassRcvData("디저트","시즌 할인 무화과 무화과 왕 큰 컵케이크","홍길동","58%","5000원"),
            ClassRcvData("핸드폰 케이스","시즌 할인 무화과 무화과 왕 큰 컵케이크","홍길동","58%","5000원")
        )

        classAdapter.notifyDataSetChanged()
    }
}