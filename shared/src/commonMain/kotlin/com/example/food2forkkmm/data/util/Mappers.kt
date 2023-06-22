package com.example.food2forkkmm.data.util

import com.example.food2forkkmm.data.remote.MovieRemote
import com.example.food2forkkmm.domain.model.Movie

internal fun MovieRemote.toMovie() = Movie(
    id = id,
    title = title,
    description = overview,
    imageUrl = getImageUrl(posterImage),
    releaseDate = releaseDate
)

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500$posterImage"