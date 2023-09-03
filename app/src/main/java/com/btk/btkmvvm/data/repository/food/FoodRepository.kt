package com.btk.btkmvvm.data.repository.food

import com.btk.btkmvvm.data.model.FoodResponse
import com.btk.btkmvvm.util.constants.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FoodRepository @Inject constructor(private val foodDataSource: FoodDataSource){

    suspend  fun getAllFoods(): Flow<Resource<FoodResponse>> {
        return foodDataSource.getAllFoods()
    }

}