package com.btk.btkmvvm.data.repository.user

import android.util.Log
import com.btk.btkmvvm.data.model.UserResponse
import com.btk.btkmvvm.util.constants.Resource
import com.btk.btkmvvm.util.network.PlaceHolderApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(private val api: PlaceHolderApi) : UserDataSource {

    override suspend fun getAllUsers(): Flow<Resource<UserResponse>> = flow {
        try {
            emit(Resource.Loading())
            Log.e("CAGATAY USER REMOTE","1")

            val userList = api.getAllUsers()
            Log.e("CAGATAY USER REMOTE", userList.message().toString())
            Log.e("CAGATAY USER REMOTE","2")
            Log.e("CAGATAY USER REMOTE", "body: " + Response.success(userList.body()).toString())
            Log.e("CAGATAY USER REMOTE", "code: " + Response.success(userList.code()).toString())
            Log.e("CAGATAY USER REMOTE", "raw: " + Response.success(userList.raw()).toString())

            emit(Resource.Success(userList.body()))
            Log.e("CAGATAY USER REMOTE","3")


        } catch (e: Exception) {
            emit(Resource.Error(e))
            e.printStackTrace()
            e.message?.let { Log.e("CAGATAY USER REMOTE", "exception: $it") }
            Log.e("CAGATAY USER REMOTE","USER cant load the data!")
        }
    }
}