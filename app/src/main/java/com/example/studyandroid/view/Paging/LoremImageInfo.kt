package com.example.studyandroid.view.Paging

import com.google.gson.annotations.SerializedName

data class LoremImageInfo(
    val id: String,
    val author: String,
    val width: Int,
    val height: Int,
    val url: String,
    @SerializedName("download_url") val downloadUrl: String
)
