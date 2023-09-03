package com.btk.btkmvvm.ui.comment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.btk.btkmvvm.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CommentActivity : AppCompatActivity() {

    val viewModel: CommentViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment)
        observeViewModel()
    }

    fun observeViewModel()
    {
        viewModel.apply {
            allCommentsLiveData.observe(this@CommentActivity, Observer {

                it.forEach {
                    Log.e("CAGATAY","COMMENT it " +it.name)
                }

            })

            error.observe(this@CommentActivity, Observer {
                it.run {
                    Log.e("CAGATAY","COMMENT it " +it.message)

                }
            })
            loading.observe(this@CommentActivity, Observer {
                Log.e("CAGATAY","COMMENT it " +it.toString())

            })

        }
    }
}