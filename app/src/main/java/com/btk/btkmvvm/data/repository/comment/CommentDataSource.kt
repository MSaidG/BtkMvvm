package com.btk.btkmvvm.data.repository.comment

import com.btk.btkmvvm.data.model.CommentResponse
import com.btk.btkmvvm.util.constants.Resource
import kotlinx.coroutines.flow.Flow

interface CommentDataSource {
  suspend  fun getAllComments(): Flow<Resource<CommentResponse>>
}
