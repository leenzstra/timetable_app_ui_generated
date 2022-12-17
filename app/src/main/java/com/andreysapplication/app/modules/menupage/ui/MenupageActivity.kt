package com.andreysapplication.app.modules.menupage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.andreysapplication.app.R
import com.andreysapplication.app.appcomponents.base.BaseActivity
import com.andreysapplication.app.databinding.ActivityMenupageBinding
import com.andreysapplication.app.modules.menupage.`data`.viewmodel.MenupageVM
import kotlin.String
import kotlin.Unit

class MenupageActivity : BaseActivity<ActivityMenupageBinding>(R.layout.activity_menupage) {
  private val viewModel: MenupageVM by viewModels<MenupageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menupageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENUPAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MenupageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
