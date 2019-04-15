package com.example.kotlinmvvmtraining

import android.app.Application
import com.example.kotlinmvvmtraining.di.myDiModule
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(applicationContext, myDiModule)
    }
}