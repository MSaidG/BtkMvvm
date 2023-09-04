package com.btk.btkmvvm.util.network

import com.btk.btkmvvm.data.model.CommentResponse
import com.btk.btkmvvm.data.model.FoodModelItem
import com.btk.btkmvvm.data.model.FoodResponse
import com.btk.btkmvvm.data.model.UserResponse
import retrofit2.Response
import retrofit2.http.GET

interface PlaceHolderApi{
    @GET("users")
    suspend fun getAllUsers() : Response<UserResponse>

    @GET("comments")
    suspend fun getAllComments() : Response<CommentResponse>

    // 3017620422003
    @GET("api/v3/product/3017620422003")
    suspend fun getAllFoods() : Response<FoodModelItem>


}
