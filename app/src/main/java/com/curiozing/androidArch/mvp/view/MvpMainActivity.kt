package com.curiozing.androidArch.mvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.curiozing.androidArch.R
import com.curiozing.androidArch.mvp.presenter.MainPresenter

class MvpMainActivity : AppCompatActivity(), MainPresenter.MainView {


    lateinit var mainPresenter: MainPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp_main)
        mainPresenter = MainPresenter(this)
    }

    override fun updateUI() {}
}