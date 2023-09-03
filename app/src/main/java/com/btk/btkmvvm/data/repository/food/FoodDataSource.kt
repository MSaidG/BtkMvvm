package com.btk.btkmvvm.data.repository.food

import com.btk.btkmvvm.data.model.FoodResponse
import com.btk.btkmvvm.util.constants.Resource
import kotlinx.coroutines.flow.Flow

interface FoodDataSource {
    suspend  fun getAllFoods(): Flow<Resource<FoodResponse>>

}