package com.btk.btkmvvm.util.constants

import com.btk.btkmvvm.data.model.FoodModelItem

sealed class ResourceObject<FoodModelItem> (
    val data: FoodModelItem?,
    val throwable: Throwable?,
    val status: ResourceStatus
    ) {
        class Loading:
            ResourceObject<FoodModelItem>(
                null, null,
                ResourceStatus.LOADING
            )

        class Success(data: FoodModelItem?) :
            ResourceObject<FoodModelItem>(
                data, null,
                ResourceStatus.SUCCESS
            )

        class Error(exception: Exception) : ResourceObject<FoodModelItem>(null, exception, ResourceStatus.ERROR)
}
