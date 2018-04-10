package com.home.recyclerviewexample

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import kotlinx.android.synthetic.main.item_main.view.*

/**
 * Created by pc on 2018/4/10.
 */
class MainAdapter(val layoutResId: Int, val list: List<SentenceBean>) : BaseQuickAdapter<SentenceBean, BaseViewHolder>(layoutResId, list) {
    override fun convert(helper: BaseViewHolder?, item: SentenceBean?) {
        if (helper != null) {
            if (item != null) {
                helper.setText(R.id.mText, item.sentence)
            }
        }
    }

}