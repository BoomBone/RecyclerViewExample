package com.home.recyclerviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_main.view.*

class MainActivity : AppCompatActivity() {
    val items = listOf(
            "子曰：苟志于仁矣，无恶也。",
            "君子和而不同，小人同而不和。",
            "兴于诗，立于礼，成于乐。",
            "敏而好学。不耻下问。 ",
            "道之将行也与，命也；道之将废也与，命也。",
            "学而不思则罔，思而不学则殆。",
            "温故而知新，可以为师矣。",
            "己所不欲，勿施于人。"
    )
    val list = arrayListOf<SentenceBean>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData()
        initView()
    }

    private fun initData() {
        for (i in items) {
            val sen = SentenceBean(i, 0)
            list.add(sen)
        }
    }

    private fun initView() {
        val adapter = MainAdapter(R.layout.item_main, list)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mRecyclerView.adapter = adapter

        adapter.setOnItemClickListener { adapter, view, position ->
            if (list[position].type == 0) {
                view.mText.setTextColor(resources.getColor(R.color.red))
                list[position].type = 1
            } else {
                view.mText.setTextColor(resources.getColor(R.color.black))
                list[position].type = 0
            }
        }
    }
}
