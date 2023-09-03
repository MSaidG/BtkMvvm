package com.btk.btkmvvm.di

import com.btk.btkmvvm.data.repository.comment.CommentDataSource
import com.btk.btkmvvm.data.repository.comment.CommentRemoteDataSource
import com.btk.btkmvvm.data.repository.food.FoodDataSource
import com.btk.btkmvvm.data.repository.food.FoodRemoteDataSource
import com.btk.btkmvvm.data.repository.user.UserDataSource
import com.btk.btkmvvm.data.repository.user.UserRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun bindUserDataSource(
        dataSource: UserRemoteDataSource
    ): UserDataSource

    @Binds
    @Singleton
    abstract fun bindCommentDataSource(
        dataSource: CommentRemoteDataSource
    ): CommentDataSource

    @Binds
    @Singleton
    abstract fun bindFoodDataSource(
        dataSource: FoodRemoteDataSource
    ): FoodDataSource
}
