package com.saugatjonchhen.kotlin.example.viewmodel_example

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class AddViewModelFactory(private var startingValue: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(AddExampleViewModel::class.java))
            return AddExampleViewModel(startingValue) as T
        throw IllegalArgumentException("Unknown View Model Class")
    }
}