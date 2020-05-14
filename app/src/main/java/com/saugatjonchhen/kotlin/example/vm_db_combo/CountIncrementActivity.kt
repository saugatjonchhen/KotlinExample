package com.saugatjonchhen.kotlin.example.vm_db_combo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.saugatjonchhen.kotlin.example.R
import com.saugatjonchhen.kotlin.example.databinding.ActivityCountIncrementBinding

class CountIncrementActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountIncrementBinding
    private lateinit var viewModel: CountViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_count_increment)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_count_increment)
        viewModel = ViewModelProvider(this).get(CountViewModel::class.java)
        binding.lifecycleOwner = this
        binding.myViewModel = viewModel
    }
}
