package com.example.daggerexample

import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {

    fun getLog(): String{
        return "I am from Dagger-2"
    }

}