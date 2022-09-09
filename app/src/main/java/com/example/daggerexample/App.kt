package com.example.daggerexample

import android.app.Application
import dagger.android.DaggerApplication

class App: DaggerApplication() {

    val appComponent = DaggerApplicationComponent.create()

    override fun onCreate() {
        super.onCreate()
    }
}