package com.curiozing.androidArch.cleanArch.domain.entity

data class ImageEntity(
    val id: String,
    val url: String,
    val title: String,
    val description: String? = null,
    val width: Int,
    val height: Int,
    val createdAt: Long = System.currentTimeMillis(),
    val date: String
)