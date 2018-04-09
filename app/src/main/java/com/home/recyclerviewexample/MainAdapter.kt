package com.home.recyclerviewexample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_main.view.*

/**
 * @author Ting
 * @date 2018/4/9.
 */
class MainAdapter(val list: List<String>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    override fun onBindViewHolder(holder: MainViewHolder?, position: Int) {
        if (holder != null) {
            holder.itemView.mText.text = list[position]
        }
    }

    override fun getItemCount(): Int = list.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_main, parent, false)
        //val view = View.inflate(parent?.context, R.layout.item_main,null)
        return MainViewHolder(view)
    }

    class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}