package com.example.studyandroid.model

import android.content.Context
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.studyandroid.MyDataStore
import com.example.studyandroid.view.Paging.LoremImageInfo
import com.example.studyandroid.view.Paging.LoremPicsumDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Repository @Inject constructor(private val remoteServiceHelper: RemoteServiceHelper, private val context: Context) {
    suspend fun getHeroes() = remoteServiceHelper.getHeroes()
    fun getLoremImages(limit: Int): Flow<PagingData<LoremImageInfo>> {
        return Pager(
            config = PagingConfig(pageSize = limit, enablePlaceholders = false),
            pagingSourceFactory = { LoremPicsumDataSource(remoteServiceHelper, limit) }
        ).flow
    }

    fun getMyDataStore() = MyDataStore.getInstance(context)
}