package com.example.food2forkkmm.data.repository

import com.example.food2forkkmm.data.remote.RemoteDataSource
import com.example.food2forkkmm.data.util.toMovie
import com.example.food2forkkmm.domain.model.Movie
import com.example.food2forkkmm.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
) : MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie> =
        remoteDataSource.getMovies(page = page).results.map { it.toMovie() }

    override suspend fun getMovie(movieId: Int): Movie =
        remoteDataSource.getMovie(movieId = movieId).toMovie()
}