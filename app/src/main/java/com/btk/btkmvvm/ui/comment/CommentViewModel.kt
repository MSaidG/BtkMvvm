package com.btk.btkmvvm.ui.comment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.btk.btkmvvm.data.model.CommentResponse
import com.btk.btkmvvm.data.repository.comment.CommentRepository
import com.btk.btkmvvm.ui.base.BaseViewModel
import com.btk.btkmvvm.util.constants.ResourceStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CommentViewModel @Inject constructor(private val commentRepository: CommentRepository)  : BaseViewModel() {

    var allCommentsLiveData = MutableLiveData<CommentResponse>()

    init {
        getAllComments()
    }

    fun getAllComments() = viewModelScope.launch {
        commentRepository.getAllComments()
            .asLiveData(viewModelScope.coroutineContext).observeForever {
                when (it.status) {
                    ResourceStatus.LOADING -> {
                        loading.postValue(true)
                    }

                    ResourceStatus.SUCCESS -> {
                        allCommentsLiveData.postValue(it.data!!)
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