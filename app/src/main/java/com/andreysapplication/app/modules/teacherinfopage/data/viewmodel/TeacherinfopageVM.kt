package com.andreysapplication.app.modules.teacherinfopage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreysapplication.app.modules.teacherinfopage.`data`.model.TeacherinfopageModel
import org.koin.core.KoinComponent

class TeacherinfopageVM : ViewModel(), KoinComponent {
  val teacherinfopageModel: MutableLiveData<TeacherinfopageModel> =
      MutableLiveData(TeacherinfopageModel())

  var navArguments: Bundle? = null
}
