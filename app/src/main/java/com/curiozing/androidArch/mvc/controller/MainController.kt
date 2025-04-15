package com.curiozing.androidArch.mvc.controller

import com.curiozing.androidArch.mvc.view.MvcMainActivity

class MainController(var mvcMainActivity: MvcMainActivity) {

    fun callApi() {
        mvcMainActivity.updateUI()
    }
}