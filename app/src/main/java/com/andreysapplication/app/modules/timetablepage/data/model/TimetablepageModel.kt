package com.andreysapplication.app.modules.timetablepage.`data`.model

import com.andreysapplication.app.R
import com.andreysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TimetablepageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltext: String? = MyApp.getInstance().resources.getString(R.string.lbl_19_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextOne: String? = MyApp.getInstance().resources.getString(R.string.msg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadline: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt241222: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_12_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextThree: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextFour: String? = MyApp.getInstance().resources.getString(R.string.lbl6)

)
