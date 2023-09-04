package com.btk.btkmvvm.data.repository.food

import com.btk.btkmvvm.data.model.FoodModelItem
import com.btk.btkmvvm.data.model.FoodResponse
import com.btk.btkmvvm.util.constants.Resource
import com.btk.btkmvvm.util.constants.ResourceObject
import kotlinx.coroutines.flow.Flow

interface FoodDataSource {
    suspend  fun getAllFoods(): Flow<ResourceObject<FoodModelItem>>

}