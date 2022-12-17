package com.andreysapplication.app.modules.timetablepage.ui

import android.view.View
import androidx.activity.viewModels
import com.andreysapplication.app.R
import com.andreysapplication.app.appcomponents.base.BaseActivity
import com.andreysapplication.app.databinding.ActivityTimetablepageBinding
import com.andreysapplication.app.modules.menupage.ui.MenupageActivity
import com.andreysapplication.app.modules.timetablepage.`data`.model.TimetablepageRowModel
import com.andreysapplication.app.modules.timetablepage.`data`.viewmodel.TimetablepageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TimetablepageActivity :
    BaseActivity<ActivityTimetablepageBinding>(R.layout.activity_timetablepage) {
  private val viewModel: TimetablepageVM by viewModels<TimetablepageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val timetablepageAdapter =
    TimetablepageAdapter(viewModel.timetablepageList.value?:mutableListOf())
    binding.recyclerTimetablepage.adapter = timetablepageAdapter
    timetablepageAdapter.setOnItemClickListener(
    object : TimetablepageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TimetablepageRowModel) {
        onClickRecyclerTimetablepage(view, position, item)
      }
    }
    )
    viewModel.timetablepageList.observe(this) {
      timetablepageAdapter.updateData(it)
    }
    binding.timetablepageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearItem2.setOnClickListener {
      val destIntent = MenupageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerTimetablepage(
    view: View,
    position: Int,
    item: TimetablepageRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TIMETABLEPAGE_ACTIVITY"

  }
}
