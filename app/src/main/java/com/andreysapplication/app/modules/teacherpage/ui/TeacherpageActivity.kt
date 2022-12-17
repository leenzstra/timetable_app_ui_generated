package com.andreysapplication.app.modules.teacherpage.ui

import androidx.activity.viewModels
import com.andreysapplication.app.R
import com.andreysapplication.app.appcomponents.base.BaseActivity
import com.andreysapplication.app.databinding.ActivityTeacherpageBinding
import com.andreysapplication.app.modules.menupage.ui.MenupageActivity
import com.andreysapplication.app.modules.teacherinfopage.ui.TeacherinfopageActivity
import com.andreysapplication.app.modules.teacherpage.`data`.viewmodel.TeacherpageVM
import kotlin.String
import kotlin.Unit

class TeacherpageActivity : BaseActivity<ActivityTeacherpageBinding>(R.layout.activity_teacherpage)
    {
  private val viewModel: TeacherpageVM by viewModels<TeacherpageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.teacherpageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearItem2.setOnClickListener {
      val destIntent = MenupageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTeacherCard4.setOnClickListener {
      val destIntent = TeacherinfopageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTeacherCard.setOnClickListener {
      val destIntent = TeacherinfopageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTeacherCard3.setOnClickListener {
      val destIntent = TeacherinfopageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.viewCreatefromfra.setOnClickListener {
      val destIntent = TeacherinfopageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameStackcreatefromfra.setOnClickListener {
      val destIntent = TeacherinfopageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTeacherCard1.setOnClickListener {
      val destIntent = TeacherinfopageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTeacherCard5.setOnClickListener {
      val destIntent = TeacherinfopageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTeacherCard2.setOnClickListener {
      val destIntent = TeacherinfopageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TEACHERPAGE_ACTIVITY"

  }
}
