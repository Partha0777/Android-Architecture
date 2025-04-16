package com.curiozing.androidArch.mvc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.curiozing.androidArch.R
import com.curiozing.androidArch.mvc.controller.MainController

class MvcMainActivity : AppCompatActivity() {

    private lateinit var mainController: MainController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc_main)
        mainController = MainController(this)
    }

    fun updateUI(){

    }
}