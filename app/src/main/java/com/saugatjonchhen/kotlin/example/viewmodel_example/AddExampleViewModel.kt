package com.saugatjonchhen.kotlin.example.viewmodel_example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class AddExampleViewModel(startingValue: Int) : ViewModel() {

    private var total = MutableLiveData<Int>()
    val totalData: LiveData<Int>
        get() = total

    val inputText = MutableLiveData<String>()

    init {
        total.value = startingValue
    }

    fun setTotal() {
        val intInput: Int = inputText.value!!.toInt()
        total.value = (total.value)?.plus(intInput)
    }

}