package com.btk.btkmvvm.data.repository.user

import com.btk.btkmvvm.data.model.UserResponse
import com.btk.btkmvvm.util.constants.Resource
import kotlinx.coroutines.flow.Flow

interface UserDataSource {
   suspend fun getAllUsers(): Flow<Resource<UserResponse>>
}

