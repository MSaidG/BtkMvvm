package com.btk.btkmvvm.ui.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.btk.btkmvvm.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val mainActivityViewModel : UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        observeViewModel()
    }

    fun observeViewModel()
    {

        mainActivityViewModel.apply {
            allUsersLiveData.observe(this@MainActivity, Observer {

                it.forEach {
                    Log.e("CAGATAY","USER it " +it.name)
                }

            })

            error.observe(this@MainActivity, Observer {
                it.run {
                    Log.e("CAGATAY","USER it " +it.message)
                }
            })
            loading.observe(this@MainActivity, Observer {
                Log.e("CAGATAY","USER it " +it.toString())
            })

        }
    }

    fun observeViewModel2()
    {

        mainActivityViewModel.apply {
            allUsersLiveData.observe(this@MainActivity, Observer {

                it.forEach {
                    Log.e("CAGATAY","it " +it.name)
                }

            })

            error.observe(this@MainActivity, Observer {
                it.run {
                    Log.e("CAGATAY","it " +it.message)
                }
            })
            loading.observe(this@MainActivity, Observer {
                Log.e("CAGATAY","it " +it.toString())
            })

        }
    }

}
