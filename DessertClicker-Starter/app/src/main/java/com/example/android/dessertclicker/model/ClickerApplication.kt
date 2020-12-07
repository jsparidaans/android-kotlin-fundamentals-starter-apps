package com.example.android.dessertclicker.model

import android.app.Application
import timber.log.Timber

class ClickerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}