package com.curiozing.androidArch.cleanArch.ui.viewModel

import androidx.lifecycle.ViewModel
import com.curiozing.androidArch.cleanArch.domain.usecase.ImageUseCase

class CleanMainViewModel : ViewModel() {
    private val imageUseCase = ImageUseCase()

    fun downloadImage(){
        imageUseCase.downloadImage()
    }
}