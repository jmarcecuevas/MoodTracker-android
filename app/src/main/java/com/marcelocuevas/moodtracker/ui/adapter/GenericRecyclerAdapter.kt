package com.marcelocuevas.moodtracker.ui.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marcelocuevas.moodtracker.domain.GenericDTO

abstract class GenericRecyclerAdapter<VH: GenericRecyclerAdapter.GenericViewHolder<T>,
        T: GenericDTO>(val context: Context?): RecyclerView.Adapter<VH>() {

    var items: List<T>? = emptyList()

    fun loadItems(newItems: List<T>?) {
        items = newItems
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH = getHolder(parent)

    override fun getItemCount(): Int = items?.count() ?: 0

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(items?.get(position))

    protected abstract fun getHolder(parent: ViewGroup): VH


    // Generic ViewHolder
    abstract class GenericViewHolder<T: GenericDTO>(itemView: View):
                         RecyclerView.ViewHolder(itemView) {

        abstract fun bind(item: T?)
    }
}