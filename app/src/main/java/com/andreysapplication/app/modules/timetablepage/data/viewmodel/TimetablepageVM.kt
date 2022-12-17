package com.andreysapplication.app.modules.timetablepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreysapplication.app.modules.timetablepage.`data`.model.TimetablepageModel
import com.andreysapplication.app.modules.timetablepage.`data`.model.TimetablepageRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TimetablepageVM : ViewModel(), KoinComponent {
  val timetablepageModel: MutableLiveData<TimetablepageModel> =
      MutableLiveData(TimetablepageModel())

  var navArguments: Bundle? = null

  val timetablepageList: MutableLiveData<MutableList<TimetablepageRowModel>> =
      MutableLiveData(mutableListOf())
}
