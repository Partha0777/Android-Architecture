package com.curiozing.androidArch.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.curiozing.androidArch.R
import com.curiozing.androidArch.mvvm.viewModel.MainViewModel

class MvvmMainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }
}