package com.btk.btkmvvm.ui.user

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.btk.btkmvvm.data.repository.user.UserRepository
import com.btk.btkmvvm.data.model.UserResponse
import com.btk.btkmvvm.ui.base.BaseViewModel
import com.btk.btkmvvm.util.constants.ResourceStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val userRepository: UserRepository) : BaseViewModel() {

    var allUsersLiveData = MutableLiveData<UserResponse>()

    init {
        getAllUsers()
    }

    fun getAllUsers() = viewModelScope.launch {
        userRepository.getAllUsers()
            .asLiveData(viewModelScope.coroutineContext).observeForever {
                when (it.status) {
                    ResourceStatus.LOADING -> {
                        loading.postValue(true)
                    }

                    ResourceStatus.SUCCESS -> {
                        allUsersLiveData.postValue(it.data!!)
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
