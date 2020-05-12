package com.saugatjonchhen.kotlin.example.viewmodel_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.saugatjonchhen.kotlin.example.R
import com.saugatjonchhen.kotlin.example.databinding.ActivityViewModelExampleBinding

class ViewModelExampleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewModelExampleBinding
    private lateinit var viewModel: AddExampleViewModel
    private lateinit var viewModelFactory: AddViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_view_model_example)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_model_example)

        viewModelFactory = AddViewModelFactory(100)
        viewModel = ViewModelProvider(this, viewModelFactory).get(AddExampleViewModel::class.java)

        binding.textResult.text = viewModel.getCurrentValue().toString()

        binding.btnAdd.setOnClickListener {
            binding.apply {
                val value = etValue.text.toString().toInt()
                viewModel.setTotal(value)
                textResult.text = viewModel.getCurrentValue().toString()
            }

        }

    }
}
