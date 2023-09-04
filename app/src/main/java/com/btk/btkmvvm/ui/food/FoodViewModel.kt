package com.btk.btkmvvm.ui.food

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.btk.btkmvvm.data.model.FoodModelItem
import com.btk.btkmvvm.data.model.FoodResponse
import com.btk.btkmvvm.data.repository.food.FoodRepository
import com.btk.btkmvvm.ui.base.BaseViewModel
import com.btk.btkmvvm.util.constants.ResourceStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FoodViewModel @Inject constructor(private val foodRepository: FoodRepository)  : BaseViewModel()  {

    var allFoodsLiveData = MutableLiveData<FoodModelItem>()

    init {
        getAllFoods()
    }

    private fun getAllFoods() = viewModelScope.launch {
        foodRepository.getAllFoods()
            .asLiveData(viewModelScope.coroutineContext).observeForever {
                when (it.status) {
                    ResourceStatus.LOADING -> {
                        loading.postValue(true)
                    }

                    ResourceStatus.SUCCESS -> {
                        allFoodsLiveData.postValue(it.data!!)
                        loading.postValue(false)
                    }

                    ResourceStatus.ERROR -> {

                        error.postValue(it.throwable!!)
                        loading.postValue(false)
                    }
                }
            }
    }
}