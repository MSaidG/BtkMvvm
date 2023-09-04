package com.btk.btkmvvm.data.repository.food

import android.util.Log
import com.btk.btkmvvm.data.model.FoodModelItem
import com.btk.btkmvvm.data.model.FoodResponse
import com.btk.btkmvvm.util.constants.Resource
import com.btk.btkmvvm.util.constants.ResourceObject
import com.btk.btkmvvm.util.network.PlaceHolderApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject


class FoodRemoteDataSource @Inject constructor(private val api: PlaceHolderApi) : FoodDataSource {


    override suspend fun getAllFoods(): Flow<ResourceObject<FoodModelItem>> = flow {
        try {
            emit(ResourceObject.Loading())
            Log.e("CAGATAY FOOD REMOTE","1")

            val list = api.getAllFoods()
            Log.e("CAGATAY FOOD REMOTE", list.message().toString())
            Log.e("CAGATAY FOOD REMOTE","2")
            Log.e("CAGATAY FOOD REMOTE", "body: " + Response.success(list.body()).toString())
            Log.e("CAGATAY FOOD REMOTE", "code: " + Response.success(list.code()).toString())
            Log.e("CAGATAY FOOD REMOTE", "raw: " + Response.success(list.raw()).toString())



            emit(ResourceObject.Success(list.body()))
            Log.e("CAGATAY FOOD REMOTE","3")

        } catch (e: Exception) {
            //emit(Resource.Error(e))
            e.printStackTrace()
            e.message?.let { Log.e("CAGATAY FOOD REMOTE", "exception: $it") }
            Log.e("CAGATAY FOOD REMOTE","FOOD cant load the data!")

        }
    }

}