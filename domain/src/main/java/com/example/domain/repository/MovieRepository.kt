package com.example.domain.repository

import com.example.domain.model.Movie
import dagger.hilt.DefineComponent
import dagger.hilt.android.components.ActivityComponent
import io.reactivex.Flowable
import io.reactivex.Single
import kotlinx.coroutines.flow.Flow

@DefineComponent(parent = ActivityComponent::class)
interface MovieRepository {
    fun getSearchMovies(
        query: String
    ): Flowable<List<Movie>>

    fun getSearchMoviesFlow(
        query: String
    ): Flow<List<Movie>>

    fun getLocalSearchMovies(
        query: String
    ): Flowable<List<Movie>>

    fun getRemoteSearchMovies(
        query: String
    ): Single<List<Movie>>

    fun getPagingMovies(
        query: String,
        offset: Int
    ): Single<List<Movie>>
}