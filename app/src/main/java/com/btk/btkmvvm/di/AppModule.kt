package com.btk.btkmvvm.di

import com.btk.btkmvvm.util.FakeDataUtils
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideFakeDataUtils(): FakeDataUtils {
        return FakeDataUtils
    }
}