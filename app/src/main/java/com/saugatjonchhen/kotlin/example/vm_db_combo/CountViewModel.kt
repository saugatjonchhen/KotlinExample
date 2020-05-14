package com.saugatjonchhen.kotlin.example.vm_db_combo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    private var count = MutableLiveData<Int>()

    val countData: LiveData<Int>
        get() = count

    init {
        count.value = 0
    }

    fun updateCount() {
        count.value = (count.value)?.plus(1)
    }


}