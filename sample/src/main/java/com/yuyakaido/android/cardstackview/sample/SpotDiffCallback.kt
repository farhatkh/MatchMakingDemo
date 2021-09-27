package com.yuyakaido.android.cardstackview.sample

import androidx.recyclerview.widget.DiffUtil
import com.yuyakaido.android.cardstackview.sample.model.Root

class SpotDiffCallback(
        private val old: List<Root>,
        private val new: List<Root>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return old.size
    }

    override fun getNewListSize(): Int {
        return new.size
    }

    override fun areItemsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        return old[oldPosition].results[oldPosition].id == new[newPosition].results[oldPosition].id
    }

    override fun areContentsTheSame(oldPosition: Int, newPosition: Int): Boolean {
        return old[oldPosition] == new[newPosition]
    }

}
