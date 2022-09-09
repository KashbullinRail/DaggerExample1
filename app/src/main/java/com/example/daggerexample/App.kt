package com.example.daggerexample

import android.app.Application

class App: Application() {

    val appComponent = DaggerApplicationComponent.create()

    override fun onCreate() {
        super.onCreate()
    }
}