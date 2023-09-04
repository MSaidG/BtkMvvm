package com.btk.btkmvvm.ui.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.btk.btkmvvm.R
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
            allFoodsLiveData.observe(this@FoodActivity) {

                Log.e("CAGATAY", "AbbreciatedProductName: " + it.abbreviatedProductName)

            }

            error.observe(this@FoodActivity) {
                it.run {
                    Log.e("CAGATAY", "Error: $it")

                }
            }
            loading.observe(this@FoodActivity) {
                Log.e("CAGATAY", "Loading $it")

            }

        }
    }

}