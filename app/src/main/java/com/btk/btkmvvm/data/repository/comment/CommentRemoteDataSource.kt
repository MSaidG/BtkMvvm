package com.btk.btkmvvm.data.repository.comment

import com.btk.btkmvvm.data.model.CommentResponse
import com.btk.btkmvvm.util.constants.Resource
import com.btk.btkmvvm.util.network.PlaceHolderApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class CommentRemoteDataSource @Inject constructor(private val api: PlaceHolderApi)  : CommentDataSource {

    override suspend fun getAllComments(): Flow<Resource<CommentResponse>> = flow {
        try {
            emit(Resource.Loading())
            val list = api.getAllComments()
            emit(Resource.Success(list.body()))
        } catch (e: Exception) {
            emit(Resource.Error(e))
            e.printStackTrace()
        }
    }
}