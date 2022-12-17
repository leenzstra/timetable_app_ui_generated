package com.andreysapplication.app.modules.menupage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.andreysapplication.app.modules.menupage.`data`.model.MenupageModel
import org.koin.core.KoinComponent

class MenupageVM : ViewModel(), KoinComponent {
  val menupageModel: MutableLiveData<MenupageModel> = MutableLiveData(MenupageModel())

  var navArguments: Bundle? = null
}
