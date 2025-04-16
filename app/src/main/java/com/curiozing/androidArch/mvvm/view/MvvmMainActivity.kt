package com.curiozing.androidArch.mvvm.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.curiozing.androidArch.R

class MvvmMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvvm_main)
    }
}