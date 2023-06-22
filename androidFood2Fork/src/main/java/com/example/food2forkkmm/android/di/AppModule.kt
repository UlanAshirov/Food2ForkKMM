package com.example.food2forkkmm.android.di

import com.example.food2forkkmm.android.detail.DetailViewModel
import com.example.food2forkkmm.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}