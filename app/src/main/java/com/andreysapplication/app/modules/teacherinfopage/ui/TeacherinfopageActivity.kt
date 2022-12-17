package com.andreysapplication.app.modules.teacherinfopage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreysapplication.app.R
import com.andreysapplication.app.appcomponents.base.BaseActivity
import com.andreysapplication.app.databinding.ActivityTeacherinfopageBinding
import com.andreysapplication.app.modules.menupage.ui.MenupageActivity
import com.andreysapplication.app.modules.teacherinfopage.`data`.viewmodel.TeacherinfopageVM
import kotlin.String
import kotlin.Unit

class TeacherinfopageActivity :
    BaseActivity<ActivityTeacherinfopageBinding>(R.layout.activity_teacherinfopage) {
  private val viewModel: TeacherinfopageVM by viewModels<TeacherinfopageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.teacherinfopageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearItem2.setOnClickListener {
      val destIntent = MenupageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TEACHERINFOPAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TeacherinfopageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
