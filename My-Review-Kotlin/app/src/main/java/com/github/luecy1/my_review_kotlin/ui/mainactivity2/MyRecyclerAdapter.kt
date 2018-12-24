package com.github.luecy1.my_review_kotlin.ui.mainactivity2

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.github.luecy1.my_review_kotlin.R
import com.github.luecy1.my_review_kotlin.data.Row

class MyRecyclerAdapter(
    private val context:Context,
    private val list:List<Row>
) : RecyclerView.Adapter<ViewHolder>() {

    //　Viewを作成する
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.recycle_item,parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.item_text.text = list[position].text
    }
}