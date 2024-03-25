package com.swanandvaidya.composedmovieapp.features.authentication.signup.domain

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SingUpViewModel : ViewModel() {

    private var _isValidEmail = MutableLiveData(false)
    val isEmailValid: LiveData<Boolean> = _isValidEmail

    fun isEmailValid(email: String) {
        if (email.length > 0) {
            _isValidEmail.value = true
        } else _isValidEmail.value = false
    }

}