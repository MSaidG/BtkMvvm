package com.btk.btkmvvm.data.repository.user

import com.btk.btkmvvm.data.model.UserResponse
import com.btk.btkmvvm.util.constants.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private val userDataSource: UserDataSource)  {

    suspend fun getAllUsers(): Flow<Resource<UserResponse>> {
        return userDataSource.getAllUsers()
    }
}
