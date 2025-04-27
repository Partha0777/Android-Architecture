package com.curiozing.androidArch.cleanArch.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.curiozing.androidArch.R
import com.curiozing.androidArch.cleanArch.ui.viewModel.CleanMainViewModel

class CleanArchMainActivity : AppCompatActivity() {

    val cleanMainViewModel: CleanMainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clean_arch_main)
        cleanMainViewModel.downloadImage()
    }
}