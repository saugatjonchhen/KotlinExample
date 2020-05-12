package com.saugatjonchhen.kotlin.example.viewmodel_example

import androidx.lifecycle.ViewModel

class AddExampleViewModel(startingValue: Int) : ViewModel() {

    private var value = 0

    init {
        value = startingValue
    }

    fun getCurrentValue(): Int {
        return value
    }

    fun setTotal(addedValue: Int) {
        value += addedValue
    }

}