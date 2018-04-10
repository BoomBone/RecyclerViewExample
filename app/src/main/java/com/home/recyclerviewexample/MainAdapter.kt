package com.home.recyclerviewexample

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

/**
 * Created by pc on 2018/4/10.
 */
class MainAdapter(val layoutResId: Int, val list: List<String>) : BaseQuickAdapter<String, BaseViewHolder>(layoutResId, list) {
    override fun convert(helper: BaseViewHolder?, item: String?) {
        if (helper != null) {
            helper.setText(R.id.mText,item)
        }
    }
}