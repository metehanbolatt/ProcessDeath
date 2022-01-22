package com.metehanbolat.processdeath

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var counter by mutableStateOf(savedStateHandle.get("counter") ?: 0)
        private set

    fun count() {
        counter++
        savedStateHandle.set("counter", counter)
    }
}