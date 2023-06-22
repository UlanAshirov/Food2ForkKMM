package com.example.food2forkkmm.android

import android.app.Application
import com.example.food2forkkmm.android.di.appModule
import com.example.food2forkkmm.di.getSharedModule
import org.koin.core.context.startKoin

class Movie: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModule())
        }
    }
}