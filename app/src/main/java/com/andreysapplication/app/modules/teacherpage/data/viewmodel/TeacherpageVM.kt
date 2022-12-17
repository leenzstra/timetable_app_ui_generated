package com.andreysapplication.app.modules.teacherpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreysapplication.app.modules.teacherpage.`data`.model.TeacherpageModel
import org.koin.core.KoinComponent

class TeacherpageVM : ViewModel(), KoinComponent {
  val teacherpageModel: MutableLiveData<TeacherpageModel> = MutableLiveData(TeacherpageModel())

  var navArguments: Bundle? = null
}
