package com.example.food2forkkmm.domain.usecase

import com.example.food2forkkmm.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetMovieUseCase : KoinComponent{
    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(movieId: Int) = repository.getMovie(movieId = movieId)
}