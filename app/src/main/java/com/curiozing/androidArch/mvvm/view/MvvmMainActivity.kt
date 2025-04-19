package com.curiozing.androidArch.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.curiozing.androidArch.R
import com.curiozing.androidArch.mvvm.viewModel.MainViewModel

class MvvmMainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm_main)
        viewModel.callApi()
    }
}