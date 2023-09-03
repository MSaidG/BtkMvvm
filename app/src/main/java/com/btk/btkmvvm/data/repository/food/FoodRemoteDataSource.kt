package com.btk.btkmvvm.data.repository.food

import android.util.Log
import com.btk.btkmvvm.data.model.FoodResponse
import com.btk.btkmvvm.util.constants.Resource
import com.btk.btkmvvm.util.network.PlaceHolderApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject


class FoodRemoteDataSource @Inject constructor(private val api: PlaceHolderApi) : FoodDataSource {


    override suspend fun getAllFoods(): Flow<Resource<FoodResponse>> = flow {
        try {
            emit(Resource.Loading())
            Log.e("CAGATAY","1")

            val list = api.getAllFoods()
            Log.e("CAGATAY", list.message())
            Log.e("CAGATAY","2")
            Log.e("CAGATAY", "body: " + Response.success(list.body()).toString())
            Log.e("CAGATAY", "code: " + Response.success(list.code()).toString())



            emit(Resource.Success(list.body()))
            Log.e("CAGATAY","3")

        } catch (e: Exception) {
            //emit(Resource.Error(e))
            e.printStackTrace()
            e.message?.let { Log.e("CAGATAY", "exception: " + it) }
            Log.e("CAGATAY","FOOD cant load the data!")

        }
    }

}