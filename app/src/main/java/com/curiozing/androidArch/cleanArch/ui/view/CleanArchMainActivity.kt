package com.curiozing.androidArch.cleanArch.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.curiozing.androidArch.R
import com.curiozing.androidArch.cleanArch.ui.viewModel.CleanMainViewModel
import com.curiozing.androidArch.mvvm.viewModel.MainViewModel

class CleanArchMainActivity : AppCompatActivity() {

    val mainViewModel: CleanMainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clean_arch_main)
        mainViewModel.callApi()
    }
}