package com.btk.btkmvvm.ui.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.btk.btkmvvm.R
import com.btk.btkmvvm.ui.comment.CommentViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FoodActivity : AppCompatActivity() {

    val viewModel: FoodViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        observeViewModel()
    }

    fun observeViewModel()
    {
        viewModel.apply {
            allFoodsLiveData.observe(this@FoodActivity, Observer {

                it.forEach {
                    Log.e("CAGATAY","FOOD it " +it.abbreviatedProductName)
                }

            })

            error.observe(this@FoodActivity, Observer {
                it.run {
                    Log.e("CAGATAY","FOOD it " +it.message)

                }
            })
            loading.observe(this@FoodActivity, Observer {
                Log.e("CAGATAY","FOOD it " +it.toString())

            })

        }
    }

}