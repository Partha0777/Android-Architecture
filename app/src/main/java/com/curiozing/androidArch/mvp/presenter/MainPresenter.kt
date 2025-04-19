package com.curiozing.androidArch.mvp.presenter

class MainPresenter(private var mainView: MainView) {


    fun apiCall() {
        mainView.updateUI()
    }

    interface MainView {
        fun updateUI()
    }
}