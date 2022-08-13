package com.example.domain.usecase.movie

import com.example.domain.model.Movie
import com.example.domain.repository.MovieRepository
import io.reactivex.Flowable
import javax.inject.Inject

class GetLocalMoviesUseCase @Inject constructor(private val repository: MovieRepository) {
    fun excute(
        query: String,
    ): Flowable<List<Movie>> = repository.getSearchMovies(query)

    operator fun invoke(
        query: String,
    ): Flowable<List<Movie>> = repository.getSearchMovies(query)
}