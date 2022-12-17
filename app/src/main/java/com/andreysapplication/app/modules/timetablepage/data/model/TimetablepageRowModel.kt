package com.andreysapplication.app.modules.timetablepage.`data`.model

import com.andreysapplication.app.R
import com.andreysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TimetablepageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOneOne: String? = MyApp.getInstance().resources.getString(R.string.msg2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTag: String? = MyApp.getInstance().resources.getString(R.string.lbl2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwoHundredOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_201)

)
