package com.metehanbolat.processdeath

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var counter by mutableStateOf(0)
        private set

    fun count() {
        counter++
    }
}