package com.example.food2forkkmm.domain.repository

import com.example.food2forkkmm.domain.model.Movie

internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>
    suspend fun getMovie(movieId: Int): Movie
}