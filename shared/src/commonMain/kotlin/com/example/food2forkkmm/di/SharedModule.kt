package com.example.food2forkkmm.di

import com.example.food2forkkmm.data.remote.MovieService
import com.example.food2forkkmm.data.remote.RemoteDataSource
import com.example.food2forkkmm.data.repository.MovieRepositoryImpl
import com.example.food2forkkmm.domain.repository.MovieRepository
import com.example.food2forkkmm.domain.usecase.GetMovieUseCase
import com.example.food2forkkmm.domain.usecase.GetMoviesUseCase
import com.example.food2forkkmm.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val shareModules = listOf(domainModule, dataModule, utilModule)

fun getSharedModule() = shareModules