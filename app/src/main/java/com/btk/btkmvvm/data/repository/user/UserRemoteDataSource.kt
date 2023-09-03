package com.btk.btkmvvm.data.repository.user

import com.btk.btkmvvm.data.model.UserResponse
import com.btk.btkmvvm.util.constants.Resource
import com.btk.btkmvvm.util.network.PlaceHolderApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(private val api: PlaceHolderApi) : UserDataSource {

    override suspend fun getAllUsers(): Flow<Resource<UserResponse>> = flow {
        try {
            emit(Resource.Loading())
            val userList = api.getAllUsers()
            emit(Resource.Success(userList.body()))
        } catch (e: Exception) {
            emit(Resource.Error(e))
            e.printStackTrace()
        }
    }
}