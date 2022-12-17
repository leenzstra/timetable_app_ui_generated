package com.andreysapplication.app.modules.timetablepage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andreysapplication.app.R
import com.andreysapplication.app.databinding.RowTimetablepageBinding
import com.andreysapplication.app.modules.timetablepage.`data`.model.TimetablepageRowModel
import kotlin.Int
import kotlin.collections.List

class TimetablepageAdapter(
  var list: List<TimetablepageRowModel>
) : RecyclerView.Adapter<TimetablepageAdapter.RowTimetablepageVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTimetablepageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_timetablepage,parent,false)
    return RowTimetablepageVH(view)
  }

  override fun onBindViewHolder(holder: RowTimetablepageVH, position: Int) {
    val timetablepageRowModel = TimetablepageRowModel()
    // TODO uncomment following line after integration with data source
    // val timetablepageRowModel = list[position]
    holder.binding.timetablepageRowModel = timetablepageRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TimetablepageRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: TimetablepageRowModel
    ) {
    }
  }

  inner class RowTimetablepageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTimetablepageBinding = RowTimetablepageBinding.bind(itemView)
    init {
      binding.btn8Zero.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, TimetablepageRowModel())
      }
    }
  }
}
