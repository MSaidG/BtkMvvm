package com.btk.btkmvvm.data.repository.comment

import com.btk.btkmvvm.data.model.CommentResponse
import com.btk.btkmvvm.data.model.UserResponse
import com.btk.btkmvvm.util.constants.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CommentRepository @Inject constructor(private  val commentDataSource: CommentDataSource){

    suspend  fun getAllComments(): Flow<Resource<CommentResponse>> {
        return commentDataSource.getAllComments()
    }
}