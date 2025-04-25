package com.curiozing.androidArch.cleanArch.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import com.curiozing.androidArch.R
import com.curiozing.androidArch.mvvm.viewModel.MainViewModel

class CleanArchMainActivity : AppCompatActivity() {

    val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clean_arch_main)
    }
}